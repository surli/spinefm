package fr.unice.spinefm.fmengine.familiar;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.familiar.interpreter.VariableNotExistingException;
import fr.familiar.parser.VariableAmbigousConflictException;
import fr.familiar.variable.Variable;
import fr.unice.spinefm.fmengine.exceptions.FMEngineException;
import fr.unice.spinefm.fmengine.familiar.FamiliarInterpreter;

public class SimpleFamiliarTest {

	@Test
	public void testToStringRunCorrectylyInFamiliar() throws FMEngineException, VariableNotExistingException, VariableAmbigousConflictException {
		FamiliarInterpreter sfi = FamiliarInterpreter.getInstance();
		System.out.println("Instanciation de SFI");
		String FMA = "fma = FM(A: B C [D]; C: (X|Y); D: (Q|T|R)+;)";
		sfi.eval(FMA);
		System.out.println("Eval de FMA");
		Variable fmav = sfi.getVariable("fma");
		String expected = "A: [D] B C ; \n"
						+"D: (R|T|Q)+ ; \n"
						+"C: (X|Y) ;";
		String s = fmav.toString();
		System.out.println("String computed: "+s);
		sfi.clearInterpreter();
		assertEquals(expected,s);
	}
	
	@Test
	public void testMerge() throws FMEngineException, VariableNotExistingException, VariableAmbigousConflictException {
		FamiliarInterpreter sfi = FamiliarInterpreter.getInstance();
		System.out.println("Instanciation de SFI");
		String FMA = "layout1 = FM (Layout: Product Zones Design; Product: LayoutAcademicUNS; Zones: MainZone_glc BottomZone_glc RightZone_glc HeaderZone_glc; Design: GLC UNS;)"
					+"layout2 = FM (Layout: Product Zones Design; Product: LayoutAcademic; Zones: MainZone_glc BottomZone_glc RightZone_glc HeaderZone_glc; Design: GLC;)"
					+"layout3 = FM (Layout: Product Zones Design; Product: LayoutHandicap; Zones: MainZone_irsam VocalZone; Design: IRSAM;)"
					+"yourcastv0_layout = merge sunion layout*";
		sfi.eval(FMA);
		System.out.println("Eval de FMA");
		Variable fmav = sfi.getVariable("yourcastv0_layout");
		assertEquals(fmav.getIdentifier(),"yourcastv0_layout");
	}
}
