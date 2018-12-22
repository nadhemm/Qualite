package tn.insat.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/hello")
public class HelloRestController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello, Asslama, Bonjour ...";
	}

}
