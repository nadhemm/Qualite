package tn.insat.dataaccess;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import tn.insat.domain.Compte;

public class ComptesDaoImplHibernate_with_HibernateTemplate implements
		IComptesDao {
	
	private HibernateTemplate hibernateTemplate;   // injecté par Spring

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Override
	public void create(Compte c) {	
		hibernateTemplate.save(c);
	}
	@Override
	public Compte findById(String id) {		
		return hibernateTemplate.get(Compte.class, id);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Compte> findAll() {		
		return (List<Compte>) hibernateTemplate.find("from Compte");
	}
}
