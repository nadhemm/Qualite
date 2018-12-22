package tn.insat.client;

import org.hibernate.Session;
import tn.insat.domain.Employee;
import tn.insat.domain.Task;
import tn.insat.util.HibernateUtil;

import javax.persistence.Query;
import java.util.List;

public class AppTeching_4_Demo_with_LEFT_JOIN_WITH_FETCH {

	public static void main(String[] args) {

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();

            System.out.println("\n Using an LEFT JOIN WITH Fetch.... PLEASE NOTICE THE SQL GENERATED !!");

            System.out.println("Note that even though the entity Ali doesn't have any tasks, it is also returned as compared to our last INNER JOIN example. Also at the same time, only one 'select' statement was executed because of the 'FETCH' option");

            Query query = session.createQuery("SELECT DISTINCT e FROM Employee e LEFT JOIN  FETCH e.tasks t");
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
