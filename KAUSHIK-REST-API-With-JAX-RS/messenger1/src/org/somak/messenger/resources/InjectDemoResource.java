package org.somak.messenger.resources;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.UriInfo;


@Path("/injectdemo")
public class InjectDemoResource {
	
	@GET
	@Path("annotations")
	public String getParamsUsingAnnotations(
			@MatrixParam("param") String matrixParam,
			@HeaderParam("authSessionId") String header,
			@CookieParam("name") String cookie) {
		return "Matrix Param: "+matrixParam+" Header Param: "+header+" Cookie param: "+cookie;
		
	}
	
	@GET
	@Path("context")
	public String getParamsUsingAnnotations(
			@Context UriInfo uriInfo, @Context HttpHeaders httpHeaders) {
		return "Path: "+uriInfo.getAbsolutePath().toString()+" Cookie Values: "+httpHeaders.getCookies();
		
	}
	
	

}