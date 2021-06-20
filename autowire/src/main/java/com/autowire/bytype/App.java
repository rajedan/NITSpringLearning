package com.autowire.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("appcontext_bytype.xml");
		
		Department dept = (Department)ctx.getBean("department");
		System.out.println("dept: "+dept);
		
		NewDepartment dept1 = (NewDepartment)ctx.getBean("department1");
		System.out.println("dept: "+dept1);
		System.out.println("--------------------");
		
		Organization org = (Organization)ctx.getBean("org");
		System.out.println("dept1: "+org.getDepartment());
		System.out.println("dept2: "+org.getNewDepartment());
		
	}
}
