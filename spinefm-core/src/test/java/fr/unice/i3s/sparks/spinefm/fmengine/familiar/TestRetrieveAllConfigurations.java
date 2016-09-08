package fr.unice.i3s.sparks.spinefm.fmengine.familiar;

import fr.unice.i3s.sparks.spinefm.fmengine.exceptions.FMEngineException;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Created by urli on 06/09/2016.
 */
public class TestRetrieveAllConfigurations {

    @Test
    public void testRetrieveAllConfigurationForASimpleFM() throws FMEngineException {
        String fm = "a = FM(A: B;)";
        FamiliarInterpreter sfi = FamiliarInterpreter.getInstance();
        sfi.eval(fm);

        String createConfig = "configa = configuration a";
        sfi.eval(createConfig);

        Set<Set<String>> configurations = sfi.getAvailableConfigurations("configa");

        Set<Set<String>> expected = new HashSet<Set<String>>();

        Set<String> expectedConf = new HashSet<String>();
        expectedConf.add("A");
        expectedConf.add("B");

        expected.add(expectedConf);

        assertEquals(configurations, expected);
    }

    @Test
    public void testRetrieveAllConfigurationForAFMWithAUniqueOption() throws FMEngineException {
        String fm = "a = FM(A: [B];)";
        FamiliarInterpreter sfi = FamiliarInterpreter.getInstance();
        sfi.eval(fm);

        String createConfig = "configa = configuration a";
        sfi.eval(createConfig);

        Set<Set<String>> configurations = sfi.getAvailableConfigurations("configa");

        Set<Set<String>> expected = new HashSet<Set<String>>();

        Set<String> firstExpectedConf = new HashSet<String>();
        firstExpectedConf.add("A");
        expected.add(firstExpectedConf);

        Set<String> secondExpectedConf = new HashSet<String>();
        secondExpectedConf.add("A");
        secondExpectedConf.add("B");
        expected.add(secondExpectedConf);

        assertEquals(configurations, expected);
    }

    @Test
    public void testRetrieveAllConfigurationForAFMWithMultipleOptionsButUniqueHierarchy() throws FMEngineException {
        String fm = "a = FM(A: [B] [C] [D];)";
        FamiliarInterpreter sfi = FamiliarInterpreter.getInstance();
        sfi.eval(fm);

        String createConfig = "configa = configuration a";
        sfi.eval(createConfig);

        Set<Set<String>> configurations = sfi.getAvailableConfigurations("configa");

        Set<Set<String>> expected = new HashSet<Set<String>>();

        Set<String> firstExpectedConf = new HashSet<String>();
        firstExpectedConf.add("A");
        expected.add(firstExpectedConf);

        Set<String> secondExpectedConf = new HashSet<String>();
        secondExpectedConf.add("A");
        secondExpectedConf.add("B");
        expected.add(secondExpectedConf);

        Set<String> thirdExpectedConf = new HashSet<String>();
        thirdExpectedConf.add("A");
        thirdExpectedConf.add("C");
        expected.add(thirdExpectedConf);

        Set<String> fourthExpectedConf = new HashSet<String>();
        fourthExpectedConf.add("A");
        fourthExpectedConf.add("D");
        expected.add(fourthExpectedConf);

        Set<String> fifthExpectedConf = new HashSet<String>();
        fifthExpectedConf.add("A");
        fifthExpectedConf.add("B");
        fifthExpectedConf.add("C");
        expected.add(fifthExpectedConf);

        Set<String> sixthExpectedConf = new HashSet<String>();
        sixthExpectedConf.add("A");
        sixthExpectedConf.add("B");
        sixthExpectedConf.add("D");
        expected.add(sixthExpectedConf);

        Set<String> seventhExpectedConf = new HashSet<String>();
        seventhExpectedConf.add("A");
        seventhExpectedConf.add("C");
        seventhExpectedConf.add("D");
        expected.add(seventhExpectedConf);

        Set<String> eighthExpectedConf = new HashSet<String>();
        eighthExpectedConf.add("A");
        eighthExpectedConf.add("B");
        eighthExpectedConf.add("C");
        eighthExpectedConf.add("D");
        expected.add(eighthExpectedConf);

        assertEquals(configurations, expected);
    }

    @Test
    public void testRetrieveAllConfigurationForAFMWithHierarchyORAndXOR() throws FMEngineException {
        String fm = "a = FM(A: (B|C|D)+; B: [X]; C: (U|V|W);)";
        FamiliarInterpreter sfi = FamiliarInterpreter.getInstance();
        sfi.eval(fm);

        String createConfig = "configa = configuration a";
        sfi.eval(createConfig);

        Set<Set<String>> configurations = sfi.getAvailableConfigurations("configa");

        Set<Set<String>> expected = new HashSet<Set<String>>();

        Set<String> expectedConf1 = new HashSet<String>();
        expectedConf1.add("A");
        expectedConf1.add("B");
        expected.add(expectedConf1);

        Set<String> expectedConf2 = new HashSet<String>();
        expectedConf2.add("A");
        expectedConf2.add("B");
        expectedConf2.add("X");
        expected.add(expectedConf2);

        Set<String> expectedConf3 = new HashSet<String>();
        expectedConf3.add("A");
        expectedConf3.add("C");
        expectedConf3.add("U");
        expected.add(expectedConf3);

        Set<String> expectedConf4 = new HashSet<String>();
        expectedConf4.add("A");
        expectedConf4.add("C");
        expectedConf4.add("V");
        expected.add(expectedConf4);

        Set<String> expectedConf5 = new HashSet<String>();
        expectedConf5.add("A");
        expectedConf5.add("C");
        expectedConf5.add("W");
        expected.add(expectedConf5);

        Set<String> expectedConf6 = new HashSet<String>();
        expectedConf6.add("A");
        expectedConf6.add("D");
        expected.add(expectedConf6);

        Set<String> expectedConf7 = new HashSet<String>();
        expectedConf7.add("A");
        expectedConf7.add("B");
        expectedConf7.add("D");
        expected.add(expectedConf7);

        Set<String> expectedConf8 = new HashSet<String>();
        expectedConf8.add("A");
        expectedConf8.add("B");
        expectedConf8.add("X");
        expectedConf8.add("D");
        expected.add(expectedConf8);


        Set<String> expectedConf9 = new HashSet<String>();
        expectedConf9.add("A");
        expectedConf9.add("B");
        expectedConf9.add("C");
        expectedConf9.add("U");
        expected.add(expectedConf9);

        Set<String> expectedConf10 = new HashSet<String>();
        expectedConf10.add("A");
        expectedConf10.add("B");
        expectedConf10.add("X");
        expectedConf10.add("C");
        expectedConf10.add("U");
        expected.add(expectedConf10);

        Set<String> expectedConf11 = new HashSet<String>();
        expectedConf11.add("A");
        expectedConf11.add("B");
        expectedConf11.add("C");
        expectedConf11.add("V");
        expected.add(expectedConf11);

        Set<String> expectedConf12 = new HashSet<String>();
        expectedConf12.add("A");
        expectedConf12.add("B");
        expectedConf12.add("X");
        expectedConf12.add("C");
        expectedConf12.add("V");
        expected.add(expectedConf12);

        Set<String> expectedConf13 = new HashSet<String>();
        expectedConf13.add("A");
        expectedConf13.add("B");
        expectedConf13.add("C");
        expectedConf13.add("W");
        expected.add(expectedConf13);

        Set<String> expectedConf14 = new HashSet<String>();
        expectedConf14.add("A");
        expectedConf14.add("B");
        expectedConf14.add("X");
        expectedConf14.add("C");
        expectedConf14.add("W");
        expected.add(expectedConf14);

        Set<String> expectedConf15 = new HashSet<String>();
        expectedConf15.add("A");
        expectedConf15.add("B");
        expectedConf15.add("C");
        expectedConf15.add("U");
        expectedConf15.add("D");
        expected.add(expectedConf15);

        Set<String> expectedConf16 = new HashSet<String>();
        expectedConf16.add("A");
        expectedConf16.add("B");
        expectedConf16.add("X");
        expectedConf16.add("C");
        expectedConf16.add("U");
        expectedConf16.add("D");
        expected.add(expectedConf16);

        Set<String> expectedConf17 = new HashSet<String>();
        expectedConf17.add("A");
        expectedConf17.add("B");
        expectedConf17.add("C");
        expectedConf17.add("V");
        expectedConf17.add("D");
        expected.add(expectedConf17);

        Set<String> expectedConf18 = new HashSet<String>();
        expectedConf18.add("A");
        expectedConf18.add("B");
        expectedConf18.add("X");
        expectedConf18.add("C");
        expectedConf18.add("V");
        expectedConf18.add("D");
        expected.add(expectedConf18);

        Set<String> expectedConf19 = new HashSet<String>();
        expectedConf19.add("A");
        expectedConf19.add("B");
        expectedConf19.add("C");
        expectedConf19.add("W");
        expectedConf19.add("D");
        expected.add(expectedConf19);

        Set<String> expectedConf20 = new HashSet<String>();
        expectedConf20.add("A");
        expectedConf20.add("B");
        expectedConf20.add("X");
        expectedConf20.add("C");
        expectedConf20.add("W");
        expectedConf20.add("D");
        expected.add(expectedConf20);

        Set<String> expectedConf21 = new HashSet<String>();
        expectedConf21.add("A");
        expectedConf21.add("C");
        expectedConf21.add("U");
        expectedConf21.add("D");
        expected.add(expectedConf21);

        Set<String> expectedConf22 = new HashSet<String>();
        expectedConf22.add("A");
        expectedConf22.add("C");
        expectedConf22.add("V");
        expectedConf22.add("D");
        expected.add(expectedConf22);

        Set<String> expectedConf23 = new HashSet<String>();
        expectedConf23.add("A");
        expectedConf23.add("C");
        expectedConf23.add("W");
        expectedConf23.add("D");
        expected.add(expectedConf23);

        assertEquals(configurations, expected);
    }
}
