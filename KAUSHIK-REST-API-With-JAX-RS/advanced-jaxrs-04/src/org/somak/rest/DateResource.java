package org.somak.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("date/{datestring}")
public class DateResource {
	
	
	@GET
	@Produces (MediaType.TEXT_PLAIN)
	//here from String to MyDate conversion is happening
	public String test(@PathParam("datestring") MyDate dateInstanceValue)
	{
		//here from MyDate instance to String conversion is happening
		return "Got "+dateInstanceValue;
	}

}
