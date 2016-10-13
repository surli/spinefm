package fr.unice.i3s.sparks.spinefm.domainmodeling.json;

import fr.unice.i3s.sparks.spinefm.domainmodeling.Association;
import fr.unice.i3s.sparks.spinefm.domainmodeling.Concept;
import fr.unice.i3s.sparks.spinefm.domainmodeling.DomainModel;
import fr.unice.i3s.sparks.spinefm.domainmodeling.json.exceptions.JsonParsingException;
import fr.unice.i3s.sparks.spinefm.fmengine.exceptions.FMEngineException;
import fr.unice.i3s.sparks.spinefm.fmengine.familiar.FMLSpineFMAdapter;
import fr.unice.i3s.sparks.spinefm.fmengine.familiar.FamiliarInterpreter;

import javax.json.*;
import java.io.*;

/**
 * Created by urli on 27/08/2016.
 */
public class DomainModelParser {

    public static DomainModel parseJSON(String dataDirectory, String dataFile) throws JsonParsingException, FMEngineException {
        FMLSpineFMAdapter adapter = new FMLSpineFMAdapter(FamiliarInterpreter.getInstance());

        Reader dataReader;

        try {
            dataReader = new FileReader(dataDirectory+dataFile);
        } catch (FileNotFoundException e) {
            throw new JsonParsingException("The JSON data file was not found at the following path: "+dataDirectory+dataFile);
        }

        JsonReader reader = Json.createReader(dataReader);
        JsonObject firstObject = reader.readObject();
        String name = firstObject.getString("name");

        DomainModel model = new DomainModel("name");

        JsonArray jsonConcepts = firstObject.getJsonArray("concepts");

        for (int i = 0; i < jsonConcepts.size(); i++) {
            JsonObject conceptJson = jsonConcepts.getJsonObject(i);
            Concept concept = ConceptParser.parseJson(conceptJson, dataDirectory, adapter);
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

    public static void main(String[] args) throws JsonParsingException, FMEngineException {
        DomainModel model;

        model = DomainModelParser.parseJSON("./spinefm-core/src/test/resources/thesisExample/","SmartBuilding.json");

        for (Concept concept : model.getConcepts()) {
            System.out.println("Concept : "+concept.getName()+" ["+concept.getMultiplicity().getLowerBound()+"-"+concept.getMultiplicity().getUpperBound()+"]");
            System.out.println("FM:"+concept.getFeatureModel());
        }
    }
}
