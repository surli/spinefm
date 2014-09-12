package fr.unice.spinefm.ActionModel.SystemActionModel.impl;

import org.apache.log4j.Logger;

import fr.unice.spinefm.ConfigurationModel.CompositeConfiguration;
import fr.unice.spinefm.ConfigurationModel.Configuration;
import fr.unice.spinefm.ConfigurationModel.ConfigurationModelFactory;
import fr.unice.spinefm.ConfigurationModel.Link;
import fr.unice.spinefm.ConfigurationModel.exceptions.InvalidAssociationException;
import fr.unice.spinefm.MSPLModel.DEAssociation;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException;

public class ActionLinkImplDelegate extends ActionLinkImpl {
	private static Logger log = Logger.getLogger(ActionLinkImplDelegate.class);

	private boolean isConfigurationsCompatibleWithAsso(Configuration confSource, Configuration confTarget, DEAssociation asso) {
		DomainElement de1 = confSource.getDomainElement();
		DomainElement de2 = confTarget.getDomainElement();
		return asso.isLinkBetweenDEs(de1, de2);
	}
	
	private boolean areCardinalitiesRespected(Configuration confSource, Configuration confTarget, DEAssociation asso) throws DomainElementNotFoundException {
		return confSource.canBeLinked(asso) && confTarget.canBeLinked(asso);
	}
	
	@Override
	public void apply() {
		log.debug("Apply action Link in step "+this.getStep());
		try {
			if (this.isConfigurationsCompatibleWithAsso(this.getConfSource(), this.getConfTarget(), this.getAsso()) && 
					this.areCardinalitiesRespected(this.getConfSource(), this.getConfTarget(), this.getAsso())) {
				
				DomainElement de1 = asso.getExtremity().get(0).getApply_on();
				Configuration confSource, confTarget;
				
				if (this.getConfSource().getDomainElement().equals(de1)) {
					confSource = this.getConfSource();
					confTarget = this.getConfTarget();
				} else {
					confSource = this.getConfTarget();
					confTarget = this.getConfSource();
				}
				CompositeConfiguration compConf = this.getContextManager().getGlobalContext().getConfiguration();
				
				Link l = ConfigurationModelFactory.eINSTANCE.createLink();
				l.setId("link_"+confSource.getId()+"-"+confTarget.getId());
				l.setRelatedAssociation(asso);
				l.setSource(confSource);
				l.setTarget(confTarget);
				confSource.getBelongs_to().add(l);
				confTarget.getBelongs_to().add(l);
				compConf.getLinks().add(l);
				this.setLink(l);
				log.debug("link created !");
			}
		} catch (DomainElementNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public void undo() {
		log.debug("Undo action Link in step "+this.getStep());
		Link l = this.getLink();
		CompositeConfiguration compConf = this.getContextManager().getGlobalContext().getConfiguration();
		compConf.getLinks().remove(l);
		this.getConfSource().getBelongs_to().remove(l);
		this.getConfTarget().getBelongs_to().remove(l);
	}
	
	public String toString() {
		return "Action Link [Source : "+this.getConfSource().getDescription()+" ; Target : "+this.getConfTarget().getDescription()+" Asso : "+this.getAsso().getId()+" | Type : "+this.getType()+"] "+this.getStep();
	}
}