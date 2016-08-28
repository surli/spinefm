package fr.unice.i3s.sparks.spinefm.domainmodeling.json;

import fr.unice.i3s.sparks.spinefm.domainmodeling.LowerMultiplicity;
import fr.unice.i3s.sparks.spinefm.domainmodeling.Multiplicity;
import fr.unice.i3s.sparks.spinefm.domainmodeling.UpperMultiplicity;

import javax.json.JsonObject;

/**
 * Created by urli on 27/08/2016.
 */
public class MultiplicityParser {

    public static Multiplicity parseJson(JsonObject multiplicityObject) {
        Multiplicity multiplicity = new Multiplicity();

        int lowerBound = multiplicityObject.getInt("lowerBound");
        int upperBound = multiplicityObject.getInt("upperBound");

        if (lowerBound == 0) {
            multiplicity.setLowerBound(LowerMultiplicity.ZERO);
        }
        if (lowerBound == 1) {
            multiplicity.setLowerBound(LowerMultiplicity.ONE);
        }

        if (upperBound == 1) {
            multiplicity.setUpperBound(UpperMultiplicity.ONE);
        }
        if (upperBound == -1) {
            multiplicity.setUpperBound(UpperMultiplicity.UNBOUNDED);
        }

        return multiplicity;
    }
}
