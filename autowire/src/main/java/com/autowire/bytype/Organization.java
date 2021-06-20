package com.autowire.bytype;

public class Organization {

	private Department department;
	private NewDepartment newDepartment;
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public NewDepartment getNewDepartment() {
		return newDepartment;
	}
	public void setNewDepartment(NewDepartment newDepartment) {
		this.newDepartment = newDepartment;
	}
}
