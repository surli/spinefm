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
 * Created by urli on 28/08/2016.
 */
public class TestMultiplicityParser {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void testValidJsonWithSimpleMultiplicitiesIsCorrectlyParsed() throws JsonParsingException {
        JsonObject jsonMultiplicity = Json.createObjectBuilder().add("lowerBound",1).add("upperBound",1).build();
        Multiplicity multiplicity = MultiplicityParser.parseJson(jsonMultiplicity);

        Multiplicity expected = new Multiplicity();
        expected.setLowerBound(LowerMultiplicity.ONE);
        expected.setUpperBound(UpperMultiplicity.ONE);

        Assert.assertEquals(multiplicity, expected);
    }

    @Test
    public void testValidJsonWithUnboundedMultiplicitiesIsCorrectlyParsed() throws JsonParsingException {
        JsonObject jsonMultiplicity = Json.createObjectBuilder().add("lowerBound",1).add("upperBound",-1).build();
        Multiplicity multiplicity = MultiplicityParser.parseJson(jsonMultiplicity);

        Multiplicity expected = new Multiplicity();
        expected.setLowerBound(LowerMultiplicity.ONE);
        expected.setUpperBound(UpperMultiplicity.UNBOUNDED);

        Assert.assertEquals(multiplicity, expected);
    }

    @Test
    public void testValidJsonWithZeroMultiplicitiesIsCorrectlyParsed() throws JsonParsingException {
        JsonObject jsonMultiplicity = Json.createObjectBuilder().add("lowerBound",0).add("upperBound",-1).build();
        Multiplicity multiplicity = MultiplicityParser.parseJson(jsonMultiplicity);

        Multiplicity expected = new Multiplicity();
        expected.setLowerBound(LowerMultiplicity.ZERO);
        expected.setUpperBound(UpperMultiplicity.UNBOUNDED);

        Assert.assertEquals(multiplicity, expected);
    }

    @Test
    public void testJsonWithoutUpperBoundThrowException() throws JsonParsingException {
        expectedEx.expect(JsonParsingException.class);
        expectedEx.expectMessage("upperBound attribute not found.");

        JsonObject jsonMultiplicity = Json.createObjectBuilder().add("lowerBound",0).build();
        Multiplicity multiplicity = MultiplicityParser.parseJson(jsonMultiplicity);
    }

    @Test
    public void testJsonWithoutLowerBoundThrowException() throws JsonParsingException {
        expectedEx.expect(JsonParsingException.class);
        expectedEx.expectMessage("lowerBound attribute not found.");

        JsonObject jsonMultiplicity = Json.createObjectBuilder().add("upperBound",1).build();
        Multiplicity multiplicity = MultiplicityParser.parseJson(jsonMultiplicity);
    }

    @Test
    public void testJsonWithoutNeitherLowerOrUpperBoundThrowException() throws JsonParsingException {
        expectedEx.expect(JsonParsingException.class);
        expectedEx.expectMessage("lowerBound attribute not found.");

        JsonObject jsonMultiplicity = Json.createObjectBuilder().build();
        Multiplicity multiplicity = MultiplicityParser.parseJson(jsonMultiplicity);
    }

    @Test
    public void testJsonWithAWrongCardinalityOnUpperBoundThrowException() throws JsonParsingException {
        expectedEx.expect(JsonParsingException.class);
        expectedEx.expectMessage("upperBound can only accept the following values: 1 or -1.");

        JsonObject jsonMultiplicity = Json.createObjectBuilder().add("lowerBound",0).add("upperBound",4).build();
        Multiplicity multiplicity = MultiplicityParser.parseJson(jsonMultiplicity);
    }

    @Test
    public void testJsonWithAWrongCardinalityOnLowerBoundThrowException() throws JsonParsingException {
        expectedEx.expect(JsonParsingException.class);
        expectedEx.expectMessage("lowerBound can only accept the following values: 0 or 1.");

        JsonObject jsonMultiplicity = Json.createObjectBuilder().add("lowerBound",-1).add("upperBound",1).build();
        Multiplicity multiplicity = MultiplicityParser.parseJson(jsonMultiplicity);
    }
}
