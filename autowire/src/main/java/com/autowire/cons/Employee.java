package com.autowire.cons;

public class Employee {
	private String empId;
	private String empName;
	private Department department;
	private AdvancedeDepartment advDept;
	
	Employee(Department dept1) {
		System.out.println("dept1");
	}
	
	Employee(Department dept10, AdvancedeDepartment dept23) {
		System.out.println("dept1, dept2");
	}
}
