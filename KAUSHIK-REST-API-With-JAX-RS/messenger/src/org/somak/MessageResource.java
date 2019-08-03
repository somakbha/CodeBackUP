package org.somak.messenger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/messages")
public class MessageResource {
	
	MessageService msgService = new MessageService();

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getMessages() {
		return "<i>Hello World!</i>";
	}
	
	
	
}
