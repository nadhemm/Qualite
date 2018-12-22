package tn.insat.client;

import org.hibernate.Session;
import tn.insat.domain.Employee;
import tn.insat.domain.Task;
import tn.insat.util.HibernateUtil;

import javax.persistence.Query;
import java.util.List;

public class AppTeching_3_Demo_with_INNER_JOIN_WITH_FETCH {

	public static void main(String[] args) {

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();

            System.out.println("\n Using an INNER JOIN WITH Fetch.... PLEASE NOTICE THE SQL GENERATED !!");

            System.out.println("Note that Only one 'select' statement for the main query was executed, hence the lazy employee#tasks relations were loaded at the same time");

            Query query = session.createQuery("SELECT DISTINCT e FROM Employee e INNER JOIN  FETCH e.tasks t");
            List<Employee> employees = query.getResultList();
            System.out.println("Nombre d'employés : " + employees.size());
            for (Employee employee : employees) {
                System.out.println(String.format("Feching Tasks for the employee:  %s ", employee.getName()));
                List<Task> tasks = employee.getTasks();
                for (Task task : tasks) {
                    System.out.println(String.format("     > Task :  %s ", task.getDescription()));
                }
            }
            session.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
