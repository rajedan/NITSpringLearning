package com.autowire.bytype;

public class Organization {

	private Department department;
	private NewDepartment newDepartment;
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		System.out.println("in-setDepartment of Organization");
		this.department = department;
	}
	public NewDepartment getNewDepartment() {
		return newDepartment;
	}
	public void setNewDepartment(NewDepartment newDepartment) {
		System.out.println("in-setNewDepartment of Organization");
		this.newDepartment = newDepartment;
	}
}
