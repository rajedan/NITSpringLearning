package com.autowiring.sortingexample;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.autowiring.sortingexample.sorter.SorterImpl;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);

		SorterImpl sorterImpl = context.getBean("sorterImpl", SorterImpl.class);
		int[] input = { 4, 1, 3, 2, 5, 9, 21 };
		sorterImpl.doSort(input);
		System.out.println(Arrays.toString(input));
	}
}
