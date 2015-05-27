package fr.unice.spinefm.restfunc;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import fr.unice.spinefm.ConfigurationModel.ConfigurationModelFactory;
import fr.unice.spinefm.RFModel.ConfigurationState;
import fr.unice.spinefm.FMModel.Constraint;
import fr.unice.spinefm.FMModel.FMModelFactory;
import fr.unice.spinefm.FMModel.Feature;
import fr.unice.spinefm.FMModel.FeatureModel;
import fr.unice.spinefm.FMModel.exceptions.FeatureNotFoundException;
import fr.unice.spinefm.MSPLModel.DEAssociation;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.MSPLModel.MSPLModelFactory;
import fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine;
import fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException;
import fr.unice.spinefm.ActionModel.ActionModelFactory;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionDeselect;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionSelect;
import fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelFactory;
import fr.unice.spinefm.ActionModel.UserActionModel.impl.UserInitImplDelegate;
import fr.unice.spinefm.RFModel.RFModelFactory;
import fr.unice.spinefm.RFModel.RestrictionFunction;
import fr.unice.spinefm.RFModel.Rule;
import fr.unice.spinefm.ProcessModel.ProcessModelFactory;
import fr.unice.spinefm.restfunc.exceptions.RestrictionFunctionParserException;
import fr.unice.spinefm.restfunc.exceptions.RuleFactoryException;
import fr.unice.spinefm.restfuncDSL.*;
import fr.unice.spinefm.utils.Debug;

public class RuleFactory {
	
	private static Logger log = Logger.getLogger(RuleFactory.class);
	
	public static void createRuleAndPutItInModel(RestrictionFunction rf, DEAssociation dea, String rfPathName, RestrictionFunctionParser rfp, MultipleSoftwareProductLine mspl) throws RestrictionFunctionParserException, FeatureNotFoundException, RuleFactoryException, DomainElementNotFoundException {
		RestFunc restfunc = rfp.fileParser(rfPathName,rf.getId());
		
		if (restfunc != null) {
			RuleFactory.createRules(restfunc, rf, dea, mspl);
		}
		dea.getRestrictionFunction().add(rf);
	}

	// TODO: manage when an ID already exist !
	public static void createRules(RestFunc restfunc, RestrictionFunction rf, DEAssociation dea, MultipleSoftwareProductLine mspl) throws FeatureNotFoundException, RuleFactoryException, DomainElementNotFoundException {
		for (RuleString rs : restfunc.getRules()) {
			String deSource = restfunc.getInit().getSource().getDeSrc();
			String deTarget = restfunc.getInit().getTarget().getDeTarget();
			DomainElement source = mspl.getDomainElementByName(deSource);
			DomainElement target = mspl.getDomainElementByName(deTarget);
			rf.setSource(source);
			rf.setTarget(target);
			FeatureModel fmLeftPart = source.getRefers_on();
			FeatureModel fmRightPart = target.getRefers_on();
			

			String ruleID = rs.getId();

			LeftPart lp = rs.getLeft();

			RightPart rp = rs.getRight();
			//ActionFeature aof = (ActionOnFeature)rp.getAction();
			FeatureNamed fnrp = rp.getFeature();

			if (fnrp instanceof SingleFeature) {
				Feature faction = getFeatureFromFeatureNamed(fmRightPart, fnrp,rf);

				ActionOnFM action = createActionGivenRPAndFeature(rp, faction);
				action.setFm(fmRightPart);

				ConfigurationState cs = RFModelFactory.eINSTANCE.createConfigurationState();
				cs.setFm(fmLeftPart);

				for (GroupFeature gflp : lp.getFeatures()) {
					for (FeatureNamed fnlp : gflp.getFeature()) {
						if (fnlp instanceof SingleFeature) {
							Feature flp = getFeatureFromFeatureNamed(fmLeftPart, fnlp,rf);
							addFeatureInCS(flp, cs, gflp);
						} else if (fnlp instanceof StarFeature) {
							Feature flp = getFeatureFromFeatureNamed(fmLeftPart, fnlp,rf);
							for (Feature fc : flp.getAllChildrenFeatures()) {
								addFeatureInCS(fc, cs, gflp);
							}
						} else {
							throw new RuleFactoryException("Error in generating rule: try to use a variable in left part which is not binding in right part.");
						}
					}
				}
				createRule(rf, ruleID, -1, action, cs);
			} else if (fnrp instanceof StarFeature) {
				Feature frp = getFeatureFromFeatureNamed(fmRightPart, fnrp,rf);
				int counter = 0;
				for (Feature faction : frp.getAllChildrenFeatures()) {
					ActionOnFM action = createActionGivenRPAndFeature(rp, faction);
					action.setFm(fmRightPart);

					ConfigurationState cs = RFModelFactory.eINSTANCE.createConfigurationState();
					cs.setFm(fmLeftPart);

					for (GroupFeature gflp : lp.getFeatures()) {
						for (FeatureNamed fnlp : gflp.getFeature()) {
							if (fnlp instanceof SingleFeature) {
								Feature flp = getFeatureFromFeatureNamed(fmLeftPart, fnlp,rf);
								addFeatureInCS(flp, cs, gflp);
							} else if (fnlp instanceof StarFeature) {
								Feature flp = getFeatureFromFeatureNamed(fmLeftPart, fnlp,rf);
								for (Feature fc : flp.getAllChildrenFeatures()) {
									addFeatureInCS(fc, cs, gflp);
								}
							} else {
								throw new RuleFactoryException("Error in generating rule: try to use a variable in left part which is not binding in right part.");
							}
						}
					}
					createRule(rf, ruleID, counter++, action, cs);
				}
			} else if (fnrp instanceof VariableFeature) {
				Feature frp = getFeatureFromFeatureNamed(fmRightPart, fnrp,rf);
				VariableFeature vfrp = (VariableFeature)fnrp;
				Variable vrp = vfrp.getVariable();

				GroupFeature gfvlp = null;
				VariableFeature vflp = null;
				List<Feature> selected = new ArrayList<Feature>();
				List<Feature> deselected = new ArrayList<Feature>();
				for (GroupFeature gflp : lp.getFeatures()) {
					for (FeatureNamed fnlp : gflp.getFeature()) {
						if (fnlp instanceof VariableFeature) {
							VariableFeature vf = (VariableFeature)fnlp;
							if (vf.getVariable().getId().equals(vrp.getId())) {
								vflp = vf;
								gfvlp = gflp;
							} else
								throw new RuleFactoryException("Error in generating rule: variable must be the same in right and left position.");
						} else if (fnlp instanceof SingleFeature) {
							Feature f = getFeatureFromFeatureNamed(fmLeftPart, fnlp,rf);
							if (State.valueOf(gflp.getState()) == State.SELECTED)
								selected.add(f);
							else
								deselected.add(f);
						} else if (fnlp instanceof StarFeature)
							throw new RuleFactoryException("Error in generating rule: the joker can't be used with a variable.");
					}
				}
				if (vflp == null)
					throw new RuleFactoryException("Error in generating rule: variable must be present both at right and left.");
				else {
					int counter = 0;
					Feature flp = getFeatureFromFeatureNamed(fmLeftPart, vflp, rf);
					for (Feature f : frp.getAllChildrenFeatures()) {
						for (Feature fl : flp.getAllChildrenFeatures()) {
							if (f.getName().equals(fl.getName())) {
								ActionOnFM action = createActionGivenRPAndFeature(rp, f);
								action.setFm(fmRightPart);

								ConfigurationState cs = RFModelFactory.eINSTANCE.createConfigurationState();
								cs.setFm(fmLeftPart);
								addFeatureInCS(fl, cs, gfvlp);
								cs.getDeselectedFeatures().addAll(deselected);
								cs.getSelectedFeatures().addAll(selected);
								createRule(rf, ruleID, counter++, action, cs);
							}
						}
					}
				}
			}
		}
	}
	
	private static ActionOnFM createActionGivenRPAndFeature(RightPart rp, Feature faction) {
		if (rp.getAction().equals("SELECT")) {
			ActionSelect actionS = SystemActionModelFactory.eINSTANCE.createActionSelect();
			actionS.setFeature(faction);
			return actionS;
		} else if (rp.getAction().equals("DESELECT"))  {
			ActionDeselect actionD = SystemActionModelFactory.eINSTANCE.createActionDeselect();
			actionD.setFeature(faction);
			return actionD;
		}
		return null;
	}
	
	private static void createRule(RestrictionFunction rf, String ruleID, int counter, ActionOnFM action, ConfigurationState cs) {
		Rule r = RFModelFactory.eINSTANCE.createRule();
		if (ruleID != null && !ruleID.equals("") && !ruleID.equals("null")) {
			if (counter != -1)
				r.setId(ruleID+counter);
			else
				r.setId(ruleID);
		}
		r.setAction(action);
		r.setState(cs);
		log.info("Création d'une règle : \t"+ruleID+" "+cs+" -> "+action);
		rf.getRules().add(r);
	}


	private static Feature getFeatureFromFeatureNamed(FeatureModel fm, FeatureNamed fn, RestrictionFunction rf) throws RuleFactoryException {
		Feature result = null;
		try {
			result = fm.getFeatureFromName(fn.getFeatureName());
		} catch(FeatureNotFoundException fnfe) {
			throw new RuleFactoryException("Error retrieving a feature from function "+rf+".\nOriginal error:"+fnfe.getMessage());
		}
		return result;
	}

	private static void addFeatureInCS(Feature f, ConfigurationState cs, GroupFeature gf) {
		if (State.valueOf(gf.getState()) == State.SELECTED) {
			cs.getSelectedFeatures().add(f);
		} else {
			cs.getDeselectedFeatures().add(f);
		}
	}
}
