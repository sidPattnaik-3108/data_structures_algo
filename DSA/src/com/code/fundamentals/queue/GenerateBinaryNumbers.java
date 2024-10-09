package com.code.fundamentals.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {

	public static void main(String[] args) {

		int n = 100;
		generateBinaryNumber(n);

	}
//
	private static void generateBinaryNumber(int n) {

		String[] result = new String[n];
		Queue<String> queue = new LinkedList<>();
		queue.offer("1");
		for(int i = 0; i < n; i++) {
			result[i] = queue.poll();
			String n1 = result[i]+"0";
			String n2 = result[i]+"1";
			queue.offer(n1);
			queue.offer(n2);
		}

		System.out.println(Arrays.toString(result));
	}

}
