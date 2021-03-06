package com.annotation.method;

public class Department {

	private String deptId;
	private String deptName;

	public String getDeptId() {
		return deptId;
	}

	@MethodAnnotation(name = "department-id", value = "default-id-101")
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
}
