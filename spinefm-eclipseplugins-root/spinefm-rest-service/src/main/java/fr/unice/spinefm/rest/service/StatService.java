package fr.unice.spinefm.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fr.unice.spinefm.ProcessModel.ContextManager;
import fr.unice.spinefm.rest.service.utils.RestMethodUtils;
import fr.unice.spinefm.stats.ConfigurationStats;
import fr.unice.spinefm.stats.FMStats;
import fr.unice.spinefm.stats.ModelStats;
import fr.unice.spinefm.stats.ProcessStats;
import fr.unice.spinefm.stats.PropagationStats;
import fr.unice.spinefm.stats.StatsFactory;

@Path("{coreID}/stats/")
public class StatService {
	
	@Path("model")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getModelStats(@PathParam("coreID") String coreID) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		StatsFactory sf = new StatsFactory(cc);
		ModelStats result = sf.getModelStats();
		return RestMethodUtils.createResponse(result);
	}
	
	@Path("fm")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getFMStats(@PathParam("coreID") String coreID) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		StatsFactory sf = new StatsFactory(cc);
		FMStats result = sf.getFMStats();
		return RestMethodUtils.createResponse(result);
	}
	
	@Path("config")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getConfigurationStats(@PathParam("coreID") String coreID) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		StatsFactory sf = new StatsFactory(cc);
		ConfigurationStats result = sf.getConfigurationStats();
		return RestMethodUtils.createResponse(result);
	}
	
	@Path("process")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProcessStats(@PathParam("coreID") String coreID) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		StatsFactory sf = new StatsFactory(cc);
		ProcessStats result = sf.getProcessStats();
		return RestMethodUtils.createResponse(result);
	}
	
	@Path("propagation")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPropagationStats(@PathParam("coreID") String coreID) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		StatsFactory sf = new StatsFactory(cc);
		PropagationStats result = sf.getPropagationStats();
		return RestMethodUtils.createResponse(result);
	}
	
	@Path("propagationTSV")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response getPropagationStatsTSV(@PathParam("coreID") String coreID) {
		ContextManager cc = RestMethodUtils.getCoreInRESTService(coreID);
		StatsFactory sf = new StatsFactory(cc);
		String result = sf.getPropagationStats().toString();
		return RestMethodUtils.createResponse(result);
	}
}
