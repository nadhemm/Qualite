package tn.insat.dataaccess;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import tn.insat.domain.Compte;

public class ComptesDaoImplHibernate implements IComptesDao {
	
	private SessionFactory sessionFactory;  // injecté par Spring !
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void create(Compte c) {		
		Session session =  sessionFactory.openSession();		
		Transaction transaction = session.beginTransaction();		
		session.save(c);		
		transaction.commit();		
		session.close();
	}

}
