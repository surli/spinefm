package fr.unice.spinefm.MSPLModel.impl.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fr.unice.spinefm.MSPLModel.MSPLModelFactory;
import fr.unice.spinefm.MSPLModel.MultiplicityElement;

public class TestMultiplicityElement {

	private MultiplicityElement me;
	
	@Before
	public void setUp()  {
		this.me = MSPLModelFactory.eINSTANCE.createMultiplicityElement();
	}
	
	@Test
	public void testNumberInRangeIsAccepted() {
		me.setLowerBound(1);
		me.setUpperBound(-1);
		assertTrue("Number 10 is between 1 and -1 : ", me.respectBoundaries(10));
	}
	
	@Test
	public void testNumberLowerThanLowerBoundIsRejected() {
		me.setLowerBound(1);
		me.setUpperBound(-1);
		assertFalse("Number 0 is not between between 1 and -1 : ", me.respectBoundaries(0));
	}
	
	@Test
	public void testNumberHigherThanUpperBoundIsRejected() {
		me.setLowerBound(0);
		me.setUpperBound(1);
		assertFalse("Number 10 is not between 0 and 1 : ", me.respectBoundaries(10));
	}
	
	@Test
	public void testNumberEqualsWithLowerBoundIsAccepted() {
		me.setLowerBound(1);
		me.setUpperBound(-1);
		assertTrue("Number 1 is between 1 and -1 : ", me.respectBoundaries(1));
	}
	
	@Test
	public void testNumberEqualsWithUpperBoundIsAccepted() {
		me.setLowerBound(0);
		me.setUpperBound(1);
		assertTrue("Number 1 is between 0 and 1 : ", me.respectBoundaries(1));
	}
	
	@Test
	public void testUpperBoundNotBoundAcceptIntegerMaxValue() {
		me.setLowerBound(0);
		me.setUpperBound(-1);
		assertTrue("Number "+Integer.MAX_VALUE+" is between 0 and -1 : ", me.respectBoundaries(Integer.MAX_VALUE));
	}
	
	@Test
	public void testZeroIsAnAcceptedLowerBound() {
		me.setLowerBound(0);
		me.setUpperBound(-1);
		assertTrue("Number 0 is between 0 and -1 : ", me.respectBoundaries(0));
	}
	
	@Test
	public void testMethodIsExactlyOneReturnsTrueIfLowerAndUpperBoundsAreOne() {
		me.setLowerBound(1);
		me.setUpperBound(1);
		assertTrue("With upper bound 1 and lower bound 1, multiplicity is exactly 1", me.isExactlyOne());
	}
	
	@Test
	public void testMethodIsExactlyOneReturnsFalseIfLowerBoundIsNotOne() {
		me.setLowerBound(0);
		me.setUpperBound(1);
		assertFalse("With upper bound 1 and lower bound 0, multiplicity is not exactly 1", me.isExactlyOne());
	}
	
	@Test
	public void testMethodIsExactlyOneReturnsFalseIfUpperBoundIsNotOne() {
		me.setLowerBound(1);
		me.setUpperBound(-1);
		assertFalse("With upper bound -1 and lower bound 1, multiplicity is not exactly 1", me.isExactlyOne());
	}
	
	@Test
	public void testLowerThanUpperBoundIsRespectedWithLowerValue() {
		me.setLowerBound(0);
		me.setUpperBound(1);
		assertTrue("Number 0 is lower than 1 : ", me.isLowerThanUpperBound(0));
	}
	
	@Test
	public void testLowerThanUpperBoundIsNotRespectedWithEqualValue() {
		me.setLowerBound(0);
		me.setUpperBound(1);
		assertFalse("Number 1 is not lower than 1 : ", me.isLowerThanUpperBound(1));
	}
	
	@Test
	public void testLowerThanUpperBoundIsRespectedUnboundedUpperBound() {
		me.setLowerBound(0);
		me.setUpperBound(-1);
		assertTrue("Number 1000 is lower than upper bound -1 : ", me.isLowerThanUpperBound(1000));
	}
}
