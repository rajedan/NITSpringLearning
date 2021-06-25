package com.autowiring.sortingexample.sorter;

import java.util.Arrays;

public class BubbleSorter implements Sorter {

	public void sort(int[] data) {
		// TODO Auto-generated method stub
		System.out.println("bubble-sort-is-used");
		Arrays.sort(data);
	}

}
