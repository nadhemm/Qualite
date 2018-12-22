package tn.insat.utilities;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Mohamed Romdhani, INSAT Tunis
 */
public class HibernateUtil {

	private static SessionFactory factory;

	static { // L'initialisation statique guarantie que la factory est un SINGLETON

		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Exception e) {
			System.err.println("ATTENTION, il y a eu une exception lors de la creation de la factory : " + e);
			throw new ExceptionInInitializerError(e);
		}
	}

	public static SessionFactory getSessionFactory() {
		return factory;
	}

}
