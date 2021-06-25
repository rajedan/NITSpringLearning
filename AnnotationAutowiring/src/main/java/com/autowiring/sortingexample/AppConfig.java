package com.autowiring.sortingexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.autowiring.sortingexample.sorter.BubbleSorter;
import com.autowiring.sortingexample.sorter.MergeSorter;
import com.autowiring.sortingexample.sorter.Sorter;
import com.autowiring.sortingexample.sorter.SorterImpl;

@Configuration
public class AppConfig {

	@Bean("bubble")
	public Sorter bubbleSorter() {
		return new BubbleSorter();
	}

	@Bean("merge")
	public Sorter mergeSorter() {
		return new MergeSorter();
	}

	@Bean("sorterImpl")
	public SorterImpl sorterImpl() {
		return new SorterImpl();
	}
}
