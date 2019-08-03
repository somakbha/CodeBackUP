package org.somak.rest;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


//Commenting out the singleton will enable default behavior which means count will be re-initialized and with every request a new object of My Resource will be created.
@Singleton
@Path("test")
public class MyResource {
	
	int count=0;
	@GET
	@Produces (MediaType.TEXT_PLAIN)
	public String test()
	{
		count=count+1;
		return "It works!!!. The method has been called "+count+" times";
	}

}
