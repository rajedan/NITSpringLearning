package com.autowiring.component;

import org.springframework.stereotype.Component;

@Component("dept")
public class Department {

	public Department() {
		// TODO Auto-generated constructor stub
		System.out.println("creating-department "+this);
	}
}
