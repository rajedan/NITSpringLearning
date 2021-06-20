package com.learning.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
		Employee emp1 = (Employee)context.getBean("employee");
		Department dept1 = (Department)context.getBean("department");
//		Organization org1 = (Organization)context.getBean("");
		
		System.out.println(emp1);
		System.out.println(emp1.getDepartment());
		System.out.println(dept1);
	}
}
