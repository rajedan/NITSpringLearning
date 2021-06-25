package com.autowiring.manualwiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class AppConfig {

	@Bean(name="dept1")
	public Department department1() {
		System.out.println("creating-dept1");
		return new Department();
	}
	
	@Bean(name="dept2")
	public Department department2() {
		System.out.println("creating-dept2");
		return new Department();
	}
	
	@Bean(name="emp1")
	public Employee employee1() {
		System.out.println("creating-employee1");
		Employee emp = new Employee();
		emp.setDepartment(department1());
		return emp;
	}
	
	@Bean(name="emp2")
	public Employee employee2() {
		System.out.println("creating-employee2");
		Employee emp = new Employee();
		emp.setDepartment(department2());
		return emp;
	}
}
