package org.somak.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class PoweredByResourceFilter implements ContainerResponseFilter{

	@Override
	public void filter(ContainerRequestContext req, ContainerResponseContext resp) throws IOException {
		resp.getHeaders().add("X-Powered-By", "java brains");
		
	}

}
