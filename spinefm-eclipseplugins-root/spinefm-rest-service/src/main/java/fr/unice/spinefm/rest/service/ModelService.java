package fr.unice.spinefm.rest.service;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelFactory;
import fr.unice.spinefm.ActionModel.UserActionModel.UserGenerate;
import fr.unice.spinefm.ActionModel.UserActionModel.UserSavePast;
import fr.unice.spinefm.MSPLModel.DEAssociation;
import fr.unice.spinefm.MSPLModel.DEAssociationEnd;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine;
import fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException;
import fr.unice.spinefm.ProcessModel.ContextManager;
import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.FatalSpineFMException;
import fr.unice.spinefm.rest.CoreRegistry;
import fr.unice.spinefm.rest.RestSpineFMInstance;
import fr.unice.spinefm.rest.model.MultiplicityElementTransformation;
import fr.unice.spinefm.rest.model.RestAsso;
import fr.unice.spinefm.rest.model.RestDE;
import fr.unice.spinefm.rest.model.RestMultiplicityElement;
import fr.unice.spinefm.rest.service.exception.CoreNotExistingException;
import fr.unice.spinefm.rest.service.utils.RestMethodUtils;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

@Path("{coreID}/model/")
public class ModelService {

	private static final String DEFAULT_SAVE_PATH = "/tmp/ycmodel";
	private static final String PATH_GENERATOR_REST = "http://localhost:8080/yourcast-generator/rest/generate/";
	private static final String DIR_GENERATOR_OUTPUT = "/tmp/generated";
	private static final String DEFAULT_PAST_PATH = "/tmp/spinePast";
	
	private static Logger logger = Logger.getLogger(ModelService.class);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDomainModel(@PathParam("coreID") String coreID) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		MultipleSoftwareProductLine mspl = cc.getMspl();
		List<DomainElement> des = mspl.getDomainElements();
		Map<String,RestDE> model = new HashMap<String,RestDE>();
		for (DomainElement domainElement : des) {
			String de = domainElement.getId();
			RestMultiplicityElement multiplicityDE = MultiplicityElementTransformation.transform(domainElement.getMultiplicityElement());
			List<DEAssociation> ldea = domainElement.getBelongs_to();
			List<RestAsso> assos = new ArrayList<RestAsso>();
			List<String> viewed = new ArrayList<String>();
			for (DEAssociation dea : ldea) {
				DEAssociationEnd deaEnd;
				try {
					deaEnd = dea.getOppositeExtremity(domainElement);
					String targetDE = deaEnd.getApply_on().getId();
					if (!viewed.contains(targetDE)) {
						RestMultiplicityElement linkMultiplicity = MultiplicityElementTransformation.transform(deaEnd.getLinkMultiplicity());
						RestAsso ra = new RestAsso(linkMultiplicity, targetDE);
						viewed.add(targetDE);
						assos.add(ra);
					}
				} catch (DomainElementNotFoundException e) {
					return RestMethodUtils.launchAndManageWebException(e, 404);
				}
				
			}
			RestDE rde = new RestDE(multiplicityDE, assos);
			model.put(de, rde);
		}
		return RestMethodUtils.createResponse(model);
	}
	
	@Path("des/")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDomainElements(@PathParam("coreID") String coreID) {
		List<String> result = new ArrayList<String>();

		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		MultipleSoftwareProductLine mspl = cc.getMspl();
		for (DomainElement de : mspl.getDomainElements()) {
			result.add(de.getId());
		}
		return RestMethodUtils.createResponse(result);
	}
	
	@Path("{de}/linkableDES")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getLinkableDomainElement(@PathParam("coreID") String coreID, @PathParam("de") String de) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		MultipleSoftwareProductLine mspl = cc.getMspl();
		try {
			DomainElement domainElement = mspl.getDomainElementByName(de);
			List<DEAssociation> ldea = domainElement.getBelongs_to();
			List<String> result = new ArrayList<String>();
			for (DEAssociation dea : ldea) {
				String targetDE = dea.getOppositeExtremity(domainElement).getApply_on().getId();
				if (!result.contains(targetDE)) {
					result.add(targetDE);
				}
			}
			return RestMethodUtils.createResponse(result);
		} catch (DomainElementNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		}
	}
	
	@Path("{de}/multiplicity")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMultiplicyOfDE(@PathParam("coreID") String coreID, @PathParam("de") String de) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		MultipleSoftwareProductLine mspl = cc.getMspl();
		try {
			DomainElement domainElement = mspl.getDomainElementByName(de);
			RestMultiplicityElement result = MultiplicityElementTransformation.transform(domainElement.getMultiplicityElement());
			return RestMethodUtils.createResponse(result);
		} catch (DomainElementNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		}
	}
	
	@Path("asso/multiplicity/source/{deSource}/target/{deTarget}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMultiplicityOfAssociation(@PathParam("coreID") String coreID, @PathParam("deSource") String deSource, @PathParam("deTarget") String deTarget) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		MultipleSoftwareProductLine mspl = cc.getMspl();
		try {
			DomainElement source = mspl.getDomainElementByName(deSource);
			DomainElement target = mspl.getDomainElementByName(deTarget);
			List<DEAssociation> deaList = mspl.getValidAssociationsForDEs(source, target);
			DEAssociationEnd deaEndTarget = deaList.get(0).getExtremityOfDE(target);
			RestMultiplicityElement result = MultiplicityElementTransformation.transform(deaEndTarget.getLinkMultiplicity());
			return RestMethodUtils.createResponse(result);
		} catch (ElementNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		}
	}
	
	@Path("save/")
	@OPTIONS
	@Deprecated
	public Response optionsForPersistModel(@HeaderParam("Access-Control-Request-Headers") String requestH) {
		ResponseBuilder rb = Response.ok().header("Access-Control-Allow-Origin", "*").header("Access-Control-Allow-Methods", "GET, POST, PUT, OPTIONS");
		rb.header("Access-Control-Allow-Headers", requestH);
		return rb.build();
	}
	
	private String modelDirectoryPath(String coreID) {
		return DEFAULT_SAVE_PATH+"/"+coreID+"/";
	}
	
	@Path("save/")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Response persistModel(@PathParam("coreID") String coreID) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		String path = this.modelDirectoryPath(coreID);
		UserGenerate action = UserActionModelFactory.eINSTANCE.createUserGenerate();
		action.initManualAction(cc);
		action.setPath(path);
		try {
			action.apply();
			RestMethodUtils.updateModificationDate(coreID);
			return RestMethodUtils.createResponse(true);
		} catch (ElementNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		} catch (FatalSpineFMException e) {
			return RestMethodUtils.launchAndManageWebException(e, 500);
		}
		
	}
	
	@Path("savePast/")
	@OPTIONS
	@Deprecated
	public Response optionsForPersistPastModel(@HeaderParam("Access-Control-Request-Headers") String requestH) {
		ResponseBuilder rb = Response.ok().header("Access-Control-Allow-Origin", "*").header("Access-Control-Allow-Methods", "GET, POST, PUT, OPTIONS");
		rb.header("Access-Control-Allow-Headers", requestH);
		return rb.build();
	}
	
	private String pastModelDirectoryPath(String coreID) {
		return DEFAULT_PAST_PATH+"/"+coreID+"/";
	}
	
	private String savePast(String coreID) throws ElementNotFoundException, FatalSpineFMException {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		String path = this.pastModelDirectoryPath(coreID);
		UserSavePast action = UserActionModelFactory.eINSTANCE.createUserSavePast();
		action.initManualAction(cc);
		action.setDestPath(path);
		action.apply();
		return path;
	}
	
	@Path("savePast/")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Response persistPastModel(@PathParam("coreID") String coreID) {
		try {
			savePast(coreID);
			RestMethodUtils.updateModificationDate(coreID);
			return RestMethodUtils.createResponse(true);
		} catch (ElementNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		} catch (FatalSpineFMException e) {
			return RestMethodUtils.launchAndManageWebException(e, 500);
		}
		
	}
	
	@Path("duplicate/")
	@OPTIONS
	@Deprecated
	public Response optionsForDuplicateCore(@HeaderParam("Access-Control-Request-Headers") String requestH) {
		ResponseBuilder rb = Response.ok().header("Access-Control-Allow-Origin", "*").header("Access-Control-Allow-Methods", "GET, POST, PUT, OPTIONS");
		rb.header("Access-Control-Allow-Headers", requestH);
		return rb.build();
	}
	
	@Path("duplicate/")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Response duplicateCore(@PathParam("coreID") String coreID) {
		try {
			String path = savePast(coreID);
			Map<String,String> newCoreID = new HashMap<String,String>();
			newCoreID.put("id", CoreRegistry.getInstance().importCore(path+"past.xmi"));
			return RestMethodUtils.createResponse(newCoreID);
		} catch (ElementNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		} catch (FatalSpineFMException e) {
			return RestMethodUtils.launchAndManageWebException(e, 500);
		}
	}
	
	@Path("saveAllPast/")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response persistAllPastModel() {
		for (RestSpineFMInstance RSInstance : CoreRegistry.getInstance().getAllInstances()) {
			String coreID = RSInstance.getUid();
			ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
			String path = this.pastModelDirectoryPath(coreID);
			UserSavePast action = UserActionModelFactory.eINSTANCE.createUserSavePast();
			action.initManualAction(cc);
			action.setDestPath(path);
			try {
				action.apply();
				RestMethodUtils.updateModificationDate(coreID);
			} catch (ElementNotFoundException e) {
				return RestMethodUtils.launchAndManageWebException(e, 404);
			} catch (FatalSpineFMException e) {
				return RestMethodUtils.launchAndManageWebException(e, 500);
			}
		}
		return RestMethodUtils.createResponse(true);
	}
	
	/*
	@Path("downloadmodel/")
	@PUT
	@Produces("application/zip")
	public Response downloadModels(@PathParam("coreID") String coreID) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		File path = new File(this.modelDirectoryPath(coreID));
		File dest = new File(DEFAULT_SAVE_PATH);
		RestSpineFMInstance rspinefm;
		try {
			rspinefm = CoreRegistry.getInstance().getRestSpineFMInstance(coreID);
			File result = this.generateConfigurationZipFile(dest, path, rspinefm.getDescription());
			return Response.ok(result)
			.header("Access-Control-Allow-Origin","*")
			.header("Access-Control-Allow-Credentials", "true")
			.header("Access-Control-Allow-Methods","OPTIONS, GET, POST")
			.header("Access-Control-Allow-Headers","Content-Type, Depth, User-Agent, X-File-Size, X-Requested-With, If-Modified-Since, X-File-Name, Cache-Control")
			.header("Content-Disposition", "attachment; filename="+result.getName())
			.build();
		} catch (IOException e) {
			return RestMethodUtils.launchAndManageWebException(e, 500);
		} catch (CoreNotExistingException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		}
	}
	
	protected File generateConfigurationZipFile(File dest, File dirToZip, String instanceName) throws IOException
	{
		String zipName= "yc-configuration-"+instanceName+".zip"; 
		File zip= new File(dest,zipName);
		
		FileTool.zip(dirToZip, zip);
		return zip; 
	}*/
	
	@Path("generate/")
	@OPTIONS
	@Deprecated
	public Response optionsForGenerateModel(@HeaderParam("Access-Control-Request-Headers") String requestH) {
		ResponseBuilder rb = Response.ok().header("Access-Control-Allow-Origin", "*").header("Access-Control-Allow-Methods", "GET, POST, PUT, OPTIONS");
		rb.header("Access-Control-Allow-Headers", requestH);
		return rb.build();
	}
	
	@Path("generate/")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Response genreateModel(@PathParam("coreID") String coreID) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		String path = DEFAULT_SAVE_PATH+"/"+coreID+"/";
		String modelName = "configuration.xmi";
		try {
			UserGenerate action = UserActionModelFactory.eINSTANCE.createUserGenerate();
			action.initManualAction(cc);
			action.setPath(path);
			action.apply();
			Client client = Client.create();
			 
			WebResource webResource = client
			   .resource(PATH_GENERATOR_REST);
			
			String generationInputFile = path+modelName;
			String generationOutputDir = DIR_GENERATOR_OUTPUT+"/"+coreID;
			String input = "[\""+generationInputFile+"\",\""+generationOutputDir+"\"]";
	
			ClientResponse response = webResource.type("application/json")
					   .post(ClientResponse.class, input);
	 
			if (response.getStatus() != 200) {
				ResponseBuilder r = Response.status(500);
				r.entity("Error when generating the system. Status : "+response.getStatus());
				r.type(MediaType.TEXT_HTML);
				throw new WebApplicationException(r.build());
			}
	 
			String output = response.getEntity(String.class);
			
			if (output != null && !output.equals("")) {
				RestMethodUtils.updateModificationDate(coreID);
				RestSpineFMInstance rspinefm = CoreRegistry.getInstance().getRestSpineFMInstance(coreID);
				
				rspinefm.setFilePath(output);
				logger.debug("Output of generation : "+output+" | Path in SpineFM instance : "+rspinefm.getFilePath());
				return RestMethodUtils.createResponse(true);
			} else
				return RestMethodUtils.createResponse(false);
		} catch (CoreNotExistingException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		} catch (ElementNotFoundException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		} catch (FatalSpineFMException e) {
			return RestMethodUtils.launchAndManageWebException(e, 500);
		}
	}
	
	@Path("download/")
	@GET
	@Produces("application/zip")
	public Response downloadGeneratedApplication(@PathParam("coreID") String coreID) {
		
		RestSpineFMInstance rspinefm;
		try {
			rspinefm = CoreRegistry.getInstance().getRestSpineFMInstance(coreID);
			if (rspinefm.getFilePath() != null && !rspinefm.getFilePath().equals("")) {
				File result = new File(rspinefm.getFilePath());
				return Response.ok(result)
				.header("Access-Control-Allow-Origin","*")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Methods","OPTIONS, GET, POST")
				.header("Access-Control-Allow-Headers","Content-Type, Depth, User-Agent, X-File-Size, X-Requested-With, If-Modified-Since, X-File-Name, Cache-Control")
				.header("Content-Disposition", "attachment; filename="+result.getName())
				.build();
			} else {
				ResponseBuilder r = Response.status(503);
				r.entity("No file has been generated for this instance.");
				r.type(MediaType.TEXT_HTML);
				throw new WebApplicationException(r.build());
			}
		} catch (CoreNotExistingException e) {
			return RestMethodUtils.launchAndManageWebException(e, 404);
		}
		
		
	}
}
