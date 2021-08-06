package com.jdbcdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		AppDao appDao = context.getBean("appDao", AppDao.class);
		appDao.saveStundentUsingSimpleJDBCInsert();
	}
}
