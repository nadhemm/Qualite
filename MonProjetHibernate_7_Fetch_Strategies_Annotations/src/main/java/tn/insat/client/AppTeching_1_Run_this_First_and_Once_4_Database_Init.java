package tn.insat.client;

import org.hibernate.Session;
import org.hibernate.Transaction;
import tn.insat.domain.Employee;
import tn.insat.domain.Task;
import tn.insat.util.HibernateUtil;

import java.util.Arrays;

public class AppTeching_1_Run_this_First_and_Once_4_Database_Init {

	public static void main(String[] args) {

		Session session = null;
		Transaction tx = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			tx = session.beginTransaction();
			System.out.println("\nInitializing data....");
			Task task1 = new Task("Coding");
			Task task2 = new Task("Refactoring");
			Task task3 = new Task("Designing");
			Task task4 = new Task("Documentation");

			Employee employee1 = new Employee("Fatma", Arrays.asList(task1));
			Employee employee2 = new Employee("Ahmed", Arrays.asList(task2, task3));
			Employee employee3 = new Employee("Salah", Arrays.asList(task4));
			Employee employee4 = new Employee("Ali", null);

			task1.setEmployee(employee1);
			task2.setEmployee(employee2);
			task3.setEmployee(employee2);
			task4.setEmployee(employee3);

			session.save(employee1);
			session.save(employee2);
			session.save(employee3);
			session.save(employee4);

			System.out.println("\nData Initialised");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			tx.commit();
			session.close();
		}
	}


}
