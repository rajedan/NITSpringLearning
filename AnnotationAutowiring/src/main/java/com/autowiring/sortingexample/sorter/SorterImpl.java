package com.autowiring.sortingexample.sorter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SorterImpl {

	@Autowired
//	@Qualifier("merge")
	private Sorter sorter;

	/**
	 * This API sorts provided data into ascending order
	 * 
	 * @param data
	 */
	public void doSort(int[] data) {
		sorter.sort(data);
	}
}
