package com.autowiring.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Autowired
	private Department department;

	public Department getDepartment() {
		return department;
	}
}
