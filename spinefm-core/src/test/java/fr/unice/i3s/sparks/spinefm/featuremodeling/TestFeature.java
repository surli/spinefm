package fr.unice.i3s.sparks.spinefm.featuremodeling;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by urli on 22/01/2016.
 */
public class TestFeature {

    @Test
    public void testTwoFeaturesWithTheSameNameAndNoGroupsAreEquals() {
        Feature f1 = new Feature("test");
        Feature f2 = new Feature("test");

        assertEquals("Features with the same name are not considered as equals: ",f1,f2);
    }

    @Test
    public void testTwoFeaturesWithDifferentNamesAndNoGroupsAreNotEquals() {
        Feature f1 = new Feature("test");
        Feature f2 = new Feature("Test");

        assertNotEquals("Feature with different names are considered as equals: ", f1, f2);
    }


}
