package org.somak.filter;

import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import org.glassfish.jersey.internal.util.Base64;

@Provider
public class SecurityFilter implements ContainerRequestFilter {

	private static final String AUTHORIZATION_HEADER_KEY = "Authorization";
	private static final String AUTHORIZATION_HEADER_PREFIX = "Basic ";
	private static final String SECURED_URL_PREFIX = "secured";

	@Override
	public void filter(ContainerRequestContext req) throws IOException {

		if(req.getUriInfo().getPath().contains(SECURED_URL_PREFIX)) {
		List<String> authHeader = req.getHeaders().get(AUTHORIZATION_HEADER_KEY);

		if (authHeader!=null && authHeader.size() > 0) {
			String authToken = authHeader.get(0);
			authToken = authToken.replaceFirst(AUTHORIZATION_HEADER_PREFIX, "");
			String decodedString = Base64.decodeAsString(authToken);
			StringTokenizer tokenizer = new StringTokenizer(decodedString, ":");
			String userName = tokenizer.nextToken();
			String password = tokenizer.nextToken();

			if ("user".equals(userName) && "password".equals(password)) {

				// This return implies that jaxrs can now process with the actual request and
				// call the resource
				return;
			}
		}

		Response unAutorizedStatus = Response.status(Response.Status.UNAUTHORIZED)
				.entity("User cannot access this request").build();
		req.abortWith(unAutorizedStatus);
		
	}
	}

}
