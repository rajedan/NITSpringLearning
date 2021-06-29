package com.autowiring.qualifier2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	@Autowired
	@Qualifier("dept-qual")
	Department department;
	
	@Autowired
	@Qualifier("dept")
	Department department1;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public Department getDepartment1() {
		return department1;
	}

}
