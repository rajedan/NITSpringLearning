package com.autowiring.qualifier2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(name = "dept")
	@Qualifier("dept-qual")
	public Department department1() {
		System.out.println("creating-dept");
		return new Department();
	}
	
	@Bean(name = "emp")
	public Employee employee1() {
		System.out.println("creating-employee");
		return new Employee();
	}

}
