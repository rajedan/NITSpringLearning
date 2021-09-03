package com.demo.many2many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.Author;
import com.demo.AuthorDetails;
import com.demo.many2one.Book;

public class Many2ManyDaoImpl {

	public void addReaderOfBook(int bookId, int... readerIds) {

		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Book.class)
				.addAnnotatedClass(Reader.class)
				.addAnnotatedClass(Author.class)
				.addAnnotatedClass(AuthorDetails.class)
				.buildSessionFactory();

		Session session = sf.getCurrentSession();
		session.getTransaction().begin();

		Book book = session.get(Book.class, bookId);
		
		if(book == null)
			throw new RuntimeException("No book found with Id: "+ bookId);
		
		for(int readerId: readerIds) {
			Reader reader = session.get(Reader.class, readerId);
			book.getReaders().add(reader);
		}
		
		session.save(book);
		
		session.getTransaction().commit();
		
		session.close();
		sf.close();
	}
	
	public void addReader(Reader reader) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Reader.class)
				.addAnnotatedClass(Author.class)
				.addAnnotatedClass(AuthorDetails.class)
				.addAnnotatedClass(Book.class)
				.buildSessionFactory();

		Session session = sf.getCurrentSession();
		session.getTransaction().begin();
		
		session.save(reader);
	
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
}
