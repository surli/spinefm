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

import fr.unice.spinefm.ActionModel.ActionMode;
import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelFactory;
import fr.unice.spinefm.ActionModel.UserActionModel.UserLinkConfiguration;
import fr.unice.spinefm.ActionModel.UserActionModel.UserRenameElement;
import fr.unice.spinefm.ActionModel.UserActionModel.UserValidConfiguration;
import fr.unice.spinefm.ConfigurationModel.CompositeConfiguration;
import fr.unice.spinefm.ConfigurationModel.Configuration;
import fr.unice.spinefm.ConfigurationModel.Link;
import fr.unice.spinefm.ConfigurationModel.exceptions.ConfigNotFoundException;
import fr.unice.spinefm.ConfigurationModel.exceptions.InvalidAssociationException;
import fr.unice.spinefm.MSPLModel.DEAssociation;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine;
import fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException;
import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;
import fr.unice.spinefm.ProcessModel.Context;
import fr.unice.spinefm.ProcessModel.ContextManager;
import fr.unice.spinefm.ProcessModel.DeletedContextInformations;
import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.FatalSpineFMException;
import fr.unice.spinefm.exceptions.IllegalCallException;
import fr.unice.spinefm.fmengine.exceptions.FMEngineException;
import fr.unice.spinefm.rest.configuration.RestConfigInfo;
import fr.unice.spinefm.rest.configuration.RestLinkInfo;
import fr.unice.spinefm.rest.configuration.RestStatusInfo;
import fr.unice.spinefm.rest.context.ModifiedContext;
import fr.unice.spinefm.rest.fms.FeatureModelTransformation;
import fr.unice.spinefm.rest.fms.StatedFeature;
import fr.unice.spinefm.rest.service.utils.RestMethodUtils;

@Path("{coreID}/config/")
public class ConfigurationService {



	@Path("create/{de}/{ctx}/")
	@OPTIONS
	@Deprecated
	public Response optionsForSetNameToCPS(@HeaderParam("Access-Control-Request-Headers") String requestH) {
		ResponseBuilder rb = Response.ok().header("Access-Control-Allow-Origin", "*").header("Access-Control-Allow-Methods", "GET, POST, PUT, OPTIONS");
		rb.header("Access-Control-Allow-Headers", requestH);
		return rb.build();
	}

	@Path("create/{de}/{ctx}/")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Response createConfigurationFromDEInContext(@PathParam("coreID") String coreID, @PathParam("de") String concept, @PathParam("ctx") String ctx) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		UserValidConfiguration action = UserActionModelFactory.eINSTANCE.createUserValidConfiguration();
		action.initManualAction(cc);
		action.setContextID(ctx);
		action.setDomainElementName(concept);
		try {
			action.apply();
		} catch (ElementNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		} catch (FatalSpineFMException e) {
			return RestMethodUtils.launchAndManageWebException(e, 500);
		}
		RestMethodUtils.updateModificationDate(coreID);
		if (action.getResult() != null) {
			Configuration conf = (Configuration)action.getResult();
			return RestMethodUtils.createResponse(conf.getId());
		} else {
			return RestMethodUtils.launchAndManageWebException(new RuntimeException("Action failed during execution."), 500);
		}
	}

	@Path("{configID}/features")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getListOfStatedFeatureFromConfID(@PathParam("coreID") String coreID, @PathParam("configID") String configID) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		CompositeConfiguration compConf = cc.getGlobalContext().getConfiguration();
		try {
			Configuration conf = compConf.getConfigurationByName(configID);
			List<StatedFeature> result = FeatureModelTransformation.getSFListFromCPS(conf.getCPSRef());
			return RestMethodUtils.createResponse(result);
		} catch (ConfigNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		}
	}

	private List<String> getConfigIDFromConfigList(List<Configuration> confList) {
		List<String> result = new ArrayList<String>();
		for (Configuration cResult : confList) {
			result.add(cResult.getId());
		}
		return result;
	}

	@Path("{configID}/isLinkableWith/{de}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response isLinkableWithDE(@PathParam("coreID") String coreID, @PathParam("configID") String configID, @PathParam("de") String de) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		CompositeConfiguration compConf = cc.getGlobalContext().getConfiguration();
		MultipleSoftwareProductLine mspl = cc.getMspl();
		try {
			Configuration conf = compConf.getConfigurationByName(configID);
			DomainElement target = mspl.getDomainElementByName(de);
			List<DEAssociation> assos = mspl.getValidAssociationsForDEs(conf.getDomainElement(), target);
			if (assos.size() > 0) {
				Boolean b = conf.canBeLinked(assos.get(0));
				return RestMethodUtils.createResponse(b);
			} else {
				throw new ElementNotFoundException("No association can be found for domain elements : "+conf.getDomainElement()+" and "+target);
			}
		} catch (ElementNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		}
	}

	@Path("{configID}/compliant/{de}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getListOfCompatibleConfigurations(@PathParam("coreID") String coreID, @PathParam("configID") String configID, @PathParam("de") String de) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		CompositeConfiguration compConf = cc.getGlobalContext().getConfiguration();
		MultipleSoftwareProductLine mspl = cc.getMspl();
		try {
			Configuration conf = compConf.getConfigurationByName(configID);
			DomainElement target = mspl.getDomainElementByName(de);
			List<DEAssociation> assos = mspl.getValidAssociationsForDEs(conf.getDomainElement(), target);
			List<Configuration> result = new ArrayList<Configuration>();
			if (assos.size() > 0) {
				for (DEAssociation asso : assos) {
					result.addAll(compConf.getCompatibleConfigurations(conf, asso));
				}
				return RestMethodUtils.createResponse(getConfigIDFromConfigList(result));
			} else {
				throw new ElementNotFoundException("No association can be found for domain elements : "+conf.getDomainElement()+" and "+target);
			}
		} catch (ElementNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		} catch (IllegalCallException e) {
			return RestMethodUtils.launchAndManageWebException(e, 500);
		} catch (FMEngineException e) {
			return RestMethodUtils.launchAndManageWebException(e, 500);
		} catch (InvalidAssociationException e) {
			return RestMethodUtils.launchAndManageWebException(e, 500);
		}
	}

	@Path("{configID}/linked/{de}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getListOfLinkedConfigurationOfDomainElement(@PathParam("coreID") String coreID, @PathParam("configID") String configID, @PathParam("de") String de) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		CompositeConfiguration compConf = cc.getGlobalContext().getConfiguration();
		MultipleSoftwareProductLine mspl = cc.getMspl();
		try {
			Configuration conf = compConf.getConfigurationByName(configID);
			DomainElement target = mspl.getDomainElementByName(de);
			List<Configuration> confList = conf.getLinkedConfigurationsOfDomainElement(target);
			return RestMethodUtils.createResponse(getConfigIDFromConfigList(confList));
		} catch (ElementNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 500);
		}
	}

	@Path("link/source/{configIDSource}/target/{configIDTarget}")
	@OPTIONS
	@Deprecated
	public Response optionsForlinkConfigurations(@HeaderParam("Access-Control-Request-Headers") String requestH) {
		ResponseBuilder rb = Response.ok().header("Access-Control-Allow-Origin", "*").header("Access-Control-Allow-Methods", "GET, POST, PUT, OPTIONS");
		rb.header("Access-Control-Allow-Headers", requestH);
		return rb.build();
	}

	@Path("link/source/{configIDSource}/target/{configIDTarget}")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Response linkConfigurations(@PathParam("coreID") String coreID, @PathParam("configIDSource") String configIDSource, @PathParam("configIDTarget") String configIDTarget) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		CompositeConfiguration compConf = cc.getGlobalContext().getConfiguration();
		MultipleSoftwareProductLine mspl = cc.getMspl();
		try {
			Configuration confSource = compConf.getConfigurationByName(configIDSource);
			Configuration confTarget = compConf.getConfigurationByName(configIDTarget);

			List<DEAssociation> deaList = mspl.getValidAssociationsForDEs(confSource.getDomainElement(), confTarget.getDomainElement());
			if (deaList.size() > 0) {
				DEAssociation asso = deaList.get(0);
				UserLinkConfiguration action = UserActionModelFactory.eINSTANCE.createUserLinkConfiguration();
				action.setAssoName(asso.getId());
				action.setConfSourceName(configIDSource);
				action.setConfTargetName(configIDTarget);
				action.initManualAction(cc);
				action.apply();
				if (action.getResult() != null) {
					DeletedContextInformations dci = (DeletedContextInformations)action.getResult();
					RestMethodUtils.updateModificationDate(coreID);
					ModifiedContext result = new ModifiedContext(dci);
					return RestMethodUtils.createResponse(result);
				} else {
					return RestMethodUtils.launchAndManageWebException(new RuntimeException("Link action has failed during execution."), 500);
				}
			} else {
				throw new ElementNotFoundException("No association can be found for domain elements : "+confSource.getDomainElement()+" and "+confTarget.getDomainElement());
			}
		} catch (ElementNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		} catch (FatalSpineFMException e) {
			return RestMethodUtils.launchAndManageWebException(e, 500);
		}
	}

	@Path("{configID}/clone")
	@OPTIONS
	@Deprecated
	public Response optionsForduplicateValidConfiguration(@HeaderParam("Access-Control-Request-Headers") String requestH) {
		ResponseBuilder rb = Response.ok().header("Access-Control-Allow-Origin", "*").header("Access-Control-Allow-Methods", "GET, POST, PUT, OPTIONS");
		rb.header("Access-Control-Allow-Headers", requestH);
		return rb.build();
	}

	/*@Path("{configID}/clone")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Response duplicateValidConfiguration(@PathParam("coreID") String coreID, @PathParam("configID") String configID) {
		SpineFMFacade c = RestMethodUtils.getCoreInRESTService(coreID);
		try {
			Configuration confSource = c.getConfigurationByName(configID);
			Configuration confTarget = c.duplicateValidConfiguration(confSource);
			RestConfigInfo result = new RestConfigInfo(confTarget);
			RestMethodUtils.updateModificationDate(coreID);
			return RestMethodUtils.createResponse(result);
		} catch (ElementNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		} catch (FMEngineException e) {
			return RestMethodUtils.launchAndManageWebException(e, 500);
		}
	}

	@Path("{de}/{ctxID}/clone")
	@OPTIONS
	@Deprecated
	public Response optionsForduplicatePartialConfiguration(@HeaderParam("Access-Control-Request-Headers") String requestH) {
		ResponseBuilder rb = Response.ok().header("Access-Control-Allow-Origin", "*").header("Access-Control-Allow-Methods", "GET, POST, PUT, OPTIONS");
		rb.header("Access-Control-Allow-Headers", requestH);
		return rb.build();
	}

	@Path("{de}/{ctxID}/clone")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Response duplicatePartialConfiguration(@PathParam("coreID") String coreID, @PathParam("de") String domainelement, @PathParam("ctxID") String ctxID) {
		SpineFMFacade c = RestMethodUtils.getCoreInRESTService(coreID);
		try {
			Context context = c.getContextFromName(ctxID);
			DomainElement de = c.getDomainElementOfName(domainelement);
			ConfigurationProcessStep cps = context.getCPSOfDE(de);
			String result = c.duplicatePartialConfiguration(cps);
			RestMethodUtils.updateModificationDate(coreID);
			return RestMethodUtils.createResponse(result);
		} catch (ElementNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		} catch (FMEngineException e) {
			return RestMethodUtils.launchAndManageWebException(e, 500);
		}
	}*/

	@Path("{configID}/name")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getName(@PathParam("coreID") String coreID, @PathParam("configID") String configID) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		CompositeConfiguration compConf = cc.getGlobalContext().getConfiguration();
		try {
			Configuration conf = compConf.getConfigurationByName(configID);
			String result = conf.getDescription();
			return RestMethodUtils.createResponse(result);
		} catch (ConfigNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		}
	}

	@Path("{configID}/name/{name}")
	@OPTIONS
	@Deprecated
	public Response optionsForSetName(@HeaderParam("Access-Control-Request-Headers") String requestH) {
		ResponseBuilder rb = Response.ok().header("Access-Control-Allow-Origin", "*").header("Access-Control-Allow-Methods", "GET, POST, PUT, OPTIONS");
		rb.header("Access-Control-Allow-Headers", requestH);
		return rb.build();
	}

	@Path("{configID}/name/{name}")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Response setName(@PathParam("coreID") String coreID, @PathParam("configID") String configID, @PathParam("name") String name) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		CompositeConfiguration compConf = cc.getGlobalContext().getConfiguration();
		try {
			UserRenameElement ure = UserActionModelFactory.eINSTANCE.createUserRenameElement();
			ure.initManualAction(cc);
			ure.setElementType("config");
			ure.setElementID(configID);
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

	@Path("status")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getStatus(@PathParam("coreID") String coreID) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		CompositeConfiguration compConf = cc.getGlobalContext().getConfiguration();
		List<RestConfigInfo> partialConfigs = new ArrayList<RestConfigInfo>();
		List<RestConfigInfo> validConfigs = new ArrayList<RestConfigInfo>();

		for (Configuration conf : compConf.getSubConfigurations()) {
			validConfigs.add(new RestConfigInfo(conf));
		}

		for (ConfigurationProcessStep cps : cc.getGlobalContext().getCPS()) {
			if (cps.isUserConfig() && cps.getConfiguration() == null) {
				partialConfigs.add(new RestConfigInfo(cps));
			}
		}
		
		for (Context ctx : cc.getLocalContexts()) {
			for (ConfigurationProcessStep cps : ctx.getCPS()) {
				if (cps.isUserConfig() && cps.getConfiguration() == null) {
					partialConfigs.add(new RestConfigInfo(cps));
				}
			}
		}

		RestStatusInfo result = new RestStatusInfo(partialConfigs, validConfigs);
		return RestMethodUtils.createResponse(result);
	}

	@Path("isValid")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getIsCompConfigValid(@PathParam("coreID") String coreID) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		CompositeConfiguration compConf = cc.getGlobalContext().getConfiguration();
		try {
			return RestMethodUtils.createResponse(compConf.isValid());
		} catch (DomainElementNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		}
	}

	@Path("links")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getLinks(@PathParam("coreID") String coreID) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		CompositeConfiguration compConf = cc.getGlobalContext().getConfiguration();
		List<RestLinkInfo> result = new ArrayList<RestLinkInfo>();

		for (Link l : compConf.getLinks()) {
			result.add(new RestLinkInfo(l));
		}
		return RestMethodUtils.createResponse(result);
	}

	@Path("{configID}/isLinked")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response isCompletlyLinked(@PathParam("coreID") String coreID, @PathParam("configID") String configID) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		CompositeConfiguration compConf = cc.getGlobalContext().getConfiguration();
		try {
			Configuration conf = compConf.getConfigurationByName(configID);
			Boolean result = conf.isCompletlyLinked();
			return RestMethodUtils.createResponse(result);
		} catch (ConfigNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		} catch (DomainElementNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		}

	}
}
