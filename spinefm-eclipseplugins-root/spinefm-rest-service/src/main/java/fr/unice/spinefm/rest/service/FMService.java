package fr.unice.spinefm.rest.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import fr.unice.spinefm.ActionModel.UserActionModel.UserAction;
import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelFactory;
import fr.unice.spinefm.ActionModel.UserActionModel.UserDeselect;
import fr.unice.spinefm.ActionModel.UserActionModel.UserPropagate;
import fr.unice.spinefm.ActionModel.UserActionModel.UserRenameElement;
import fr.unice.spinefm.ActionModel.UserActionModel.UserSelect;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine;
import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;
import fr.unice.spinefm.ProcessModel.Context;
import fr.unice.spinefm.ProcessModel.ContextManager;
import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.FatalSpineFMException;
import fr.unice.spinefm.fmengine.exceptions.FMEngineException;
import fr.unice.spinefm.rest.fms.FeatureModelTransformation;
import fr.unice.spinefm.rest.fms.StatedFeature;
import fr.unice.spinefm.rest.fms.StatedFeatureModel;
import fr.unice.spinefm.rest.service.utils.RestMethodUtils;

@Path("{coreID}/fm/")
public class FMService {

	@Path("global/{de}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getGlobalFM(@PathParam("coreID") String coreID, @PathParam("de") String concept) {
		try {
			ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
			MultipleSoftwareProductLine mspl = cc.getMspl();
			Context cont = cc.getGlobalContext();
			DomainElement de = mspl.getDomainElementByName(concept);
			ConfigurationProcessStep cps = cont.getCPSOfDE(de);
			StatedFeatureModel result = FeatureModelTransformation.getSFMFromCPS(cps);
			return RestMethodUtils.createResponse(result);
		} catch (ElementNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		}
	}

	@Path("ctx/{ctx}/{de}/")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getContextSpecificFM(@PathParam("coreID") String coreID, @PathParam("de") String concept, @PathParam("ctx") String ctx) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		MultipleSoftwareProductLine mspl = cc.getMspl();
		try {
			Context context = cc.getContextFromId(ctx);
			DomainElement de = mspl.getDomainElementByName(concept);
			ConfigurationProcessStep cps = context.getCPSOfDE(de);
			List<StatedFeature> result = FeatureModelTransformation.getSFListFromCPS(cps);
			return RestMethodUtils.createResponse(result);
		} catch (ElementNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		}
	}

	@Path("ctx/{ctx}/{de}/isvalid")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response isConfigurationComplete(@PathParam("coreID") String coreID, @PathParam("de") String concept, @PathParam("ctx") String ctx) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		MultipleSoftwareProductLine mspl = cc.getMspl();
		try {
			Context context = cc.getContextFromId(ctx);
			DomainElement de = mspl.getDomainElementByName(concept);
			ConfigurationProcessStep cps = context.getCPSOfDE(de);
			boolean result = cps.isComplete();
			return RestMethodUtils.createResponse(result);
		} catch (ElementNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		} catch (FMEngineException e) {
			return RestMethodUtils.launchAndManageWebException(e, 500);
		}
	}
	
	@Path("ctx/{ctx}/{de}/{action}/{ft}")
	@OPTIONS
	@Deprecated
	public Response optionsFordoActionOnFeatureInFM(@HeaderParam("Access-Control-Request-Headers") String requestH) {
		ResponseBuilder rb = Response.ok().header("Access-Control-Allow-Origin", "*").header("Access-Control-Allow-Methods", "GET, POST, PUT, OPTIONS");
		rb.header("Access-Control-Allow-Headers", requestH);
		return rb.build();
	}

	@Path("ctx/{ctx}/{de}/{action}/{ft}")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Response doActionOnFeatureInFM(@PathParam("coreID") String coreID, @PathParam("de") String concept, @PathParam("ctx") String ctx, @PathParam("ft") String ft, @PathParam("action") String actionName) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		MultipleSoftwareProductLine mspl = cc.getMspl();
		UserAction action;
		try {
			if (actionName.toLowerCase().equals("select")) {
				UserSelect select = UserActionModelFactory.eINSTANCE.createUserSelect();
				select.setContextID(ctx);
				select.setDomainElementName(concept);
				select.setFeatureName(ft);
				action = select;
			} else if (actionName.toLowerCase().equals("deselect")) {
				UserDeselect deselect = UserActionModelFactory.eINSTANCE.createUserDeselect();
				deselect.setContextID(ctx);
				deselect.setDomainElementName(concept);
				deselect.setFeatureName(ft);
				action = deselect;
			} else {
				ResponseBuilder r = Response.status(405);
				r.entity("Action must 'select' or 'deselect' only.");
				r.type(MediaType.TEXT_HTML);
				throw new WebApplicationException(r.build());
			}
			action.initManualAction(cc);
			action.apply();
			UserPropagate propagate = UserActionModelFactory.eINSTANCE.createUserPropagate();
			propagate.setContextID(ctx);
			propagate.setDomainElementName(concept);
			propagate.initManualAction(cc);
			propagate.apply();
			Context context = cc.getContextFromId(ctx);
			DomainElement de = mspl.getDomainElementByName(concept);
			ConfigurationProcessStep cps = context.getCPSOfDE(de);
			List<StatedFeature> result = FeatureModelTransformation.getSFListFromCPS(cps);
			RestMethodUtils.updateModificationDate(coreID);
			return RestMethodUtils.createResponse(result);
		} catch (ElementNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		} catch (FatalSpineFMException e) {
			return RestMethodUtils.launchAndManageWebException(e, 500);
		}
	}


	@Path("ctx/{ctx}/{de}/name/")
	@OPTIONS
	@Deprecated
	public Response optionsForSetNameToCPS(@HeaderParam("Access-Control-Request-Headers") String requestH) {
		ResponseBuilder rb = Response.ok().header("Access-Control-Allow-Origin", "*").header("Access-Control-Allow-Methods", "GET, POST, PUT, OPTIONS");
		rb.header("Access-Control-Allow-Headers", requestH);
		return rb.build();
	}

	@Path("ctx/{ctx}/{de}/name/")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Response setNameToCPS(@PathParam("coreID") String coreID, @PathParam("de") String concept, @PathParam("ctx") String ctx, String name) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		MultipleSoftwareProductLine mspl = cc.getMspl();
		Context context;
		try {
			context = cc.getContextFromId(ctx);
			DomainElement de = mspl.getDomainElementByName(concept);
			ConfigurationProcessStep cps = context.getCPSOfDE(de);
			
			UserRenameElement ure = UserActionModelFactory.eINSTANCE.createUserRenameElement();
			ure.initManualAction(cc);
			ure.setElementType("cps");
			ure.setElementID(cps.getId());
			ure.setName(name);
			ure.apply();
			
			RestMethodUtils.updateModificationDate(coreID);
			return RestMethodUtils.createResponse(true);
		} catch (ElementNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		} catch (FatalSpineFMException e) {
			return RestMethodUtils.launchAndManageWebException(e, 500);
		}
	}

	@Path("ctx/{ctx}/{de}/name/")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getNameFromCPS(@PathParam("coreID") String coreID, @PathParam("de") String concept, @PathParam("ctx") String ctx) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		MultipleSoftwareProductLine mspl = cc.getMspl();
		Context context;
		try {
			context = cc.getContextFromId(ctx);
			DomainElement de = mspl.getDomainElementByName(concept);
			ConfigurationProcessStep cps = context.getCPSOfDE(de);
			String name = cps.getDescription();
			return RestMethodUtils.createResponse(name);
		} catch (ElementNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		}
	}
}
