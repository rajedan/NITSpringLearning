package com.autowiring.componentsortingexample;

import org.springframework.stereotype.Component;

@Component("bubble")
public class BubbleAlgorithm implements SortAlgorithm {

	public BubbleAlgorithm() {
		// TODO Auto-generated constructor stub
		System.out.println("creating-bubble-sort-algorithm");
	}

	public void sort(int[] data) {
		// TODO Auto-generated method stub
		System.out.println("in-bubble-sort-algorithm");
	}
}
