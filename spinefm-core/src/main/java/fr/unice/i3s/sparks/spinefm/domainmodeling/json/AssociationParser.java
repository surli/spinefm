package fr.unice.i3s.sparks.spinefm.domainmodeling.json;

import fr.unice.i3s.sparks.spinefm.domainmodeling.Association;
import fr.unice.i3s.sparks.spinefm.domainmodeling.AssociationEnd;
import fr.unice.i3s.sparks.spinefm.domainmodeling.DomainModel;
import fr.unice.i3s.sparks.spinefm.domainmodeling.json.exceptions.JsonParsingException;

import javax.json.JsonObject;

/**
 * Created by urli on 27/08/2016.
 */
public class AssociationParser {

    public static Association parseJson(JsonObject associationJson, DomainModel domainModel) throws JsonParsingException {
        JsonObject leftEndJson = associationJson.getJsonObject("leftEnd");
        JsonObject rightEndJson = associationJson.getJsonObject("rightEnd");

        AssociationEnd leftEnd = AssociationEndParser.parseJson(leftEndJson, domainModel);
        AssociationEnd rightEnd = AssociationEndParser.parseJson(rightEndJson, domainModel);

        Association association = new Association();
        association.setLeftEnd(leftEnd);
        association.setRightEnd(rightEnd);

        return association;
    }
}
