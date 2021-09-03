package com.hib.demo.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hib.demo.entity.Student;

public class StudentDAOImpl {

	public void createStudent(Student student) {
		SessionFactory factory = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		session.getTransaction().begin();
		session.save(student);
		session.getTransaction().commit();

	}

	public Student getStudentById(int studentId) {
		SessionFactory sf = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = sf.getCurrentSession();
		session.beginTransaction();// OR session.getTransaction().begin();
		Student student = session.get(Student.class, studentId);
		
		session.getTransaction().commit();//this is optional while reading data from DB
		return student;
	}
	
	public List<Student> getAllStudent() {
		SessionFactory sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = sf.getCurrentSession();
		session.getTransaction().begin();
		Query<Student> query = session.createQuery("From Student s");
		List<Student> students = query.list();
		
		return students;
	}
}
