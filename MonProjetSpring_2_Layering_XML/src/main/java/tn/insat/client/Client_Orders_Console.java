package tn.insat.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tn.insat.business.IOrdersBusiness;

import java.math.BigDecimal;

public class Client_Orders_Console {
	
	private IOrdersBusiness business;
	
	public IOrdersBusiness getBusiness() {
		return business;
	}

	public void setBusiness(IOrdersBusiness business) {
		this.business = business;
	}


	public static void main(String[] args) {

		// Démarrer le conteneur léger (factory) de Spring
		try (ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml")) {

		
			Client_Orders_Console client = 
					context.getBean("client",Client_Orders_Console.class);
			
			BigDecimal total = client.getBusiness().computeTotalOrderPrice("order1");
			System.out.println(" Total of the order : "+total);
			
		} // context.close();

	}
}
