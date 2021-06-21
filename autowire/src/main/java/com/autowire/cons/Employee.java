package com.autowire.cons;

import java.util.List;

public class Employee {
	private String empId;
	private String empName;
	private Department department;
	private AdvancedeDepartment advDept;
	
	Employee(Department dept1) {
		System.out.println("dept1");
	}

	Employee(Department dept1, AdvancedeDepartment dept2) {
		System.out.println("dept1, dept2");
	}
	
	Employee(AdvancedeDepartment dept2, Department dept1) {
		System.out.println("dept2 dept1");
	}
	
	Employee(List<Department> dept1s, AdvancedeDepartment dept23) {
		System.out.println("list-dept1, dept2");
	}
	
	Employee(Department dept1s, List<AdvancedeDepartment> dept23) {
		System.out.println("dept1, list-dept2");
	}
	Employee(List<Department> dept1s, List<AdvancedeDepartment> dept23) {
		System.out.println("list-dept1, list-dept2");
	}
}
