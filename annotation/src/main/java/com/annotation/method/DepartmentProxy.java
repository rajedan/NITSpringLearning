package com.annotation.method;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class DepartmentProxy extends Department {

	@Override
	public void setDeptId(String deptId) {
		String id = deptId;
		Class<Department> deptClass = Department.class;
		Method[] methods = deptClass.getDeclaredMethods();
		for (Method method : methods) {
			if (method.getName().equals("setDeptId")) {
				Annotation[] ants = method.getDeclaredAnnotations();
				for (Annotation ant : ants) {
					if (ant instanceof MethodAnnotation)
						id = deptId == null ? ((MethodAnnotation) ant).value() : deptId;
				}
			}
		}
		super.setDeptId(id);
	}

	@Override
	public String getDeptId() {
		return super.getDeptId();
	}
}
