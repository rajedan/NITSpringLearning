package com.demo.many2many;

public class App {

	public static void main(String[] args) {
		Many2ManyDaoImpl impl = new Many2ManyDaoImpl();
		
//		Reader reader1 = new Reader();
//		reader1.setFirstName("Rajesh");
//		reader1.setLastName("Dansena");
//		reader1.setEmail("rajesh@email.com");
//		
//		impl.addReader(reader1);
//		
//		Reader reader2 = new Reader();
//		reader2.setFirstName("Test");
//		reader2.setLastName("User");
//		reader2.setEmail("test@email.com");
//		
//		impl.addReader(reader2);
		
		impl.addReaderOfBook(1, 1, 2);
	}
}
