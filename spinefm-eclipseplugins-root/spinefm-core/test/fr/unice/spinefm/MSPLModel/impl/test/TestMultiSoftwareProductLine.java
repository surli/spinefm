package fr.unice.spinefm.MSPLModel.impl.test;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.MSPLModel.MSPLModelFactory;
import fr.unice.spinefm.MSPLModel.MSPLModelPackage;
import fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine;
import fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException;
import fr.unice.spinefm.MSPLModel.impl.MultipleSoftwareProductLineImpl;

public class TestMultiSoftwareProductLine {

	@Test
	public void testGetDomainElementByName() throws DomainElementNotFoundException {
		MultipleSoftwareProductLine mspl = MSPLModelFactory.eINSTANCE.createMultipleSoftwareProductLine();
		
		DomainElement de1 = MSPLModelFactory.eINSTANCE.createDomainElement();
		DomainElement de2 = MSPLModelFactory.eINSTANCE.createDomainElement();
		DomainElement de3 = MSPLModelFactory.eINSTANCE.createDomainElement();
		
		de1.setId("foo");
		de2.setId("toto");
		de3.setId("bar");
		
		EList<DomainElement> des = new BasicEList<DomainElement>();
		des.add(de1);
		des.add(de2);
		des.add(de3);
		((MultipleSoftwareProductLineImpl)mspl).eSet(MSPLModelPackage.MULTIPLE_SOFTWARE_PRODUCT_LINE__DOMAIN_ELEMENTS, des);
		
		DomainElement deToto = mspl.getDomainElementByName("toto");
		assertEquals(de2, deToto);
	}
}
