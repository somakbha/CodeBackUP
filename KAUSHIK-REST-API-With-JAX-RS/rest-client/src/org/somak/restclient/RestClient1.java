package org.somak.restclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.somak.message.model.Message;

public class RestClient1 {
	
	public static void main(String args[]) {
	Client client=ClientBuilder.newClient();
	
	WebTarget baseTarget=client.target("http://localhost:8080/messenger1/webapi/");
	WebTarget messageTarget=baseTarget.path("messages");
	WebTarget singleMessageTarget=messageTarget.path("{messageId}");
	
	//Making GET calls
	Message message1 = singleMessageTarget.resolveTemplate("messageId", "1").request(MediaType.APPLICATION_JSON)
				.get(Message.class);
	
	Message message2 = singleMessageTarget.resolveTemplate("messageId", "2").request(MediaType.APPLICATION_JSON)
			.get(Message.class);
	
	
	
	
	System.out.println("Message id 1 obtainde using GET:  "+message1.getMessage());
	System.out.println("Message id 2 obtainde using GET:  "+message2.getMessage());
	
	
	//Making POST calls
	Message newMessage=new Message(3, "message created from jax-rs client", "notan");
	Response postResponse=messageTarget.request().post(Entity.json(newMessage));
	
	Message createdMessage=postResponse.readEntity(Message.class);
	System.out.println("Message created using post:   "+createdMessage.getMessage());
}

}