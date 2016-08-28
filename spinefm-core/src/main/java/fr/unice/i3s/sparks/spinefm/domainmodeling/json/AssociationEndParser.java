package fr.unice.i3s.sparks.spinefm.domainmodeling.json;

import fr.unice.i3s.sparks.spinefm.domainmodeling.AssociationEnd;
import fr.unice.i3s.sparks.spinefm.domainmodeling.Concept;
import fr.unice.i3s.sparks.spinefm.domainmodeling.DomainModel;
import fr.unice.i3s.sparks.spinefm.domainmodeling.Multiplicity;
import fr.unice.i3s.sparks.spinefm.domainmodeling.exceptions.ObjectNotFoundException;
import fr.unice.i3s.sparks.spinefm.domainmodeling.json.exceptions.JsonParsingException;

import javax.json.JsonObject;

/**
 * Created by urli on 27/08/2016.
 */
public class AssociationEndParser {
    public static AssociationEnd parseJson(JsonObject endObject, DomainModel domainModel) throws JsonParsingException {
        String conceptName = endObject.getString("concept");

        try {
            Concept concept = domainModel.getConceptByName(conceptName);
            JsonObject multiplicityJson = endObject.getJsonObject("multiplicity");
            Multiplicity multiplicity = MultiplicityParser.parseJson(multiplicityJson);

            AssociationEnd associationEnd = new AssociationEnd();
            associationEnd.setConcept(concept);
            associationEnd.setMultiplicity(multiplicity);

            return associationEnd;
        } catch (ObjectNotFoundException exception) {
            throw new JsonParsingException("The concept named "+conceptName+" was not found.");
        }
    }
}
