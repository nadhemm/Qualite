package tn.insat.client;

import org.hibernate.Session;
import tn.insat.domain.Employee;
import tn.insat.domain.Task;
import tn.insat.util.HibernateUtil;

import javax.persistence.Query;
import java.util.List;

public class AppTeching_2_Demo_with_INNER_JOIN_WITHOUT_FETCH {

	public static void main(String[] args) {

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();

            System.out.println("\n Using an INNER JOIN WITHOUT Fectch.... PLEASE NOTICE THE SQL GENERATED !!");

            System.out.println("Note that for each employee.getTasks() call, a separate 'select' query was executed");

            Query query = session.createQuery("SELECT DISTINCT e FROM Employee e INNER JOIN e.tasks t");
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
