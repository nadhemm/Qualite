package tn.insat.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import tn.insat.domain.Order;
import tn.insat.domain.Product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Configuration     // Configuration class : Replacement for beans.xml
@ComponentScan(basePackages="tn.insat")
public class AppConfiguration {	

	@Bean      // Producers
	public List<Order> orders () {
		return Arrays.asList(
				new Order("order1", 
						LocalDate.now(), 
						 Arrays.asList(
								 new Product("A100", "AAAA",BigDecimal.TEN),
								 new Product("B100", "BBBB",BigDecimal.TEN))
						));
	}
}
