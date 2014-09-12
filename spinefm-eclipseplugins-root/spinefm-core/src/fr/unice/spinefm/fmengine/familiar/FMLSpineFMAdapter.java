package fr.unice.spinefm.fmengine.familiar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.xtext.example.mydsl.fML.FeatureEdgeKind;

import fr.familiar.experimental.FGroup;
import fr.familiar.interpreter.VariableNotExistingException;
import fr.familiar.parser.VariableAmbigousConflictException;
import fr.familiar.variable.BooleanVariable;
import fr.familiar.variable.FeatureModelVariable;
import fr.familiar.variable.FeatureVariable;
import fr.familiar.variable.VariabilityOperatorVariable;
import fr.familiar.variable.Variable;
import fr.unice.spinefm.ConfigurationModel.Configuration;
import fr.unice.spinefm.FMModel.Constraint;
import fr.unice.spinefm.FMModel.FMModelFactory;
import fr.unice.spinefm.FMModel.Feature;
import fr.unice.spinefm.FMModel.FeatureModel;
import fr.unice.spinefm.FMModel.Group;
import fr.unice.spinefm.FMModel.GroupState;
import fr.unice.spinefm.FMModel.exceptions.FeatureNotFoundException;
import fr.unice.spinefm.fmengine.FMSpineFMAdapter;
import fr.unice.spinefm.fmengine.SpecificInterpreter;
import fr.unice.spinefm.fmengine.exceptions.FMEngineException;
import fr.unice.spinefm.utils.Debug;
import gsd.synthesis.Expression;
import gsd.synthesis.FeatureNode;

/**
 * The implementation of FMSpineFMAdapter using the FAMILIAR specific interpreter.
 * @author Simon Urli
 *
 */
public class FMLSpineFMAdapter implements FMSpineFMAdapter {

	private FamiliarInterpreter sfi;
	private static Logger log = Logger.getLogger(FMLSpineFMAdapter.class);
	
	
	/**
	 * Constructor of this adapter take an instance of FamiliarInterpreter as argument
	 * @param sfi An initialized instance of FamiliarInterpreter
	 */
	public FMLSpineFMAdapter(FamiliarInterpreter sfi) {
		this.sfi = sfi;
	}
	
	@Override
	public void populateFeatureModel(FeatureModel fm) throws FMEngineException {
		this.populateFeatureModel(fm,fm.getId());
	}
	
	private Map<Feature,Group> sourceGroup;
	private Map<Group,Boolean> addedGroup;
	private Map<String,Feature> features;
	
	
	private void populateFeatureModel(FeatureModel fm, String var) throws FMEngineException {
		try {
			this.sourceGroup = new HashMap<Feature,Group>();
			this.features = new HashMap<String,Feature>();
			this.addedGroup = new HashMap<Group,Boolean>();
			
			FeatureModelVariable fmv =  this.sfi.getFMVariable(var);
			
			Set<FGroup> groups = fmv.getGroups();
			
			for (FGroup fgroup : groups) {
				GroupState gs = this.getGroupStateFromFGroup(fgroup);
				Group g = FMModelFactory.eINSTANCE.createGroup();
				g.setState(gs);
				for (FeatureNode<String> nodes : fgroup.getSources()) {
					String ftName = this.fName(nodes);
					Feature f = this.createOrGetFeature(fm,fmv.getFeature(ftName));
					g.getFeatures().add(f);
					sourceGroup.put(f, g);
					addedGroup.put(g,false);
					
				}
			}
			
			FeatureVariable fmvroot = fmv.root();
			Feature froot = this.createOrGetFeature(fm,fmvroot);
			fm.setRoot(froot);
			
			fm.addFeature(froot.getName(), froot, GroupState.MANDATORY);
			
			this.createFeaturesFromFamiliarRoot(fm, fmv, fmvroot, froot);
			
			Set<Expression<String>> constraints = fmv.getAllConstraints();
			
			for (Expression<String> expr : constraints) {
				Constraint c = FMModelFactory.eINSTANCE.createConstraint();
				c.setRule(expr.toString());
				fm.getConstraints().add(c);
			}
		} catch (VariableNotExistingException e) {
			throw new FMEngineException("VariableNotExistingException in FM  "+fm+" (var : "+var+") : "+e.getMessage());
		} catch (VariableAmbigousConflictException e) {
			throw new FMEngineException("VariableAmbigousConflictException: "+e.getMessage());
		}
	}
	
	private Feature createOrGetFeature(FeatureModel fm, FeatureVariable fvar) {
		Feature result;
		if (features.containsKey(fvar.name()))
			result = features.get(fvar.name());
		else {
			result = FMModelFactory.eINSTANCE.createFeature();
			result.setId(fm.getId()+"."+fvar.name());
			result.setName(fvar.name());
			features.put(fvar.name(),result);
		}
		return result;
	}
	
	private String fName(FeatureNode<String> node) {
		String s = "";
		for (String i : node.features())
			s = s.concat(i+"_");
		return s.substring(0, s.length()-1);
		
	}

	private GroupState getGroupStateFromFGroup(FGroup fg) {
		if (fg.isMutex())
			return GroupState.MUTEX;
		if (fg.isOr())
			return GroupState.OR;
		if (fg.isXor())
			return GroupState.ALTERNATIVE;
		// TODO: add unknown value
		return null;
	}

	private void createFeaturesFromFamiliarRoot(FeatureModel fm, FeatureModelVariable fmv, FeatureVariable fv, Feature f) {
		Set<Variable> sv = fv.children().getVars();

		for (Variable v : sv) {
			if (v.getType().equals("FEATURE")) {
				FeatureVariable fv2 = (FeatureVariable)v;
				Feature sfv = this.createOrGetFeature(fm,fv2);
				Group group;
				if (sourceGroup.containsKey(sfv)) {
					group = sourceGroup.get(sfv);
					if (!addedGroup.get(group)) {
						f.getChildren().add(group);
						addedGroup.put(group, true);
					}
				} else {
					group = FMModelFactory.eINSTANCE.createGroup();
					VariabilityOperatorVariable vop = fmv.getVOP(fv2.getFtName());
					group.setState(this.getGroupStateFromVOP(vop));
					group.getFeatures().add(sfv);
					f.getChildren().add(group);
				}
				fm.addFeature(sfv.getName(), sfv, group.getState());
				//groot.addFeature(sfv);
				this.createFeaturesFromFamiliarRoot(fm, fmv, fv2, sfv);
			}
		}
		//f.addGroup(groot);
	}
	
	private GroupState getGroupStateFromVOP(VariabilityOperatorVariable vop) {
		FeatureEdgeKind fek = vop.getFek();
		return GroupState.get(fek.getValue());
	}
	
	@Override
	public boolean isEquivalent(FeatureModel fm1, FeatureModel fm2) {
		
		try {
			String varBool = "eq_"+fm1.getId()+"_"+fm2.getId();
			String cmd;
			cmd = varBool+" = ("+fm1.getId()+" eq "+fm2.getId()+")";
			this.sfi.eval(cmd);
			Variable v = this.sfi.getVariable(varBool);
			BooleanVariable bv = (BooleanVariable)v;
			boolean ret = bv.isTrue();
			this.removeVariable(varBool);
			return ret;
		} catch (FMEngineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (VariableNotExistingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (VariableAmbigousConflictException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	private void removeVariable(String var) throws FMEngineException {
		String cmd = "rm "+var;
		this.sfi.eval(cmd);
	}
	
	private void createConfigurationFromFMName(String confName, String fmName) throws FMEngineException {
		String cmd = confName+" = configuration "+fmName+"\n";
		this.sfi.eval(cmd);
	}

	@Override
	public void createConfiguration(String name, FeatureModel fm) throws FMEngineException {
		this.createConfigurationFromFMName(name, fm.getId());
	}
	
	private Feature getFeatureFromNameWithExceptionToSynthetize(String s, FeatureModel fm) throws FMEngineException {
		try {
			Feature f = fm.getFeatureFromName(s);
			return f;
		} catch(FeatureNotFoundException e) {
			if (!s.contains("synth")) {
				throw new FMEngineException(e.getMessage());
			} else {
				log.warn(e.getMessage()+" but catched as FAMILIAR synthetise some features.");
				return null;
			}
		}
	}

	@Override
	public Set<Feature> getSelectedFeatures(String confName, FeatureModel fm) throws FMEngineException {
		Collection<String> features = this.sfi.getSelectedFeature(confName);
		log.info("Obtained selected features : "+features);
		Set<Feature> result = new HashSet<Feature>();
		for (String s : features) {
			Feature f = this.getFeatureFromNameWithExceptionToSynthetize(s, fm);
			if (f != null)
				result.add(f);
		}
		return result;
	}

	@Override
	public Set<Feature> getDeselectedFeatures(String confName, FeatureModel fm) throws FMEngineException {
		Collection<String> features = this.sfi.getDeselectedFeature(confName);
		log.info("Obtained deselected features : "+features);
		Set<Feature> result = new HashSet<Feature>();
		for (String s : features) {
			Feature f = this.getFeatureFromNameWithExceptionToSynthetize(s, fm);
			if (f != null)
				result.add(f);
		}
		return result;
	}
	
	@Override
	public Set<Feature> getUnselectedFeatures(String confName, FeatureModel fm) throws FMEngineException {
		Collection<String> features = this.sfi.getUnselectedFeature(confName);
		Set<Feature> result = new HashSet<Feature>();
		for (String s : features) {
			try {
				result.add(fm.getFeatureFromName(s));
			} catch (FeatureNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public void selectFeatureInConfiguration(Feature ft, String configuration) throws FMEngineException {
		String cmd = "select '"+ft.getName()+"' in "+configuration;
		this.sfi.eval(cmd);
	}
	
	@Override
	public void unselectFeatureInConfiguration(Feature ft, String configuration) throws FMEngineException {
		String cmd = "unselect '"+ft.getName()+"' in "+configuration;
		this.sfi.eval(cmd);
	}

	@Override
	public void deselectFeatureInConfiguration(Feature ft, String configuration) throws FMEngineException {
		String cmd = "deselect '"+ft.getName()+"' in "+configuration;
		this.sfi.eval(cmd);
	}
	
	@Override
	public SpecificInterpreter getSFI() {
		return this.sfi;
	}
	
	@Override
	public String getRepresentationOfFeatureModel(FeatureModel fm) {
		try {
			FeatureModelVariable fmv = this.sfi.getFMVariable(fm.getId());
			return "FM("+fmv.getSyntacticalRepresentation().replace('\n', ' ')+")";
		} catch (VariableNotExistingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (VariableAmbigousConflictException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

	@Override
	public void exitInterpreter() {
		String cmd = "exit";
		try {
			this.sfi.eval(cmd);
		} catch (FMEngineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addConstraint(Constraint c, String confName) throws FMEngineException {
		String temp_fm = "fm_"+confName+"_2";
		String cmd = temp_fm+" = asFM "+confName;
		this.sfi.eval(cmd);
		cmd = "addConstraint constraint ("+c.getRule()+") to "+temp_fm;
		this.sfi.eval(cmd);
		cmd = confName+" = configuration "+temp_fm;
		this.sfi.eval(cmd);
	}
	
	@Override
	public void removeConstraint(Constraint c, String confName) throws FMEngineException {
		String temp_fm = "fm_"+confName+"_2";
		String cmd = temp_fm+" = asFM "+confName;
		this.sfi.eval(cmd);
		cmd = "removeConstraint constraint ("+c.getRule()+") in "+temp_fm;
		this.sfi.eval(cmd);
		cmd = confName+" = configuration "+temp_fm;
		this.sfi.eval(cmd);
	}
	
	@Override
	public void copyElement(String elementSource, String elementTarget) throws FMEngineException {
		String cmd = elementTarget+" = copy "+elementSource;
		this.sfi.eval(cmd);
	}

	@Override
	public void cloneConfiguration(String confSourceName, String confTargetName) throws FMEngineException {
		String temp_fm = "fm_"+confSourceName;
		String cmd = temp_fm+" = asFM "+confSourceName;
		this.sfi.eval(cmd);
		this.createConfigurationFromFMName(confTargetName, temp_fm);
		this.removeVariable(temp_fm);
	}

	@Override
	public void destroyConfiguration(String clone_conf) throws FMEngineException {
		this.removeVariable(clone_conf);
	}

	@Override
	public boolean isValidConfiguration(String confID) throws FMEngineException {
		return this.getSFI().isValid(confID);
	}
}
