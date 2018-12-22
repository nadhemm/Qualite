package tn.insat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import tn.insat.model.Employe;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan(basePackages="tn.insat")
public class AppConfiguration {
 
	@Bean     // This is a Producer
	public Employe employe1() {
		return new Employe("Ahmed", 2000);
	}
	
	@Bean
	public Employe employe2() {
		return new Employe("Fatma", 2000);
	}
	
	@Bean
	public List<Employe> staff() {
		return Arrays.asList(employe1(), employe2());
	}
}
