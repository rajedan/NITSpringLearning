package com.autowiring.manualwiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Department dept = context.getBean("dept1", Department.class);
		System.out.println("dept1: " + dept);
		Employee emp = context.getBean("emp1", Employee.class);
		System.out.println("emp1: " + emp);
		System.out.println("emp1-dept: " + emp.getDepartment());
		
		dept = context.getBean("dept2", Department.class);
		System.out.println("dept2: " + dept);
		emp = context.getBean("emp2", Employee.class);
		System.out.println("emp2: " + emp);
		System.out.println("emp2-dept: " + emp.getDepartment());
		
		dept = context.getBean("dept2", Department.class);
		System.out.println("dept200: " + dept);
	}
}
