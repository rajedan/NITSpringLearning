package com.autowire.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("appcontext_byname.xml");
		
		Employee emp = context.getBean("employee", Employee.class);
		
		Department dept = context.getBean("department", Department.class);
		
		System.out.println("emp-object: "+emp.getDepartment());
		System.out.println("emp-object: "+dept);
	}
}
