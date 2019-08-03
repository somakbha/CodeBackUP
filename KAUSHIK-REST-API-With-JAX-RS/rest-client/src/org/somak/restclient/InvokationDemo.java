package org.somak.restclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class InvokationDemo {
	
	public static void main(String[] args)
	{
		InvokationDemo demo=new InvokationDemo();
		Invocation invocation=demo.prepareRequestForMessageByYear(2019);
		Response resp=invocation.invoke();
		System.out.println(resp.getStatus());
	}
	
	
	public Invocation prepareRequestForMessageByYear(int yr) {
		
		//url pattern: http://localhost:8080/messenger1/webapi/messages?year=2019
		Client client=ClientBuilder.newClient();
		Invocation target = client.target("http://localhost:8080/messenger1/webapi/").path("messages").queryParam("year",
				yr).request(MediaType.APPLICATION_JSON).buildGet();
		
		return target;
		
		
	}

}
