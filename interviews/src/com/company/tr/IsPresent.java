package com.company.tr;

import java.util.ArrayList;
import java.util.List;

public class IsPresent {
	
	public static void main(String[] args) {
		String str = "abpbcppa";
		String s = "bbbc";
		
		String[] arr = str.split("");
		int l = 0;
		int k = 0;
		StringBuilder builder = new StringBuilder();
		List<String> list = new ArrayList<>();
		while(l<str.length() && k<str.length()) {
			System.out.println(k);
			if(!(builder.toString().length() == s.length())) {
				builder.append(arr[l]);	
				l++;
			} else {
				list.add(builder.toString());
				builder = new StringBuilder();
				k++;
				l = k;
			}
		}
		while(k<=0) {
			builder.append(arr[k]);
			k++;
		}
		list.add(builder.toString());
		System.out.println(list.contains(s));
	}

}
