package com.hib.demo;

import com.hib.demo.dao.StudentDAOImpl;
import com.hib.demo.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		StudentDAOImpl impl = new StudentDAOImpl();
		Student student = new Student();
		student.setId(11112);
		student.setCity("Hyderabad");
		student.setName("Kiran Kumar");
		impl.createStudent(student);
	}
}
