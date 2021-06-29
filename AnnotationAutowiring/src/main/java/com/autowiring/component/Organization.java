package com.autowiring.component;

import org.springframework.stereotype.Component;

@Component("org")
public class Organization {

	public Organization(Department dept1) {
		// TODO Auto-generated constructor stub
		System.out.println(dept1);
	}
}