package com.prepare.java;

public class StringEqualsOperations {
	
	public static void main(String[] args) {
		String name = new String("Siddhant");
		String name1 = "Siddhant";
		String name2 = name;
		String name3 = "Siddhant";
		
		System.out.println(name == name1);
		System.out.println(name.equals(name1));
		System.out.println(name2 == name3);
		System.out.println(name2.equals(name3));
	}

}
