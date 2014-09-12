package fr.unice.spinefm.ConfigurationModel.impl;

import fr.unice.spinefm.ConfigurationModel.Configuration;
import fr.unice.spinefm.ConfigurationModel.exceptions.ConfigNotFoundException;

public class LinkImplDelegate extends LinkImpl {

	@Override
	public Configuration getAssociatedConfiguration(Configuration conf) throws ConfigNotFoundException {
		if (this.getSource().equals(conf))
			return this.getTarget();
		if (this.getTarget().equals(conf))
			return this.getSource();
		throw new ConfigNotFoundException("We can't retrieve associated configuration of "+conf+" in the link "+this);
	}
	
	@Override
	public String toString() {
		return "Link "+this.getId();
	}
}
