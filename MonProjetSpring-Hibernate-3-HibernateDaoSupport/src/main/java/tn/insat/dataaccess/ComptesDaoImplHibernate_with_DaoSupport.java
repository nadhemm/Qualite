package tn.insat.dataaccess;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import tn.insat.domain.Compte;

public class ComptesDaoImplHibernate_with_DaoSupport
                              extends HibernateDaoSupport 
                               implements IComptesDao {	
	
	@Override
	public void create(Compte c) {	
		getHibernateTemplate().save(c);
	}
	@Override
	public Compte findById(String id) {		
		return getHibernateTemplate().get(Compte.class, id);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Compte> findAll() {		
		return (List<Compte>)getHibernateTemplate().find("from Compte");
	}

}
