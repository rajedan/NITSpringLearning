package com.autowire.cons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("appcontext_cons.xml");
		Employee emp = (Employee)ctx.getBean("emp");
	}
}
