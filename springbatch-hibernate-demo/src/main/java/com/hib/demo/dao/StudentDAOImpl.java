package com.hib.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hib.demo.entity.Student;

public class StudentDAOImpl {

	public void createStudent(Student student) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		session.getTransaction().begin();
		session.save(student);
		session.getTransaction().commit();
		
	}
}
