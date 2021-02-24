package net.codejava.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello(){
		
		return "Hello Everyone , From AKash -PLAIN TEXT  :)";
		
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHTML(@QueryParam("name") String name, @QueryParam("surname") String surname) {
		
		return "<html><title>Hello Application </title> <body>"
				+ "<h1>Hello "+name+" "+surname+", Thanks for calling me </h1></body></html>";
		
	}

}
