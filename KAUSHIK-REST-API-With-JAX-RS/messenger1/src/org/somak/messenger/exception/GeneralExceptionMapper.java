package org.somak.messenger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.somak.messenger.model.ErrorMessage;

//@Provider
public class GeneralExceptionMapper implements ExceptionMapper<Throwable>{

	@Override
	public Response toResponse(Throwable ex) {
		ErrorMessage msg=new ErrorMessage(ex.getMessage(),500,"https://ndtv.com");
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(msg).build();
	}

}
