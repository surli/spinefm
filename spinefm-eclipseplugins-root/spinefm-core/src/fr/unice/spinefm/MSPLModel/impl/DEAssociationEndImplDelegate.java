package fr.unice.spinefm.MSPLModel.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import fr.unice.spinefm.roassaltracer.RoassalTracer;

public class DEAssociationEndImplDelegate extends DEAssociationEndImpl {
	
	private static int counter = 0;
	
	public DEAssociationEndImplDelegate() {
		super();
		if (this.getId() == null || this.getId().equals("")) {
			this.setId("DEAEnd_"+(counter++));
		}
	}
	
	public void roassalTrace(Map<String, List<String>> buffer) {
		if (this.getId() == null || this.getId().equals("")) {
			this.setId("DEAEnd_"+(counter++));
		}
		if (!buffer.containsKey(RoassalTracer.ROASSAL_DEAEND))
			buffer.put(RoassalTracer.ROASSAL_DEAEND, new ArrayList<String>());
		RoassalTracer.callRoassalTracer(this.getLinkMultiplicity(), buffer);
		
		String trace = RoassalTracer.ROASSAL_DEAEND+" id=\""+this.id+"\" apply_on=["+this.apply_on.getId()+"] linkMultiplicity=["+this.linkMultiplicity.getId()+"]";
		buffer.get(RoassalTracer.ROASSAL_DEAEND).add(trace);
	}
	
	@Override
	public String toString() {
		return "DEAEnd "+this.getId();
	}
}
