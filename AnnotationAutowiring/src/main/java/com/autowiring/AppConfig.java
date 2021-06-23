package com.autowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Department department() {
		// TODO Auto-generated method stub
		System.out.println("Going to create Department..");
		return new Department();
	}

	@Bean("emp")
	public Employee employee() {
		// TODO Auto-generated method stub
		System.out.println("Going to create Employee..");
		return new Employee();
	}
	
	@Bean("emp")
	public Employee employee1() {
		// TODO Auto-generated method stub
		System.out.println("Going to create Employee1..");
		return new Employee();
	}
}
