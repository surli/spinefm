package fr.unice.spinefm.MSPLModel.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM;
import fr.unice.spinefm.FMModel.exceptions.FeatureNotFoundException;
import fr.unice.spinefm.RFModel.ConfigurationState;
import fr.unice.spinefm.RFModel.RestrictionFunction;
import fr.unice.spinefm.RFModel.Rule;
import fr.unice.spinefm.MSPLModel.DEAssociationEnd;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException;
import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;
import fr.unice.spinefm.exceptions.IllegalCallException;
import fr.unice.spinefm.roassaltracer.RoassalTracer;

public class DEAssociationImplDelegate extends DEAssociationImpl {

	private static Logger log = Logger.getLogger(DEAssociationImplDelegate.class);
	
	@Override
	public boolean isLinkBetweenDEs(DomainElement de1, DomainElement de2) {
		DomainElement deExtr1 = this.getExtremity().get(0).getApply_on();
		DomainElement deExtr2 = this.getExtremity().get(1).getApply_on();
		
		return (deExtr1.equals(de1) && deExtr2.equals(de2)) || (deExtr2.equals(de1) && (deExtr1.equals(de2)));
	}
	
	@Override
	public DEAssociationEnd getOppositeExtremity(DomainElement source) throws DomainElementNotFoundException {
		DEAssociationEnd deExtr1 = this.getExtremity().get(0);
		DEAssociationEnd deExtr2 = this.getExtremity().get(1);
		
		if (source.equals(deExtr1.getApply_on())) {
			return deExtr2;
		} else if (source.equals(deExtr2.getApply_on())) {
			return deExtr1;
		} else {
			throw new DomainElementNotFoundException("Opposite extremity of "+this+" not found for the given DE :"+source);
		}
	}
	
	@Override 
	public DEAssociationEnd getExtremityOfDE(DomainElement de) throws DomainElementNotFoundException {
		DEAssociationEnd deExtr1 = this.getExtremity().get(0);
		DEAssociationEnd deExtr2 = this.getExtremity().get(1);
		
		if (de.equals(deExtr1.getApply_on())) {
			return deExtr1;
		} else if (de.equals(deExtr2.getApply_on())) {
			return deExtr2;
		} else {
			throw new DomainElementNotFoundException("Extremity of "+this+" not found for the given DE :"+de);
		}
	}
	
	@Override
	public EList<ActionOnFM> computeActionsToDo(ConfigurationProcessStep CPSSource, ConfigurationProcessStep CPSTarget) throws IllegalCallException  {
		EList<ActionOnFM> result = new BasicEList<ActionOnFM>();
		log.debug("Compute actions to do between "+CPSSource.getId()+" and "+CPSTarget.getId()+" for asso "+this);
		ConfigurationState sourceState;
		sourceState = CPSSource.getState();
		log.debug("CPS State to compute actions : "+sourceState);
		for (RestrictionFunction rf : this.getRestrictionFunction()) {
			if (rf.getSource().equals(CPSSource.getDomainElement()) && rf.getTarget().equals(CPSTarget.getDomainElement())) {
				for (Rule r : rf.getRules()) {
					if (r.getState().isIncludedIn(sourceState)) {
						result.add(r.getAction());
					}
				}
			}
		}
		return result;
	}
	
	@Override
	public void createAndAssociateInverseAssociation() throws FeatureNotFoundException {
		List<RestrictionFunction> rfInv = new ArrayList<RestrictionFunction>();
		for (RestrictionFunction rf : this.getRestrictionFunction()) {
			rfInv.add(rf.createAndAssociateInverseRestFunc());
		}
		this.getRestrictionFunction().addAll(rfInv);
	}
	
	public void roassalTrace(Map<String, List<String>> buffer) {
		if (!buffer.containsKey(RoassalTracer.ROASSAL_DEA))
			buffer.put(RoassalTracer.ROASSAL_DEA,new ArrayList<String>());
		
		String restFunc;
		
		if (this.getRestrictionFunction().isEmpty())
			restFunc = "restrictionFunctions=[]";
		else {
			restFunc = "restrictionFunctions=[";
			for (RestrictionFunction rf : this.getRestrictionFunction()) {
				restFunc += rf.getId()+",";
				RoassalTracer.callRoassalTracer(rf, buffer);
			}
			restFunc = restFunc.substring(0, restFunc.length()-1)+"]";
		}
		RoassalTracer.callRoassalTracer(this.getExtremity().get(0), buffer);
		RoassalTracer.callRoassalTracer(this.getExtremity().get(1), buffer);
		
		String trace = RoassalTracer.ROASSAL_DEA+" id=\""+this.id+"\" source=["+this.getExtremity().get(0).getId()+"] target=["+this.getExtremity().get(1).getId()+"] "+restFunc;
		buffer.get(RoassalTracer.ROASSAL_DEA).add(trace);
	}
	
	@Override
	public String toString() {
		return "DEA "+this.getId();
	}
}
