package fr.unice.spinefm.rest.service;

import java.util.ArrayList;
import java.util.List;

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

import fr.unice.spinefm.ConfigurationModel.Configuration;
import fr.unice.spinefm.ConfigurationModel.exceptions.ConfigNotFoundException;
import fr.unice.spinefm.HistoryModel.Past;
import fr.unice.spinefm.HistoryModel.Step;
import fr.unice.spinefm.ProcessModel.ContextManager;
import fr.unice.spinefm.rest.command.RestStep;
import fr.unice.spinefm.rest.fms.FeatureModelTransformation;
import fr.unice.spinefm.rest.fms.StatedFeature;
import fr.unice.spinefm.rest.service.utils.RestMethodUtils;

@Path("{coreID}/command/")
public class CommandService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getListOfSteps(@PathParam("coreID") String coreID) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		Past p = cc.getPast();
		List<RestStep> result = new ArrayList<RestStep>();
		
		for (Step s : p.getSteps()) {
			result.add(new RestStep(s));
		}
		
		return RestMethodUtils.createResponse(result);
	}
	
	@Path("undo")
	@OPTIONS
	@Deprecated
	public Response optionsForUndoLastAction(@HeaderParam("Access-Control-Request-Headers") String requestH) {
		ResponseBuilder rb = Response.ok().header("Access-Control-Allow-Origin", "*").header("Access-Control-Allow-Methods", "GET, POST, PUT, OPTIONS");
		rb.header("Access-Control-Allow-Headers", requestH);
		return rb.build();
	}
	
	@Path("undo")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Response undoLastAction(@PathParam("coreID") String coreID) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		Past p = cc.getPast();
		p.undoLastAction();
		
		return RestMethodUtils.createResponse(true);
	}
	
	@Path("undo/{stepID}")
	@OPTIONS
	@Deprecated
	public Response optionsForUndoStep(@HeaderParam("Access-Control-Request-Headers") String requestH) {
		ResponseBuilder rb = Response.ok().header("Access-Control-Allow-Origin", "*").header("Access-Control-Allow-Methods", "GET, POST, PUT, OPTIONS");
		rb.header("Access-Control-Allow-Headers", requestH);
		return rb.build();
	}
	
	@Path("undo/{stepID}")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Response undoStep(@PathParam("coreID") String coreID, @PathParam("stepID") String stepID) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		Past p = cc.getPast();
		Step s = p.getStepFromId(stepID);
		
		if (s != null) {
			p.undoAction(s);
			return RestMethodUtils.createResponse(true);
		} else {
			return RestMethodUtils.launchAndManageWebException("The step cannot be found.",404);
		}
		
		
	}
}
