package fr.unice.i3s.sparks.spinefm.domainmodeling.json;

import fr.unice.i3s.sparks.spinefm.domainmodeling.Association;
import fr.unice.i3s.sparks.spinefm.domainmodeling.Concept;
import fr.unice.i3s.sparks.spinefm.domainmodeling.DomainModel;
import fr.unice.i3s.sparks.spinefm.domainmodeling.json.exceptions.JsonParsingException;

import javax.json.*;
import java.io.StringReader;

/**
 * Created by urli on 27/08/2016.
 */
public class DomainModelParser {

    public static DomainModel parseJSON(String jsonData) throws JsonParsingException {
        JsonReader reader = Json.createReader(new StringReader(jsonData));
        JsonObject firstObject = reader.readObject();
        String name = firstObject.getString("name");

        DomainModel model = new DomainModel("name");

        JsonArray jsonConcepts = firstObject.getJsonArray("concepts");

        for (int i = 0; i < jsonConcepts.size(); i++) {
            JsonObject conceptJson = jsonConcepts.getJsonObject(i);
            Concept concept = ConceptParser.parseJson(conceptJson);
            model.addConcept(concept);
        }

        JsonArray jsonAssociations = firstObject.getJsonArray("associations");

        for (int i = 0; i < jsonAssociations.size(); i++) {
            JsonObject associationJson = jsonAssociations.getJsonObject(i);
            Association association = AssociationParser.parseJson(associationJson, model);
            model.addAssociation(association);
        }

        return model;
    }
}
