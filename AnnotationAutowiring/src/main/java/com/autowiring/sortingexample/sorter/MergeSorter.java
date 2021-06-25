package com.autowiring.sortingexample.sorter;

import java.util.Arrays;

public class MergeSorter implements Sorter {

	public void sort(int[] data) {
		// TODO Auto-generated method stub
		System.out.println("merge-sort-is-used");
		Arrays.sort(data);
	}

}
