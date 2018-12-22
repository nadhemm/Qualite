package tn.insat.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL,  fetch = FetchType.LAZY, mappedBy = "employee")

    // @Fetch(FetchMode.SELECT)  // This is the default value
    // @BatchSize(size = 2)
    // @Fetch(FetchMode.JOIN)
    // @Fetch(FetchMode.SUBSELECT)
    private List<Task> tasks;

    public Employee() {
    }
    public Employee(String name, List<Task> tasks) {
        this.name = name;
        this.tasks = tasks;
    }
    public String getName() {
        return name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}