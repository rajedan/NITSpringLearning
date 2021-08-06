package com.autowiring.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp = context.getBean("emp", Employee.class);
		System.out.println("emp-class: " + emp);
		System.out.println("emp-department: " + emp.getDepartment());
		
		System.out.println("dept: " + context.getBean("dept", Department.class));
	}
}
