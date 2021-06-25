package com.autowiring.qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(name = "dept1")
	public Department department1() {
		System.out.println("creating-dept1");
		return new Department();
	}

	@Bean(name = "dept2")
	public Department department2() {
		System.out.println("creating-dept2");
		return new Department();
	}

	@Bean(name = "emp")
	public Employee employee1() {
		System.out.println("creating-employee");
		return new Employee();
	}

}
