package fr.unice.i3s.sparks.spinefm.domainmodeling.json;

import fr.unice.i3s.sparks.spinefm.domainmodeling.Concept;
import fr.unice.i3s.sparks.spinefm.domainmodeling.Multiplicity;
import fr.unice.i3s.sparks.spinefm.domainmodeling.json.exceptions.JsonParsingException;

import javax.json.Json;
import javax.json.JsonObject;

/**
 * Created by urli on 27/08/2016.
 */
public class ConceptParser {
    public static Concept parseJson(JsonObject jsonConcept) throws JsonParsingException {
        String name;
        JsonObject multiplicityJson;

        try {
            name = jsonConcept.getString("name");
        } catch (NullPointerException exception) {
            throw new JsonParsingException("The name attribute is missing from concept.");
        }

        try {
            multiplicityJson = jsonConcept.getJsonObject("multiplicity");
        } catch (NullPointerException exception) {
            throw new JsonParsingException("The multiplicity attribute is missing from concept.");
        }

        Concept concept = new Concept(name);

        Multiplicity multiplicity = MultiplicityParser.parseJson(multiplicityJson);
        concept.setMultiplicity(multiplicity);

        return concept;
    }

}
