package fr.unice.i3s.sparks.spinefm.domainmodeling.json;

import fr.unice.i3s.sparks.spinefm.domainmodeling.LowerMultiplicity;
import fr.unice.i3s.sparks.spinefm.domainmodeling.Multiplicity;
import fr.unice.i3s.sparks.spinefm.domainmodeling.UpperMultiplicity;
import fr.unice.i3s.sparks.spinefm.domainmodeling.json.exceptions.JsonParsingException;

import javax.json.JsonObject;

/**
 * Created by urli on 27/08/2016.
 */
public class MultiplicityParser {

    public static Multiplicity parseJson(JsonObject multiplicityObject) throws JsonParsingException {
        Multiplicity multiplicity = new Multiplicity();

        int lowerBound, upperBound;

        try {
            lowerBound = multiplicityObject.getInt("lowerBound");
        } catch (NullPointerException exception) {
            throw new JsonParsingException("lowerBound attribute not found.");
        }

        try {
            upperBound = multiplicityObject.getInt("upperBound");
        } catch (NullPointerException exception) {
            throw new JsonParsingException("upperBound attribute not found.");
        }

        if (lowerBound != 0 && lowerBound != 1) {
            throw new JsonParsingException("lowerBound can only accept the following values: 0 or 1.");
        }
        if (upperBound != 1 && upperBound != -1) {
            throw new JsonParsingException("upperBound can only accept the following values: 1 or -1.");
        }

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
