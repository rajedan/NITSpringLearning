package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentDaoImpl {

	public Student getStudentById(int id) {
		SessionFactory sf = new Configuration()
				.addAnnotatedClass(Student.class)
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();
		
		Session session = sf.getCurrentSession();
		session.getTransaction().begin();
		
		Student student = session.get(Student.class, id);
		System.out.println(student);
		
		session.getTransaction().commit();
		session.close();
		
		return student;
	}
	
	public Student loadStudentById(int id) {
		SessionFactory sf = new Configuration()
				.addAnnotatedClass(Student.class)
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = sf.getCurrentSession();
		session.getTransaction().begin();
		
		Student student = session.load(Student.class, id);
		System.out.println("************** After load API call **************");
		System.out.println(student);
		
		session.getTransaction().commit();
		session.close();
		
		return student;
	}
}
