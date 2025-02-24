package com.bridgeLabz.springconceptsapp;

import com.bridgeLabz.springconceptsapp.model.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringConceptsAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringConceptsAppApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ApplicationContext context) {
		return args -> {
			Employee employee = context.getBean(Employee.class);
			employee.showEmployeeDetails();
		};
	}
}
