package com.code.array;

import java.util.Arrays;
import java.util.List;

public class SimpleArraySum {

	private static long result(List<Long> ar) {
		return ar.stream().mapToLong(Long::longValue).sum();
	}
	public static void main(String...args) {
		List<Long> ar = Arrays.asList((long)1000000001,(long) 1000000002, (long)1000000003, (long)1000000004, (long)1000000005);
		
		System.out.println(result(ar));
		
		
	}

}
