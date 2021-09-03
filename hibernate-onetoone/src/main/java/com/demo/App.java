package com.demo;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AppDaoImpl impl = new AppDaoImpl();
		
		impl.createAuthor();
	}
}
