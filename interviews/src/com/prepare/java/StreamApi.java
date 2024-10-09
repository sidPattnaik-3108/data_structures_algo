package com.prepare.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApi {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
				new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
				new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
				new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
				new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
				new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
				new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
				new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
				new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
				new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));
		
		
		//List of Students whose Name starts with P
		List<Student> studentList = list.stream().filter(st->st.getFirstName().startsWith("P")).collect(Collectors.toList());
		System.out.println(studentList);
		
		//Group the student name with respect to the department
		Map<String, List<String>> studentMap = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.mapping(Student::getFirstName, Collectors.toList())));
		System.out.println(studentMap);
		
		//Print the list of student sorted based on their age and firstName;
		List<String> ageList = list.stream().sorted(Comparator.comparing(Student::getAge)).map(Student::getFirstName).collect(Collectors.toList());
		System.out.println(ageList);

		//Print List of genders and their average age
		Map<String, Double> avgAgeList = list.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingDouble(Student::getAge)));
		System.out.println(avgAgeList);

		//Print List Of department with maximum Students;
		String deptWithMaxStudents = list.stream()
				.collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue()).get().getKey();
		System.out.println(deptWithMaxStudents);
		
		String studentWith2ndLowestMark = list.stream().sorted(Comparator.comparing(Student::getRank).reversed()).map(Student::getFirstName).skip(1).findFirst().get();
		System.out.println(studentWith2ndLowestMark);
	}

}
