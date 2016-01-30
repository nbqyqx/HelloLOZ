package net.neal.linuxone.service;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ws.rs.core.Application;

public class PojoApplication extends Application {
	    
	@Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> list = new HashSet<Class<?>>();
        list.add(BasicResource.class);
        list.add(LinuxONE.class);
        BasicResource.putList("linuxone");
        list.add(UCD.class);
        BasicResource.putList("ucd");
        return list;
    }
	
	
}
