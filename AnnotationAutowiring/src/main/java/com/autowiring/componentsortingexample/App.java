package com.autowiring.componentsortingexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		SortingApp app = ctx.getBean("sortingApp", SortingApp.class);
		app.sort(new int[] { 11, 20, 3 });
	}
}
