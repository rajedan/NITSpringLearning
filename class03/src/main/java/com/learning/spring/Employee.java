package com.learning.spring;

public class Employee {

	private int empId;
	private String firstName;
	private String lastName;
	private Department department1;
	
	public Employee() {
	}
	
	public Employee(Department department) {
		this.department1 = department;
	}

	public Department getDepartment() {
		return department1;
	}

	public void setDepartment(Department department12) {
		this.department1 = department12;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
