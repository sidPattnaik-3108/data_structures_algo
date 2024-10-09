package com.prepare.java;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceWord {

	public static void main(String[] args) {
		String str = "wwwwwuuuuuutttyyhheeeeww";

		occuranceWordUsingStream(str);
		occuranceWordUsingDs(str);
	}

	private static void occuranceWordUsingDs(String str) {
		String[] strList = str.split("");
		StringBuilder builder = new StringBuilder();
		int count = 1;
		for (int i = 1; i < strList.length; i++) {

			if (strList[i].equals(strList[i - 1])) {
				count++;
			} else {
				builder.append(strList[i - 1]);
				if (count > 1) {
					builder.append(count);
				}
				count = 1;
			}
		}
		builder.append(strList[strList.length - 1]);
		if (count > 1) {
			builder.append(count);
		}
		System.out.println(builder.toString());
	}

	private static void occuranceWordUsingStream(String str) {
		Map<Object, Long> resMap = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(s -> s, Collectors.counting()));

		StringBuilder builder = new StringBuilder();

		resMap.forEach((k, v) -> {
			builder.append(k).append(v);
		});
		System.out.println(builder.toString());

	}

}
