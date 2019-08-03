package org.somak.rest;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Date;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

@Provider //tells jersey that it is a provider for MessageBodyWriter
@Produces(MediaType.TEXT_PLAIN) // tell jersey that this provider is only capable of converting Date to plain
								// text
//<Date> is the raw type from which we want to convert
public class DateMessageBodyWriter implements MessageBodyWriter<Date>{

	
	//jersey will ask this method to check if this MessageBodyWriter is able to convert from Date
	//to plain text. If yes, then only jersey will call its writeTo method.
	@Override
	public boolean isWriteable(Class<?> type, Type arg1, Annotation[] arg2, MediaType arg3) {
		
		//This checks if the given type is Date. We can also do this checking using class name
		//like we did for ParamConverter example
		return Date.class.isAssignableFrom(type);
	}

	@Override
	public void writeTo(Date date, Class<?> type, Type type1, Annotation[] antns, MediaType mt,
			MultivaluedMap<String, Object> mm, OutputStream out) throws IOException, WebApplicationException {
		
		//The OutputStream out is the variable using which we will right into the response body
		
		out.write(date.toString().getBytes());
		
	}

}
