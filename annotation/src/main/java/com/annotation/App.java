package com.annotation;

import java.lang.annotation.Annotation;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Employee emp = new Employee();
		Class<Employee> empClass = Employee.class;
		Annotation[] annotations = empClass.getDeclaredAnnotations();
		for(Annotation ant: annotations) {
			if(ant instanceof MyAnnotation) {
				MyAnnotation antObj = (MyAnnotation) ant;
				System.out.println(antObj.name());
				System.out.println(antObj.value());
			}
		}
	}
}
