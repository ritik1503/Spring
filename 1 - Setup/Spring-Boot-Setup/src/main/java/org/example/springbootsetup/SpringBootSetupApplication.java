package org.example.springbootsetup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootSetupApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSetupApplication.class, args);
	}

	@RequestMapping("/ritik")
	public String ritik(@RequestParam(value = "myName" , defaultValue = "World") String name) {
		return "ritik "+name;
	}

}
