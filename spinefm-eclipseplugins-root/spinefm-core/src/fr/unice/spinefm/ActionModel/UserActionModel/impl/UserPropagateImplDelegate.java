package fr.unice.spinefm.ActionModel.UserActionModel.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

import fr.unice.spinefm.ActionModel.ActionMode;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM;
import fr.unice.spinefm.ActionModel.SystemActionModel.SystemAction;
import fr.unice.spinefm.ActionModel.UserActionModel.UserAction;
import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelFactory;
import fr.unice.spinefm.ActionModel.UserActionModel.UserPropagate;
import fr.unice.spinefm.HistoryModel.Step;
import fr.unice.spinefm.MSPLModel.DEAssociation;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException;
import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;
import fr.unice.spinefm.ProcessModel.Context;
import fr.unice.spinefm.ProcessModel.exceptions.CPSNotFoundException;
import fr.unice.spinefm.ProcessModel.impl.ContextManagerImplDelegate;
import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.FatalSpineFMException;
import fr.unice.spinefm.exceptions.IllegalCallException;
import fr.unice.spinefm.fmengine.exceptions.FMEngineException;
import fr.unice.spinefm.stats.PropagationStep;

public class UserPropagateImplDelegate extends UserPropagateImpl {

	private static Logger log = Logger.getLogger(UserPropagateImplDelegate.class);
	
	// for statistics
	private int nbInternalActions = 0;
	private List<String> impactedDES = new ArrayList<String>();
	private Set<ConfigurationProcessStep> impactedCPS = new HashSet<ConfigurationProcessStep>();
	private Set<Context> impactedContexts = new HashSet<Context>();
	private boolean globalCtxImpacted = false;
	
	@Override
	public void apply() throws ElementNotFoundException, FatalSpineFMException {
		Long begin = Calendar.getInstance().getTimeInMillis();
		log.info("\n\n\t\t Apply user action Propagate from concept "+this.getDomainElementName()+" and context "+this.getContextID()+" \n\n");
		DomainElement de = this.getContextManager().getMspl().getDomainElementByName(this.getDomainElementName());
		Context ctx = this.getContextManager().getContextFromId(this.getContextID());
		ConfigurationProcessStep cps = ctx.getCPSOfDE(de);
		try {
			this.propagate(cps, ctx, this.getStep());
		} catch (FMEngineException e) {
			throw new FatalSpineFMException(e.getMessage(),this.getContextManager().getPast(),this.getStep());
		} catch (IllegalCallException e) {
			throw new FatalSpineFMException(e.getMessage(),this.getContextManager().getPast(),this.getStep());
		}
		Long end = Calendar.getInstance().getTimeInMillis();
		int nbTotalCtx = this.getContextManager().getLocalContexts().size()+1;
		int nbFinishedConfig = this.getContextManager().getGlobalContext().getConfiguration().getSubConfigurations().size();
		int nbLinks = this.getContextManager().getGlobalContext().getConfiguration().getLinks().size();
		
		PropagationStep ps = new PropagationStep(Calendar.getInstance().getTime(), (end-begin), de.toString(), this.nbInternalActions, nbTotalCtx, this.impactedContexts.size(), nbFinishedConfig, nbLinks, this.impactedCPS.size(), this.globalCtxImpacted, this.impactedDES);
		ContextManagerImplDelegate trueCM = (ContextManagerImplDelegate)this.getContextManager();
		trueCM.getStats().addPropStep(ps);
	}

	public void propagate(ConfigurationProcessStep CPS, Context context, Step step) throws FMEngineException, IllegalCallException, ElementNotFoundException {
		this.impactedContexts.add(context);
		log.info("Propagation launches on "+CPS.getId()+" in context :" +context.getId()+" ; Step : "+step);
		Collection<ConfigurationProcessStep> CPSSet;
		CPSSet = this.immediateRestriction(CPS, context, step);
		
		log.debug("CPSs to impact : "+CPSSet);
		this.recursePropagation(CPSSet, context, step);
	}

	private Collection<ConfigurationProcessStep> immediateRestriction(ConfigurationProcessStep CPSSource, Context ContextSource, Step step) throws FMEngineException, IllegalCallException, ElementNotFoundException {
		log.debug("Immediate restriction of CPS : "+CPSSource.getId());
		Set<ConfigurationProcessStep> result = new HashSet<ConfigurationProcessStep>();
		DomainElement deSource = CPSSource.getDomainElement();
		for (DEAssociation asso : deSource.getBelongs_to()) {
			DomainElement deTarget = asso.getOppositeExtremity(deSource).getApply_on();
			ConfigurationProcessStep CPSTarget;
			if (deTarget.getMultiplicityElement().isExactlyOne()) {
				globalCtxImpacted = true;
				CPSTarget = this.getContextManager().getGlobalContext().getCPSOfDE(deTarget);
				this.impactedContexts.add(this.getContextManager().getGlobalContext());
			} else {
				CPSTarget = ContextSource.getCPSOfDE(deTarget);
			}
			this.impactedCPS.add(CPSTarget);
			this.impactedDES.add(CPSTarget.getDomainElement().toString());
			EList<ActionOnFM> actionsToDo = asso.computeActionsToDo(CPSSource, CPSTarget);
			this.nbInternalActions += actionsToDo.size();
			for (ActionOnFM as : actionsToDo) {
				ActionOnFM aof = (ActionOnFM)as;
				if (!CPSTarget.alreadyHaveAction(aof)) {
					ActionOnFM action = aof.cloneAction();
					action.setStep(step);
					action.setType(ActionMode.AUTOMATIC);
					action.setCps(CPSTarget);
					action.setFma(this.getContextManager().getFma());
					action.apply();
					result.add(CPSTarget);
				}
			}
		}
		return result;
	}

	private void recursePropagation(Collection<ConfigurationProcessStep> CPSSet, Context context, Step step) throws FMEngineException, IllegalCallException, ElementNotFoundException {
		for (ConfigurationProcessStep cps : CPSSet) {
			DomainElement deSource = cps.getDomainElement();
			if (deSource.getMultiplicityElement().isExactlyOne() || context.equals(this.getContextManager().getGlobalContext())) {
				this.propagate(cps, this.getContextManager().getGlobalContext(), step);
				if (!deSource.getMultiplicityElement().isExactlyOne()) {
					for (Context c : this.getContextManager().getLocalContexts()) {
						this.impactedContexts.add(c);
						ConfigurationProcessStep cpsLocal = c.getCPSOfDE(deSource);
						c.mergeExternalCPS(cps, step, this.getContextManager());
						propagate(cpsLocal, c, step);
					}
				}
			} else {
				propagate(cps, context, step);
			}
		}
	}
	
	@Override
	public String getDescription() {
		return "Propagate actions from concept "+this.getDomainElementName();
	}
	
	@Override
	public UserAction cloneActionWithStringAttributes() {
		UserPropagate result = UserActionModelFactory.eINSTANCE.createUserPropagate();
		result.setContextID(this.transformContextNameToSave(this.getContextID()));
		result.setDomainElementName(this.getDomainElementName());
		return result;
	}
}
