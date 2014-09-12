package fr.unice.spinefm.utils.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Test;

import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelFactory;
import fr.unice.spinefm.ActionModel.UserActionModel.UserCreateContext;
import fr.unice.spinefm.HistoryModel.HistoryModelFactory;
import fr.unice.spinefm.HistoryModel.Past;
import fr.unice.spinefm.ProcessModel.ContextManager;
import fr.unice.spinefm.ProcessModel.ProcessModelFactory;
import fr.unice.spinefm.ProcessModel.impl.ContextManagerImplDelegate;
import fr.unice.spinefm.fmengine.FMSpineFMAdapter;
import fr.unice.spinefm.fmengine.familiar.FMLSpineFMAdapter;
import fr.unice.spinefm.fmengine.familiar.FamiliarInterpreter;
import fr.unice.spinefm.utils.PersistModel;
import fr.unice.spinefm.utils.Utils;

public class TestUtils {

	@Test
	public void testMatchListWorksWhenFirstListIsIncludedInSecondOneWithSameOrder() {
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new ArrayList<String>();
		
		l1.add("bar");
		l1.add("machin");
		
		l2.add("toto");
		l2.add("bar");
		l2.add("machin");
		l2.add("truc");
		l2.add("bidule");
		
		assertTrue(Utils.matchList(l1, l2));
	}
	
	@Test
	public void testMatchListWorksWhenSecondListIsIncludedInFirstOneWithSameOrder() {
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new ArrayList<String>();
		
		l2.add("bar");
		l2.add("machin");
		
		l1.add("toto");
		l1.add("bar");
		l1.add("machin");
		l1.add("truc");
		l1.add("bidule");
		
		assertTrue(Utils.matchList(l1, l2));
	}
	
	@Test
	public void testMatchListWorksWhenFirstListIsIncludedInSecondOneWithNoOrder() {
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new ArrayList<String>();
		
		l1.add("truc");
		l1.add("toto");
		l1.add("bar");
		
		l2.add("toto");
		l2.add("bar");
		l2.add("machin");
		l2.add("truc");
		l2.add("bidule");
		
		assertTrue(Utils.matchList(l1, l2));
	}
	
	@Test
	public void testMatchListWorksWhenSecondListIsIncludedInFirstOneWithNoOrder() {
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new ArrayList<String>();
		
		l1.add("truc");
		l1.add("toto");
		l1.add("bar");
		
		l2.add("toto");
		l2.add("bar");
		l2.add("machin");
		l2.add("truc");
		l2.add("bidule");
		
		assertTrue(Utils.matchList(l2, l1));
	}
	
	@Test
	public void testMatchListFailsWhenAtListOneElementIsNotPresentInTheSecondList() {
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new ArrayList<String>();
		
		l1.add("truc");
		l1.add("foo");
		l1.add("bar");
		
		l2.add("toto");
		l2.add("bar");
		l2.add("machin");
		l2.add("truc");
		l2.add("bidule");
		
		assertFalse(Utils.matchList(l2, l1));
	}
	
	@Test
	public void contextManagerPersistencyWorks() throws IOException {
		ContextManager cm = ProcessModelFactory.eINSTANCE.createContextManager();
		Past p = HistoryModelFactory.eINSTANCE.createPast();
		cm.setPast(p);
		UserCreateContext ucc = UserActionModelFactory.eINSTANCE.createUserCreateContext();
		ucc.initManualAction(cm);
		FMSpineFMAdapter fma = new FMLSpineFMAdapter(FamiliarInterpreter.getInstance());
		cm.setFma(fma);
		
		PersistModel.saveModel("/tmp", "testPersistency.xml", cm);
		assertTrue(cm instanceof ContextManagerImplDelegate);
	}
}
