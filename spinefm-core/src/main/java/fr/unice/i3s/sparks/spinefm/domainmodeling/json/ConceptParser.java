package fr.unice.i3s.sparks.spinefm.domainmodeling.json;

import fr.unice.i3s.sparks.spinefm.domainmodeling.Concept;
import fr.unice.i3s.sparks.spinefm.domainmodeling.Multiplicity;
import fr.unice.i3s.sparks.spinefm.domainmodeling.json.exceptions.JsonParsingException;
import fr.unice.i3s.sparks.spinefm.fmengine.exceptions.FMEngineException;
import fr.unice.i3s.sparks.spinefm.fmengine.familiar.FMLSpineFMAdapter;

import javax.json.Json;
import javax.json.JsonObject;

/**
 * Created by urli on 27/08/2016.
 */
public class ConceptParser {
    public static Concept parseJson(JsonObject jsonConcept, String dataDirectory, FMLSpineFMAdapter fmlAdapter) throws JsonParsingException, FMEngineException {
        String name, fmName, fmPath;
        JsonObject multiplicityJson;
        JsonObject fmJson;

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

        try {
            fmJson = jsonConcept.getJsonObject("fm");
        } catch (NullPointerException exception) {
            throw new JsonParsingException("The FM attribute is missing from the concept.");
        }

        try {
            fmName = fmJson.getString("name");
        } catch (NullPointerException exception) {
            throw new JsonParsingException("The FM attribute does not have a name attribute.");
        }

        try {
            fmPath = fmJson.getString("path");
        } catch (NullPointerException exception) {
            throw new JsonParsingException("The FM attribute does not have a path attribute.");
        }

        String finalFmPath;

        if (fmPath.startsWith("/")) {
            finalFmPath = fmPath;
        } else {
            finalFmPath = dataDirectory+fmPath;
        }

        Concept concept = new Concept(name);

        Multiplicity multiplicity = MultiplicityParser.parseJson(multiplicityJson);
        concept.setMultiplicity(multiplicity);

        concept.parseFeatureModel(fmName, finalFmPath, fmlAdapter);

        return concept;
    }

}
