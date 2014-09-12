package fr.unice.spinefm.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelFactory;
import fr.unice.spinefm.ActionModel.UserActionModel.UserCloneContext;
import fr.unice.spinefm.ActionModel.UserActionModel.UserCreateContext;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.ProcessModel.Context;
import fr.unice.spinefm.ProcessModel.ContextManager;
import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.FatalSpineFMException;
import fr.unice.spinefm.rest.service.utils.RestMethodUtils;

@Path("{coreID}/ctx/")
public class ContextService {

	@Path("create/")
	@OPTIONS
	@Deprecated
	public Response optionsForcreateContext(@HeaderParam("Access-Control-Request-Headers") String requestH) {
		ResponseBuilder rb = Response.ok().header("Access-Control-Allow-Origin", "*").header("Access-Control-Allow-Methods", "GET, POST, PUT, OPTIONS");
		rb.header("Access-Control-Allow-Headers", requestH);
		return rb.build();
	}
	
	@Path("create/")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Response createContext(@PathParam("coreID") String coreID) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		UserCreateContext action = UserActionModelFactory.eINSTANCE.createUserCreateContext();
		action.initManualAction(cc);
		try {
			action.apply();
		} catch (ElementNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		} catch (FatalSpineFMException e) {
			return RestMethodUtils.launchAndManageWebException(e, 500);
		}
		if (action.getResult() != null) {
			Context ctx = (Context)action.getResult();
			RestMethodUtils.updateModificationDate(coreID);
			return RestMethodUtils.createResponse(ctx.getId());
		} else {
			return RestMethodUtils.launchAndManageWebException(new RuntimeException("Create context action failed during the execution."), 500);
		}
		
	}
	
	@Path("clone/{ctxID}/{de}")
	@OPTIONS
	@Deprecated
	public Response optionsForCloneContext(@HeaderParam("Access-Control-Request-Headers") String requestH) {
		ResponseBuilder rb = Response.ok().header("Access-Control-Allow-Origin", "*").header("Access-Control-Allow-Methods", "GET, POST, PUT, OPTIONS");
		rb.header("Access-Control-Allow-Headers", requestH);
		return rb.build();
	}
	
	@Path("clone/{ctxID}/{de}")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Response cloneContextBasedOnDE(@PathParam("coreID") String coreID, @PathParam("ctxID") String ctxID, @PathParam("de") String deID) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		try {
			UserCloneContext action = UserActionModelFactory.eINSTANCE.createUserCloneContext();
			action.initManualAction(cc);
			action.setContextID(ctxID);
			action.apply();
			Context ctxTarget = (Context)action.getResult();
			return RestMethodUtils.createResponse(ctxTarget.getId());
		} catch (ElementNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		} catch (FatalSpineFMException e) {
			return RestMethodUtils.launchAndManageWebException(e, 500);
		}
	}
	
	@Path("global/")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getGlobalContextID(@PathParam("coreID") String coreID) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		Context context = cc.getGlobalContext();
		return RestMethodUtils.createResponse(context.getId());
	}
}
