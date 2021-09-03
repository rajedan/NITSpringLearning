package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppDaoImpl {

	public void createAuthor() {
		SessionFactory sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Author.class)
				.addAnnotatedClass(AuthorDetails.class)
				.buildSessionFactory();
		
		Session session = sf.getCurrentSession();
		session.getTransaction().begin();
		Author author = new Author();
		author.setId(40);
		author.setFirstName("first name");
		author.setLastName("last name");
		author.setEmail("first.last@email.com");
		
		AuthorDetails authorDetails = new AuthorDetails();
		authorDetails.setId(400);
		authorDetails.setQualification("Engineering");
		authorDetails.setAddress("hyderabad");
		
		author.setAuthorDetails(authorDetails);
		
		session.save(author);
		session.save(authorDetails);
		
		
		session.getTransaction().commit();
	}
}
