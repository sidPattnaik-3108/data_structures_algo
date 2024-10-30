package com.code.array;

public class SearchMatrix {
	
	public static void main(String[] args) {
		
		int n = 4;
		int[][] matrix = new int[n][n];
		int x = 3;
		search(matrix, n, x);
	}

	private static void search(int[][] matrix, int n, int x) {
		int start = 0;
		int end = n;
		
		while(start<n && end>=0) {
			if(matrix[start][end]==x) {
				System.out.println("found it at "+start+" "+end);
				return;
			}
			if(matrix[start][end]>x) {
				end--;
			} else {
				start++;
			}
		}
		Math.sqrt(8);
		System.out.println("Not found");
		
	}

}
