package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Department dept = context.getBean("department", Department.class);
		Employee emp = context.getBean("emp", Employee.class);

		System.out.println("Department: " + dept);
		System.out.println("Employee: " + emp);
		System.out.println("Employee-Department: " + emp.getDepartment());
		
		dept = context.getBean("department", Department.class);
		System.out.println("Another-Department: " + dept);
		
		emp = context.getBean("emp", Employee.class);
		System.out.println("Employee1: " + emp);
	}
}
