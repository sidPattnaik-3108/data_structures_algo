package com.code.sorting;

public class InsersionSort {

	// 5 1 9 2 10   temp = 1 j = i-1 = 0;
	public int[] sort(int[] a) {

		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > temp) {
				a[j+1] = a[j];
				j = j-1;
			}
			a[j+1] = temp;
		}
		return a;
	}

}