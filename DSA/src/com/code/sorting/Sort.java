package com.code.sorting;

import java.util.Arrays;

public class Sort {
	
	public static void main(String[] args) {
		
		int[] arr = {4,2,3,6,1,9,5,8};
		
		
		long startTime = System.currentTimeMillis();
		SelectionSort selectionSort = new SelectionSort();
		System.out.println(Arrays.toString(selectionSort.sort(arr)));
		long endTime = System.currentTimeMillis();
		System.out.println("Selection sort: "+(endTime-startTime));
		
		startTime = System.currentTimeMillis();
		BubbleSort bubbleSort = new BubbleSort();
		System.out.println(Arrays.toString(bubbleSort.sort(arr)));
		endTime = System.currentTimeMillis();
		System.out.println("Bubble Sort: "+(endTime-startTime));
		
		
		startTime = System.currentTimeMillis();
		InsersionSort insersionSort = new InsersionSort();
		System.out.println(Arrays.toString(insersionSort.sort(arr)));
		endTime = System.currentTimeMillis();
		System.out.println("Insersion Sort: "+(endTime-startTime));
		
		
	}

}
