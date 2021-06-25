package com.autowiring.autowired;

import org.springframework.context.annotation.Bean;

public class AppConfig {

	@Bean(name="dept")
	public Department department() {
		System.out.println("dept");
		return new Department();
	}
	
	@Bean(name="dept")
	public Department department1() {
		System.out.println("dept1");
		return new Department();
	}
	
	@Bean(name="emp")
	public Employee employee() {
		System.out.println("employee");
		return new Employee();
	}
	
}
