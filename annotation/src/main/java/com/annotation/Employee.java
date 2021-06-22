package com.annotation;

@MyAnnotation(name = "key-is-here", value = "value-is-here")
public class Employee {
	
	private String empId;
	private String empName;

	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void process() {
		System.out.println("Processing something..");
	}
}
