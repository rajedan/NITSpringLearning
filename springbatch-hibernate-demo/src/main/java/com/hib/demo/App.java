package com.hib.demo;

import java.util.List;

import com.hib.demo.dao.StudentDAOImpl;
import com.hib.demo.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		StudentDAOImpl impl = new StudentDAOImpl();
		/*
		 * Student student = new Student(); student.setId(11112);
		 * student.setCity("Hyderabad"); student.setName("Kiran Kumar");
		 * impl.createStudent(student);
		 */
		/*
		 * Student student = impl.getStudentById(106); System.out.println(student);
		 */
		
		List<Student> students = impl.getAllStudent();
		for(Student student: students)
			System.out.println(student);
		
	}
}
