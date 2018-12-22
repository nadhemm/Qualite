package tn.insat.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import tn.insat.entities.Compte;
import tn.insat.utilities.HibernateUtil;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Mohamed Romdhani, INSAT Tunis
 */
public class ComptesRepositoryImp_Hibernate implements IComptesRepository {

    public String create(Compte c) {
        String à_retourner = null;
        Transaction transaction = null;
        try (SessionFactory factory = HibernateUtil.getSessionFactory()) {
            Session session = factory.openSession();
            transaction = session.beginTransaction();
            à_retourner = (String) session.save(c);
            transaction.commit();
            session.close();
        } catch (Exception e) {
            if ((transaction != null) && transaction.isActive()) {
                transaction.rollback();
                System.out.println("ATTENTION : Transaction de création annulée");
            }
            System.out.println("ATTENTION : il y a eu l'exception : " + e);
        }
        return à_retourner;
    }

    @Override
    public Compte findById(String id) {

        Compte à_retourner = null;
        try (SessionFactory factory = HibernateUtil.getSessionFactory()) {
            Session session = factory.openSession();
            à_retourner = session.get(Compte.class, id);
            session.close();
        } catch (Exception e) {
            System.out.println("ATTENTION : il y a eu l'exception : " + e);
        }
        return à_retourner;
    }

    @Override
    public List<Compte> findAll() {
        List<Compte> à_retourner = new ArrayList<>();

        try (SessionFactory factory = HibernateUtil.getSessionFactory()) {
            Session session = factory.openSession();
            Query query = session.createQuery("from Compte");
            à_retourner = query.getResultList();
        } catch (Exception e) {
            System.out.println("ATTENTION : il y a eu l'exception : " + e);
        }
        return à_retourner;
    }

    @Override
    public Compte update(Compte c) {
        Compte à_retourner = null;
        Transaction transaction = null;
        try (SessionFactory factory = HibernateUtil.getSessionFactory()) {
            Session session = factory.openSession();
            transaction = session.beginTransaction();
            session.update(c);
            transaction.commit();
            à_retourner = c;
        } catch (Exception e) {
            if ((transaction != null) && transaction.isActive()) {
                transaction.rollback();
                System.out.println("ATTENTION : Transaction de mise à jour annulée");
            }
            System.out.println("ATTENTION : il y a eu l'exception : " + e);
        }
        return à_retourner;
    }

    @Override
    public boolean delete(String id) {
        boolean à_retourner = false;
        Transaction transaction = null;
        try (SessionFactory factory = HibernateUtil.getSessionFactory()) {
            Session session = factory.openSession();
            transaction = session.beginTransaction();
            Compte toBeDeleted = session.get(Compte.class, id);
            session.remove(toBeDeleted);
            transaction.commit();
            session.close();
            à_retourner = true;
        } catch (Exception e) {
            if ((transaction != null) && transaction.isActive()) {
                transaction.rollback();
                System.out.println("ATTENTION : Transaction de suppression annulée");
            }
            System.out.println("ATTENTION : il y a eu l'exception : " + e);
        }
        return à_retourner;
    }
}
