package com.autowiring.componentsortingexample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("quick")
@Primary
public class QuickAlgorithm implements SortAlgorithm {
	public QuickAlgorithm() {
		// TODO Auto-generated constructor stub
		System.out.println("creating-quick-sort-algorithm");
	}

	public void sort(int[] data) {
		System.out.println("in-quick-sort-algorithm");
	}
}
