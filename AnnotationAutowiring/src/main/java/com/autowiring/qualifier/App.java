package com.autowiring.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Department dept = context.getBean("dept1", Department.class);
		System.out.println("dept1: " + dept);
		Employee emp = context.getBean("emp", Employee.class);
		System.out.println("emp: " + emp);
		System.out.println("emp-dept: " + emp.getDepartment());
	}
}
