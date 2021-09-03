package com.demo.many2one;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.Author;
import com.demo.AuthorDetails;

public class Many2OneDaoImpl {

	public void createBook(int authorId, Book book) {
		SessionFactory sf = new Configuration().addAnnotatedClass(Author.class).addAnnotatedClass(AuthorDetails.class)
				.addAnnotatedClass(Book.class).configure("hibernate.cfg.xml").buildSessionFactory();

		Session session = sf.getCurrentSession();
		session.getTransaction().begin();

		Author author = session.get(Author.class, authorId);
		if (author == null)
			throw new RuntimeException("Author not found");

		book.setAuthor(author);
		session.save(book);

		session.getTransaction().commit();
		session.close();
	}

	public List<Book> getBooksByAuthorId(int authorId) {

		SessionFactory sf = new Configuration().addAnnotatedClass(Author.class).addAnnotatedClass(AuthorDetails.class)
				.addAnnotatedClass(Book.class).configure("hibernate.cfg.xml").buildSessionFactory();

		Session session = sf.getCurrentSession();
		session.getTransaction().begin();
		Author author = session.get(Author.class, authorId);
		return author.getBooks();
	}

	public Author getAuthorByBookId(int bookId) {

		SessionFactory sf = new Configuration().addAnnotatedClass(Author.class).addAnnotatedClass(AuthorDetails.class)
				.addAnnotatedClass(Book.class).configure("hibernate.cfg.xml").buildSessionFactory();

		Session session = sf.getCurrentSession();
		session.getTransaction().begin();
		Book book = session.get(Book.class, bookId);
		return book.getAuthor();
	}
}
