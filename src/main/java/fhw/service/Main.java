package fhw.service;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.wildfly.swarm.container.Container; 
import org.wildfly.swarm.jaxrs.JAXRSArchive; 
import fhw.*;
import org.wildfly.swarm.jpa.JPAFraction; 

public class Main 
{

    public static void main(String ... args)
            throws Exception
    {
        Container c = new Container(); 
        JAXRSArchive d = ShrinkWrap.create(JAXRSArchive.class);
        d.addClass(Bank.class); 
        d.addClass(AbstractFacade.class); 
        d.addClass(ApplicationConfig.class); 
        d.addClass(BankFacadeREST.class); 
        d.addAllDependencies();
        //c.applyFractionDefaults(new JPAFraction());
        c.start().deploy(d);                    
    }
    
}
