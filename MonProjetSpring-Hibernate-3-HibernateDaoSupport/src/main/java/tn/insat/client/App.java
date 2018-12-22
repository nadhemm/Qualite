package tn.insat.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tn.insat.dataaccess.ComptesDaoImplHibernate_with_DaoSupport;
import tn.insat.dataaccess.IComptesDao;
import tn.insat.domain.Compte;

public class App {

	public static void main(String[] args) {

		System.out
				.println("Illustration d'un DAO Hibernate avec HibernateDaoSupport");

		// Start the factory
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");

		// Get the bean
		IComptesDao dao = context
				.getBean(ComptesDaoImplHibernate_with_DaoSupport.class);

		// Use the bean
		for (Compte compte : dao.findAll()) {
			System.out.println("===> " + compte);
		}

		// Clean up
		context.close();

		System.out.println("Fin du programme !");

	}
}
