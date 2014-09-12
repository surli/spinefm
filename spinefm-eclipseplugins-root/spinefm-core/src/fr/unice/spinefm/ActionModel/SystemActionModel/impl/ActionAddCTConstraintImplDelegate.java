package fr.unice.spinefm.ActionModel.SystemActionModel.impl;

import org.apache.log4j.Logger;
import fr.unice.spinefm.fmengine.exceptions.FMEngineException;

public class ActionAddCTConstraintImplDelegate extends
		ActionAddCTConstraintImpl {

	private static Logger log = Logger.getLogger(ActionAddCTConstraintImplDelegate.class);

	protected ActionAddCTConstraintImplDelegate() {
		super();
	}
	
	@Override
	public void apply() throws FMEngineException {
		log.debug("Apply action ADDCTConstraint from step "+this.getStep());
		if (!this.getCps().alreadyHaveAction(this)) {
				this.fma.addConstraint(this.constraint, this.getCps().getConfName());
				this.getCps().captureImplicitActions(this, this.getStep());
			}
	}
	
	@Override
	public void undo() {
		log.debug("Undo action ADDCTConstraint of step "+this.getStep());
		try {
			this.fma.removeConstraint(this.constraint, this.getCps().getConfName());
		} catch (FMEngineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String toString() {
		return "Action AddCTConstraint ["+this.getFm().getId()+" : "+this.getConstraint().getRule()+" | Type : "+this.getType()+"] "+this.getStep();
	}

	/*public void roassalTrace(Map<String, List<String>> buffer) {
		if (!buffer.containsKey(RoassalTracer.ROASSAL_ACTC))
			buffer.put(RoassalTracer.ROASSAL_ACTC,new ArrayList<String>());
		String trace = RoassalTracer.ROASSAL_ACTC+" id=\""+this.id+"\" feature=["+this.feature.getId()+"] fm=["+this.fm.getId()+"]";
		buffer.get(RoassalTracer.ROASSAL_ACTC).add(trace);
	}*/
}
