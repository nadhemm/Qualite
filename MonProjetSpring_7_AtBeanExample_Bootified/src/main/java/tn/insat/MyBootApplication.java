package tn.insat;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tn.insat.model.Employe;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class MyBootApplication {

    //@Autowired
    //Employe e;
    @Bean     // This is a Producer
    public Employe employe1() {
        return new Employe("Ahmed", 2000);
    }

    @Bean
    public Employe employe2() {
        return new Employe("Fatma", 2000);
    }

    @Bean
    public Employe employe3() { return new Employe("Sami", 1500); }


    @Bean
    public List<Employe> staff() {
        return Arrays.asList(employe1(), employe2());
    }

    public static void main(String[] args) {
        SpringApplication.run(MyBootApplication.class, args);
    }

    @Bean
    public CommandLineRunner run() {
        return args -> System.out.println(staff());
    }
}
