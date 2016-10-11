package fr.unice.i3s.sparks.spinefm.domainmodeling.json;

import fr.unice.i3s.sparks.spinefm.domainmodeling.LowerMultiplicity;
import fr.unice.i3s.sparks.spinefm.domainmodeling.Multiplicity;
import fr.unice.i3s.sparks.spinefm.domainmodeling.UpperMultiplicity;
import fr.unice.i3s.sparks.spinefm.domainmodeling.json.exceptions.JsonParsingException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import javax.json.Json;
import javax.json.JsonObject;

/**
 * Created by urli on 29/08/2016.
 */
public class TestConceptParser {
    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void testValidJsonWithSimpleMultiplicitiesIsCorrectlyParsed() throws JsonParsingException {
        JsonObject jsonMultiplicity = Json.createObjectBuilder().add("lowerBound",1).add("upperBound",1).build();
        JsonObject concept = Json.createObjectBuilder().add("name", "toto").add("multiplicity",jsonMultiplicity).build();
        Multiplicity multiplicity = MultiplicityParser.parseJson(jsonMultiplicity);

        Multiplicity expected = new Multiplicity();
        expected.setLowerBound(LowerMultiplicity.ONE);
        expected.setUpperBound(UpperMultiplicity.ONE);

        Assert.assertEquals(multiplicity, expected);
    }
}