package com.autowiring.componentsortingexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sortingApp")
public class SortingApp {

	@Autowired
	private SortAlgorithm sortAlgorithm;

	public void sort(int[] data) {
		sortAlgorithm.sort(data);
	}
}
