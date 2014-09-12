package fr.unice.spinefm.MSPLModel.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import fr.unice.spinefm.roassaltracer.RoassalTracer;

public class MultiplicityElementImplDelegate extends MultiplicityElementImpl {

	private static int counter = 0;
	
	public MultiplicityElementImplDelegate() {
		super();
		this.setId("ME_"+counter++);
	}
	
	@Override
	public boolean respectBoundaries(int value) {
		int maxUpperBound = (this.getUpperBound() == -1) ? Integer.MAX_VALUE : this.getUpperBound();
		return (value >= this.getLowerBound() && value <= maxUpperBound);
	}
	
	@Override
	public boolean isLowerThanUpperBound(int value) {
		int maxUpperBound = (this.getUpperBound() == -1) ? Integer.MAX_VALUE : this.getUpperBound();
		return (value < maxUpperBound);
	}

	@Override
	public boolean isExactlyOne() {
		return (this.getLowerBound() == 1 && this.getUpperBound() == 1);
	}
	
	public void roassalTrace(Map<String, List<String>> buffer) {
		if (!buffer.containsKey(RoassalTracer.ROASSAL_ME))
			buffer.put(RoassalTracer.ROASSAL_ME,new ArrayList<String>());
		String trace = RoassalTracer.ROASSAL_ME+" id=\""+this.id+"\" lowerBound="+this.lowerBound+" upperBound="+this.upperBound;
		buffer.get(RoassalTracer.ROASSAL_ME).add(trace);
	}
	
	@Override
	public String toString() {
		return "ME "+this.getId();
	}
}
