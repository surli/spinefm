package fr.familiar.restservice;

import java.util.ArrayList;
import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.familiar.FamiliarInterpreter;
import fr.familiar.variable.FeatureModelVariable;

@Path("/fm/")
public class FMService {

	@POST
	@Path("merge")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public String mergeFeatureModels(String[] fms) {
		FamiliarInterpreter fi = new FamiliarInterpreter();
		String cmd;
		String toMerge = "";
		try {
			for (String s : fms) {
				String fmName = UUID.randomUUID().toString();
				cmd = fmName +"= "+s;
				fi.eval(cmd);
				toMerge += fmName+" ";
			}
			cmd = "fmmerged = merge sunion { "+toMerge+"}";
			fi.eval(cmd);
			FeatureModelVariable fmv = fi.getFMVariable("fmmerged");
			return fmv.getSyntacticalRepresentation();
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}
}
