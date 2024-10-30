package com.company.tr;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SecondHighestOccurance {
	public static void main(String[] args) {
		String str = "Naresh Srinivas Naresh Sidhanth Srinivas Naresh Sidhanth Sidhanth Sidhanth";
		String[] arr = str.split(" ");
		String res = 
		Arrays.stream(arr)
			  .collect(Collectors.groupingBy(s->s, Collectors.counting()))
			  .entrySet()
			  .stream()
			  .sorted(Entry.comparingByValue(Comparator.reverseOrder()))
			  .map(Entry::getKey).skip(1).findFirst().get();
				
		System.out.println(res);
	}

}
