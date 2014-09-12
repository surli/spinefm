package fr.unice.spinefm.MSPLModel.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import fr.unice.spinefm.MSPLModel.DEAssociation;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.MSPLModel.exceptions.DEAssociationNotFoundException;
import fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException;
import fr.unice.spinefm.roassaltracer.RoassalTracer;

public class MultipleSoftwareProductLineImplDelegate extends
		MultipleSoftwareProductLineImpl {

	@Override
	public EList<DEAssociation> getValidAssociationsForDEs(DomainElement source, DomainElement target) throws DEAssociationNotFoundException {
		EList<DEAssociation> result = new BasicEList<DEAssociation>();
		for (DEAssociation dea : this.getAssociations()) {
			if (dea.isLinkBetweenDEs(source, target)) {
				result.add(dea);
			}
		}
		if (result.isEmpty())
			throw new DEAssociationNotFoundException("No association found with source : "+source+" and target : "+target);
		return result;
	}
	
	@Override
	public DomainElement getDomainElementByName(String name) throws DomainElementNotFoundException {
		for (DomainElement de : this.domainElements)
			if (de.getId().toLowerCase().equals(name.toLowerCase()))
				return de;
		throw new DomainElementNotFoundException("DomainElement with the name '"+name+"' not found.");
	}
	
	@Override
	public DEAssociation getAssociationByName(String name) throws DEAssociationNotFoundException {
		for (DEAssociation asso : this.getAssociations()) {
			if (asso.getId().equals(name)) {
				return asso;
			}
		}
		throw new DEAssociationNotFoundException("Association with name '"+name+"' cannot be found.");
	}
	
	public void roassalTrace(Map<String, List<String>> buffer) {
		for (DomainElement de : this.getDomainElements())
			RoassalTracer.callRoassalTracer(de, buffer);
		for (DEAssociation dea : this.getAssociations())
			RoassalTracer.callRoassalTracer(dea, buffer);
	}
	
}
