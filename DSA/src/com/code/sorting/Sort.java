package com.code.sorting;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {

		int[] arr = new int[] { 4, 2, 3, 6, 1, 9, 5, 8 };
		long startTime = System.currentTimeMillis();
		SimpleSort simpleSort = new SimpleSort();
		System.out.println(Arrays.toString(simpleSort.sort(arr)));
		long endTime = System.currentTimeMillis();
		System.out.println("Simple sort: " + (endTime - startTime));

		arr = new int[] { 4, 2, 3, 6, 1, 9, 5, 8 };
		startTime = System.currentTimeMillis();
		BubbleSort bubbleSort = new BubbleSort();
		System.out.println(Arrays.toString(bubbleSort.sort(arr)));
		endTime = System.currentTimeMillis();
		System.out.println("Bubble Sort: " + (endTime - startTime));

		arr = new int[] { 4, 2, 3, 6, 1, 9, 5, 8 };
		startTime = System.currentTimeMillis();
		InsersionSort insersionSort = new InsersionSort();
		System.out.println(Arrays.toString(insersionSort.sort(arr)));
		endTime = System.currentTimeMillis();
		System.out.println("Insersion Sort: " + (endTime - startTime));

		arr = new int[] { 4, 2, 3, 6, 1, 9, 5, 8 };
		startTime = System.currentTimeMillis();
		SelectionSort selectionSort = new SelectionSort();
		System.out.println(Arrays.toString(selectionSort.sort(arr)));
		endTime = System.currentTimeMillis();
		System.out.println("Selection Sort: " + (endTime - startTime));

		arr = new int[] { 4, 2, 3, 6, 1, 9, 5, 8 };
		startTime = System.currentTimeMillis();
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(arr, new int[arr.length], 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
		endTime = System.currentTimeMillis();
		System.out.println("Merge Sort: " + (endTime - startTime));

	}

}
