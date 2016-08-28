package fr.unice.i3s.sparks.spinefm.domainmodeling.json;

import fr.unice.i3s.sparks.spinefm.domainmodeling.Concept;
import fr.unice.i3s.sparks.spinefm.domainmodeling.Multiplicity;

import javax.json.Json;
import javax.json.JsonObject;

/**
 * Created by urli on 27/08/2016.
 */
public class ConceptParser {
    public static Concept parseJson(JsonObject jsonConcept) {
        String name = jsonConcept.getString("name");
        Concept concept = new Concept(name);

        JsonObject multiplicityJson = jsonConcept.getJsonObject("multiplicity");
        Multiplicity multiplicity = MultiplicityParser.parseJson(multiplicityJson);
        concept.setMultiplicity(multiplicity);

        return concept;
    }

}
