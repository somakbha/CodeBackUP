package org.somak.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("secured")
public class MyResource {
	
	@GET
	@Produces (MediaType.TEXT_PLAIN)
	@Path("message")
	public String test()
	{
		return "This API is a secured API!!!";
	}

}
