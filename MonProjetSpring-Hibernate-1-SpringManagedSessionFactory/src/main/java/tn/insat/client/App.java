package tn.insat.client;

import java.math.BigDecimal;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tn.insat.dataaccess.ComptesDaoImplHibernate;
import tn.insat.dataaccess.IComptesDao;
import tn.insat.domain.Compte;


public class App 
{   
	public static void main( String[] args )
    {    	
		System.out.println("Illustration d'un DAO Hibernate simple");
		
        // Start the factory
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
    	// Get the bean
    	IComptesDao any_name = context.getBean(ComptesDaoImplHibernate.class); 	
    	
    	// Use with the bean
    	any_name.create(new Compte("A300", "Rod Johnson (Spring creator)", new BigDecimal("100.5")));    	
    	
    	// Clean up
        context.close();
        
        System.out.println("Fin du programme !");    
    }
}
