package com.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private Department department;
	
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Creating Employee..");
	}

	public Department getDepartment() {
		return department;
	}

	@Autowired
	public void setDepartment(Department department) {
		this.department = department;
	}
}
