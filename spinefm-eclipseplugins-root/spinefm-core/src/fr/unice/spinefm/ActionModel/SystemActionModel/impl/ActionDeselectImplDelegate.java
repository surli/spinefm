package fr.unice.spinefm.ActionModel.SystemActionModel.impl;

import org.apache.log4j.Logger;
import fr.unice.spinefm.fmengine.exceptions.FMEngineException;

public class ActionDeselectImplDelegate extends ActionDeselectImpl {
	private static Logger log = Logger.getLogger(ActionDeselectImplDelegate.class);
	
	protected ActionDeselectImplDelegate() {
		super();
	}
	
	@Override
	public void apply() throws FMEngineException {
		log.debug("Apply action Deselect from step "+this.getStep());
		if (!this.getCps().alreadyHaveAction(this)) {
				this.getFma().deselectFeatureInConfiguration(this.getFeature(), this.getCps().getConfName());
				this.getCps().recordActionDone(this, this.getFeature());
				this.getCps().captureImplicitActions(this, this.getStep());
			}
	}
	
	@Override
	public void undo() {
		log.debug("Undo action Deselect from step "+this.getStep());
		try {
			this.fma.unselectFeatureInConfiguration(this.feature, this.getCps().getConfName());
			this.getCps().setFeatureUnselected(this.feature);
		} catch (FMEngineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String toString() {
		return "Action Deselect ["+this.getFm().getId()+" : "+this.getFeature().getName()+" | Type : "+this.getType()+"] "+this.getStep();
	}
	
	/*public void roassalTrace(Map<String, List<String>> buffer) {
		if (!buffer.containsKey(RoassalTracer.ROASSAL_AD))
			buffer.put(RoassalTracer.ROASSAL_AD,new ArrayList<String>());
		String trace = RoassalTracer.ROASSAL_AD+" id=\""+this.id+"\" feature=["+this.feature.getId()+"] fm=["+this.fm.getId()+"]";
		buffer.get(RoassalTracer.ROASSAL_AD).add(trace);
	}
	
	public String toString() {
		return "[-] "+this.fm.getId()+"."+this.feature.getId();
	}*/

}
