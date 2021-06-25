package com.autowiring.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	Department department;

	public Department getDepartment() {
		return department;
	}

	@Autowired
	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
