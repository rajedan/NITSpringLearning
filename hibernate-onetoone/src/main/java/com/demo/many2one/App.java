package com.demo.many2one;

import java.util.List;

import com.demo.Author;

public class App {

	public static void main(String[] args) {
		Many2OneDaoImpl impl = new Many2OneDaoImpl();

//		Book book1 = new Book();
//		book1.setTitle("Java Fundamental");
//		impl.createBook(10, book1);
//
//		Book book2 = new Book();
//		book2.setTitle("CPP Fundamental");
//		impl.createBook(10, book2);
//
//		List<Book> books = impl.getBooksByAuthorId(10);
//		for (Book myBook : books)
//			System.out.println(myBook);
		
		Author author = impl.getAuthorByBookId(1);
		System.out.println(author);
	}
}
