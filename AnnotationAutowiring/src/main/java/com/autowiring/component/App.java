package com.autowiring.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Employee emp = context.getBean("employee", Employee.class);
		System.out.println("employee: " + emp);
		System.out.println("employee-department: " + emp.getDepartment());

		Department department = context.getBean("department", Department.class);
		System.out.println("department: " + department);
	}
}