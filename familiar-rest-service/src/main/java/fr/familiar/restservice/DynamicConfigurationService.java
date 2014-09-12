package fr.familiar.restservice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import fr.familiar.FamiliarInterpreter;
import fr.familiar.variable.ConfigurationVariable;

@Path("/configuration/")
public class DynamicConfigurationService {

	public static Response createResponse(Object result) {
		return Response.ok(result)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Methods","OPTIONS, GET, POST")
				.header("Access-Control-Allow-Headers","Content-Type, Depth, User-Agent, X-File-Size, X-Requested-With, If-Modified-Since, X-File-Name, Cache-Control")
				.build();
	}
	
	private static Map<String,FamiliarInterpreter> tokens = new HashMap<String,FamiliarInterpreter>();
	
	@Path("init")
	@OPTIONS
	@Deprecated
	public Response optionsForInitFM(@HeaderParam("Access-Control-Request-Headers") String requestH) {
		ResponseBuilder rb = Response.ok().header("Access-Control-Allow-Origin", "*").header("Access-Control-Allow-Methods", "GET, POST, PUT, OPTIONS");
		rb.header("Access-Control-Allow-Headers", requestH);
		return rb.build();
	}
	
	@POST
	@Path("init")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response initFM(String fm) {
		FamiliarInterpreter fi = new FamiliarInterpreter();
		String uid = UUID.randomUUID().toString().replace('-', '_');
		String cmd;
		fm = fm.trim().replace('\t', ' ').replace('\r', ' ').replace('\n', ' ');
		try {
			cmd = "fm"+uid+" = "+fm;
			fi.eval(cmd);
			cmd = "config"+uid+" = configuration fm"+uid;
			fi.eval(cmd);
			Collection<String> deselectedF = fi.getDeselectedFeature("config"+uid);
			Collection<String> selectedF = fi.getSelectedFeature("config"+uid);
			
			tokens.put(uid, fi);
			Map<String,Object> result = new HashMap<String,Object>();
			result.put("token",uid);
			result.put("selected", selectedF);
			result.put("deselected", deselectedF);
			return createResponse(result);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Path("select/{token}/{feature}")
	@OPTIONS
	@Deprecated
	public Response optionsForSelectFeature(@HeaderParam("Access-Control-Request-Headers") String requestH) {
		ResponseBuilder rb = Response.ok().header("Access-Control-Allow-Origin", "*").header("Access-Control-Allow-Methods", "GET, POST, PUT, OPTIONS");
		rb.header("Access-Control-Allow-Headers", requestH);
		return rb.build();
	}
	
	@PUT
	@Path("select/{token}/{feature}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response selectFeature(@PathParam("token") String token, @PathParam("feature") String feature) {
		return this.actionOnFeature(token, feature, "select");
	}
	
	@Path("deselect/{token}/{feature}")
	@OPTIONS
	@Deprecated
	public Response optionsForDeselectFeature(@HeaderParam("Access-Control-Request-Headers") String requestH) {
		ResponseBuilder rb = Response.ok().header("Access-Control-Allow-Origin", "*").header("Access-Control-Allow-Methods", "GET, POST, PUT, OPTIONS");
		rb.header("Access-Control-Allow-Headers", requestH);
		return rb.build();
	}
	
	@PUT
	@Path("deselect/{token}/{feature}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deselectFeature(@PathParam("token") String token, @PathParam("feature") String feature) {
		return this.actionOnFeature(token, feature, "deselect");
	}
	
	private Response actionOnFeature(String token, String feature, String action) {
		FamiliarInterpreter fi = tokens.get(token);
		
		if (fi != null) {
			String cmd;
			try {
				cmd = action+" "+feature+" in config"+token;
				fi.eval(cmd);
				Collection<String> deselectedF = fi.getDeselectedFeature("config"+token);
				Collection<String> selectedF = fi.getSelectedFeature("config"+token);
				ConfigurationVariable cv = (ConfigurationVariable) fi.getVariable("config"+token);
				
				
				Map<String,Object> result = new HashMap<String,Object>();
				result.put("selected", selectedF);
				result.put("deselected", deselectedF);
				result.put("valid", cv.isComplete() && cv.isValid());
				result.put("products", cv.getFmv().counting());
				return createResponse(result);
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		} else {
			throw new RuntimeException("Bad token !");
		}
	}
	
	@Path("savePath/{token}")
	@OPTIONS
	@Deprecated
	public Response optionsForSavePath(@HeaderParam("Access-Control-Request-Headers") String requestH) {
		ResponseBuilder rb = Response.ok().header("Access-Control-Allow-Origin", "*").header("Access-Control-Allow-Methods", "GET, POST, PUT, OPTIONS");
		rb.header("Access-Control-Allow-Headers", requestH);
		return rb.build();
	}
	
	@POST
	@Path("savePath/{token}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response savePath(@PathParam("token") String token, String path) {
		
		if (tokens.get(token) != null) {
			tokens.remove(token);
			File f = new File("/tmp/pathXP.tsv");
			try {
				FileWriter fw = new FileWriter(f, true);
				fw.append(path+"\n");
				fw.flush();
				fw.close();
				return createResponse("ok");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return createResponse("fail");
			}
		}
		throw new RuntimeException("Bad token !");
		
	}
}
