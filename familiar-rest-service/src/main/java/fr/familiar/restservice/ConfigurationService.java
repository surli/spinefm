package fr.familiar.restservice;

import java.util.Collection;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import fr.familiar.FamiliarInterpreter;

@Path("/config/")
public class ConfigurationService {

	@POST
	@Path("selectedF")
	@Produces(MediaType.TEXT_PLAIN)
	public String getSelectedFeaturesOfFM(String fm) {
		String cmd = "fm = "+fm;
		FamiliarInterpreter fi = new FamiliarInterpreter();
		
		try {
			fi.eval(cmd);
			cmd = "conf = configuration fm";
			fi.eval(cmd);
			Collection<String> ls = fi.getSelectedFeature("conf");
			String result = "";
			for (String s : ls)
				result += s+",";
			if (!ls.isEmpty())
				return result.substring(0, result.length()-1);
			else
				return result;
		} catch (Exception e) {
			ResponseBuilder r = Response.status(500);
			r.entity(e.getMessage());
			r.type(MediaType.TEXT_HTML);
			throw new WebApplicationException(r.build());
		}
	}
	
	
}
