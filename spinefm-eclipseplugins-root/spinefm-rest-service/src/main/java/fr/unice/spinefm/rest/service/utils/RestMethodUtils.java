package fr.unice.spinefm.rest.service.utils;

import java.util.Date;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import fr.unice.spinefm.ProcessModel.ContextManager;
import fr.unice.spinefm.rest.CoreRegistry;
import fr.unice.spinefm.rest.RestSpineFMInstance;
import fr.unice.spinefm.rest.service.exception.CoreNotExistingException;

public class RestMethodUtils {
	private static final String HEADER_CORS_VALUE = "*";
	
	public static ContextManager getCoreInRESTService(String coreID) {
		try {
			ContextManager c = CoreRegistry.getInstance().getCore(coreID);
			return c;
		} catch (CoreNotExistingException e) {
			ResponseBuilder r = Response.status(404);
			r.entity(e.getMessage());
			r.type(MediaType.TEXT_HTML);
			throw new WebApplicationException(r.build());
		}
	}
	
	public static Response createResponse(Object result) {
		return Response.ok(result)
				.header("Access-Control-Allow-Origin",HEADER_CORS_VALUE)
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Methods","OPTIONS, GET, POST")
				.header("Access-Control-Allow-Headers","Content-Type, Depth, User-Agent, X-File-Size, X-Requested-With, If-Modified-Since, X-File-Name, Cache-Control")
				.build();
	}
	
	public static void updateModificationDate(String coreID) {
		try {
			RestSpineFMInstance rsfmi = CoreRegistry.getInstance().getRestSpineFMInstance(coreID);
			rsfmi.setModificationDate(new Date());
			rsfmi.setFilePath("");
		} catch (CoreNotExistingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Response launchAndManageWebException(Exception e, int errorCode) {
		ResponseBuilder r = Response.status(errorCode);
		r.entity(e.getMessage());
		r.type(MediaType.TEXT_HTML);
		e.printStackTrace();
		throw new WebApplicationException(r.build());
	}
	
	public static Response launchAndManageWebException(String msg, int errorCode) {
		ResponseBuilder r = Response.status(errorCode);
		r.entity(msg);
		r.type(MediaType.TEXT_HTML);
		throw new WebApplicationException(r.build());
	}
}
