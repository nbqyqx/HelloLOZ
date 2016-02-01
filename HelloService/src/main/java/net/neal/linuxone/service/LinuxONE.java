package net.neal.linuxone.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/linuxone")
public class LinuxONE {
	
	

    @GET
    @Path("whoareyoujson")
    @Produces("application/json")
    public String sayHelloJson() {
       
        return "I am LinuxONE!";
    }
    
    
    @GET
    @Path("whoareyou")
    @Produces("text/plain")
    public String sayHello() {
       
        return "I am LinuxONE!";
    }
    
    
}
