package fr.unice.spinefm.rest.service;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
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

import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelFactory;
import fr.unice.spinefm.ActionModel.UserActionModel.UserRenameElement;
import fr.unice.spinefm.ProcessModel.ContextManager;
import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.FatalSpineFMException;
import fr.unice.spinefm.rest.CoreRegistry;
import fr.unice.spinefm.rest.RestSpineFMInstance;
import fr.unice.spinefm.rest.service.exception.CoreNotExistingException;
import fr.unice.spinefm.rest.service.utils.RestMethodUtils;
import fr.unice.spinefm.rest.service.utils.Version;


@Path("/")
public class InitService {

	@Path("/")
	@OPTIONS
	@Deprecated
	public Response optionsForInitCore(@HeaderParam("Access-Control-Request-Headers") String requestH) {
		ResponseBuilder rb = Response.ok().header("Access-Control-Allow-Origin", "*").header("Access-Control-Allow-Methods", "GET, POST, PUT, OPTIONS");
		rb.header("Access-Control-Allow-Headers", requestH);
		return rb.build();
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response initCore(String[] args) {
		if (args.length != 2) {
			return RestMethodUtils.launchAndManageWebException("The args array should contain two informations : model path and description", 500);
		}
		
		String modelPath = args[0];
		String description = args[1];
		
		Map<String,String> coreID = new HashMap<String,String>();
		try {
			String id = CoreRegistry.getInstance().createCore(modelPath, description);
			coreID.put("id", id);
			ContextManager cc = RestMethodUtils.getCoreInRESTService(id);
			UserRenameElement ure = UserActionModelFactory.eINSTANCE.createUserRenameElement();
			ure.initManualAction(cc);
			ure.setElementType("setdescription");
			ure.setName(description);
			ure.apply();
		} catch (FatalSpineFMException e) {
			return RestMethodUtils.launchAndManageWebException(e, 500);
		} catch (ElementNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 500);
		}
		return RestMethodUtils.createResponse(coreID);
	}
	
	@Path("version/")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getVersion() {
		return Version.getVersion();
	}
	
	@Path("list/")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getListOfInstances() {
		return RestMethodUtils.createResponse(CoreRegistry.getInstance().getAllInstances());
	}
	
	@Path("import/")
	@OPTIONS
	@Deprecated
	public Response optionsForImportCore(@HeaderParam("Access-Control-Request-Headers") String requestH) {
		ResponseBuilder rb = Response.ok().header("Access-Control-Allow-Origin", "*").header("Access-Control-Allow-Methods", "GET, POST, PUT, OPTIONS");
		rb.header("Access-Control-Allow-Headers", requestH);
		return rb.build();
	}
	
	@Path("import/")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response importCore(String pathPast) {
		Map<String,String> coreID = new HashMap<String,String>();
		try {
			coreID.put("id", CoreRegistry.getInstance().importCore(pathPast));
		} catch (FatalSpineFMException e) {
			return RestMethodUtils.launchAndManageWebException(e, 500);
		} catch (ElementNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 500);
		}
		return RestMethodUtils.createResponse(coreID);
	}
	
	@Path("{coreID}/name/{name}")
	@OPTIONS
	@Deprecated
	public Response optionsFordsetDescription(@HeaderParam("Access-Control-Request-Headers") String requestH) {
		ResponseBuilder rb = Response.ok().header("Access-Control-Allow-Origin", "*").header("Access-Control-Allow-Methods", "GET, POST, PUT, OPTIONS");
		rb.header("Access-Control-Allow-Headers", requestH);
		return rb.build();
	}
	
	@Path("{coreID}/name/{name}")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Response setDescription(@PathParam("coreID") String coreID, @PathParam("name") String name) {
		try {
			ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
			UserRenameElement ure = UserActionModelFactory.eINSTANCE.createUserRenameElement();
			ure.initManualAction(cc);
			ure.setElementType("product");
			ure.setName(name);
			ure.apply();
			
			RestSpineFMInstance rspinefm = CoreRegistry.getInstance().getRestSpineFMInstance(coreID);
			rspinefm.setDescription(name);
			
			RestMethodUtils.updateModificationDate(coreID);
			return RestMethodUtils.createResponse(true);
		} catch (CoreNotExistingException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		} catch (ElementNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		} catch (FatalSpineFMException e) {
			return RestMethodUtils.launchAndManageWebException(e, 500);
		}
	}
}
