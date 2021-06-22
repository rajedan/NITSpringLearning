package com.annotation.method;

public class App {

	public static void main(String[] args) {
		Department dept = new DepartmentProxy();
		dept.setDeptId(null);

		System.out.println(dept.getDeptId());

		dept = new DepartmentProxy();
		dept.setDeptId("7007");

		System.out.println(dept.getDeptId());
	}
}
