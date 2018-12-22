package tn.insat.client;

import java.math.BigDecimal;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tn.insat.dataaccess.ComptesDaoImplHibernate_with_HibernateTemplate;
import tn.insat.dataaccess.IComptesDao;
import tn.insat.domain.Compte;




public class App {
   
	public static void main( String[] args ) {
    	
		System.out.println("Illustration d'un DAO Hibernate avec HibernateTemplate");
		
        // Start the factory
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
    	// Get the bean
    	IComptesDao any_name = context.getBean(ComptesDaoImplHibernate_with_HibernateTemplate.class); 	
    	
    	// Use the bean
    	any_name.create(new Compte("A2019", "Martin Fowler", new BigDecimal("200.5")));    	
    	
    	// Clean up
        context.close();
        
        System.out.println("Fin du programme !");    
    }
}
