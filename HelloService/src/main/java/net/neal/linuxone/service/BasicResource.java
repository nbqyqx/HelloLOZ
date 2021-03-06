package net.neal.linuxone.service;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/")
public class BasicResource {
	
	@Context UriInfo uriInfo;
	@Context HttpServletRequest req;
	
	private static final String coffeeShopName = "IBM Coffee Shop.";
	private static final Set<String> list =  new HashSet<String>();

    public Set<String> getList() {
		return list;
	}
    
    public static Set<String> putList(String s) {
		list.add(s);
		return list;
	}


	@GET
    @Path("whoareyoujson")
    @Produces("application/json")
    public String sayHelloJson() {
       
        return "I am LinuxONE!";
    }    

    
    @GET
    @Path("hello")
    @Produces("text/plain")
    public String sayHelllo() {
      
    	String s = null;
        try {
			s = "Hello LinuxONE - " + "@" + InetAddress.getLocalHost()  + " - " + (new Date());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
    }
    
    
}
