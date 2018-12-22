package tn.insat.client;

import org.hibernate.Session;
import org.hibernate.Transaction;
import tn.insat.entities.Department;
import tn.insat.util.HibernateUtil;

public class TestCache {

	public static void main(String[] args) {
		getData();
		System.out.println("\nCalling getData() second time....");
		getData();
		HibernateUtil.getSessionFactory().close();
	}

	private static void getData() {
		Session session = null;
		Transaction tx = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			tx = session.beginTransaction();
			System.out.println("\nRetrieving data....");

			Department department = (Department) session.load(Department.class, new Long(1));
			System.out.println("Department retrieved: " + department);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			tx.commit();
			session.close();
		}
	}


}
