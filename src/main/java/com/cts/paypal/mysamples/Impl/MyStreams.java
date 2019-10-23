package com.cts.paypal.mysamples.Impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.cts.paypal.mysamples.model.AgeComparator;
import com.cts.paypal.mysamples.model.Employee;
import com.cts.paypal.mysamples.model.NameComparator;

public class MyStreams {

	public static void main(String[] args) {
		List<Integer> myIntList = new ArrayList<>();
		myIntList.add(1);
		myIntList.add(2);
		myIntList.add(3);
		myIntList.add(4);
		myIntList.add(5);
		myIntList.add(6);
		long listSize = myIntList.stream().count();
		System.out.println("List size = : " + listSize);

		System.out.println("foreach printing ");
		myIntList.forEach(i -> System.out.print(i));
		System.out.println("\nusing filter ");
		myIntList.stream().filter(i -> i > 2).forEach(i -> System.out.print(i));
		System.out.println("\nusing stream");
		myIntList.stream().forEach(i -> System.out.print(i));
		System.out.println("\nusing parallel stream ");
		myIntList.parallelStream().forEach(i -> System.out.print(i));

		List<String> names1 = new ArrayList<String>();
		names1.add("Ajeet");
		names1.add("Negan");
		List<String> names2 = new ArrayList<String>();
		names2.add("Aditya");
		names2.add("Steve");

		System.out.println("\nStream concatenation ");
		Stream<String> concatStream = Stream.concat(names1.stream(), names2.stream());
		concatStream.forEach(i -> System.out.print(i + ","));

		// List to map
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "emp1", 25, "SAP"));
		empList.add(new Employee(2, "emp2", 24, "PayPal"));
		empList.add(new Employee(3, "emp3", 29, "PayPal"));
		empList.add(new Employee(4, "emp4", 22, "SAP"));

		Map<Integer, Employee> empMap = empList.stream().collect(Collectors.toMap(Employee::getId, i -> i));
		System.out.println(empMap);
		System.out.println("SORT BY AGE:");
		Collections.sort(empList, new AgeComparator());
		for (Employee e : empList) {
			System.out.println(e.toString());
		}
		Collections.sort(empList, new NameComparator());
		System.out.println("SORT BY NAME:");
		for (Employee e : empList) {
			System.out.println(e.toString());
		}
		
		Integer numbers[] = {22, 89, 1, 32, 19, 5};
		Arrays.parallelSort(numbers);
		Arrays.stream(numbers).forEach(n->System.out.print(n+" "));
		
		
		List<Integer> list2 = new ArrayList<>(); 
        list2.add(12);  
        showList(list2);  
        // Compiler infers type of ArrayList, in Java 8  
        showList(new ArrayList<>()); 
	
	}
	
	public static void showList(List<Integer> list) {
		if (!list.isEmpty()) {
			list.forEach(System.out::println);
		} else
			System.out.println("list is empty");
	}

}
