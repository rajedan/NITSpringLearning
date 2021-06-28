package com.autowiring.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackageClasses = {Department.class})
@ComponentScan(basePackages = { "com.autowiring.autowired", "com.autowiring.component" })

public class AppConfig {

	@Bean
	public Department department() {
		System.out.println("loading-department");
		return new Department();
	}
}
