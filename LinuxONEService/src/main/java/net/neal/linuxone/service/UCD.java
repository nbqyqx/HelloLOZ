package net.neal.linuxone.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/ucd")
public class UCD {
	
	

    @GET
    @Path("whoareyoujson")
    @Produces("application/json")
    public String sayHelloJson() {
       
        return "I am Urban Code!";
    }
    
    
    @GET
    @Path("whoareyou")
    @Produces("text/plain")
    public String sayHello() {
       
        return "I am Urban Code!";
    }
    
    
}
