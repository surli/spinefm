package fr.unice.spinefm.MSPLModel.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import fr.unice.spinefm.MSPLModel.DEAssociation;
import fr.unice.spinefm.roassaltracer.RoassalTracer;
import fr.unice.spinefm.utils.Debug;

public class DomainElementImplDelegate extends DomainElementImpl {

	private static Logger log = Logger.getLogger(DomainElementImplDelegate.class);
	
	public void roassalTrace(Map<String, List<String>> buffer) {
		if (!buffer.containsKey(RoassalTracer.ROASSAL_DE))
			buffer.put(RoassalTracer.ROASSAL_DE,new ArrayList<String>());
		RoassalTracer.callRoassalTracer(this.getMultiplicityElement(), buffer);
		String belongs;
		
		if (this.getBelongs_to().isEmpty())
			belongs = "belongs_to=[]";
		else {
			belongs = "belongs_to=[";
			for (DEAssociation dea : this.getBelongs_to())
				belongs += dea.getId()+",";
			belongs = belongs.substring(0, belongs.length()-1)+"]";
		}
		RoassalTracer.callRoassalTracer(this.getRefers_on(), buffer);
		
		String trace = RoassalTracer.ROASSAL_DE+" id=\""+this.id+"\" refers_on=["+this.refers_on.getId()+"] MultiplicityElement=["+this.multiplicityElement.getId()+"] "+belongs;
		buffer.get(RoassalTracer.ROASSAL_DE).add(trace);
	}
	
	@Override
	public String toString() {
		return "DE "+this.getId();
	}
}
