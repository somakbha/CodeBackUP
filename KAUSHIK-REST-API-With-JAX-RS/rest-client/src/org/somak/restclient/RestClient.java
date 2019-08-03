package org.somak.restclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

import org.somak.message.model.Message;

public class RestClient {
	
	public static void main(String args[]) {
	Client client=ClientBuilder.newClient();
	
	//This kind of method chaining is calls fluent api. Here we chain method one after another till we get the required object.
	Response resp=client.target("http://localhost:8080/messenger1/webapi/messages/1").request().get();
	System.out.println(resp);
	
	//This tell jersey what to read from returned response
	Message message=resp.readEntity(Message.class);
	
	//Get the response as the message "Hello World"
	System.out.println(message.getMessage());
}

}
