package com.siri.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {
	
	public static void main(String[] args) {
		//Set<String> strSet = new HashSet<String>();
		//Set<String> strSet = new LinkedHashSet()<String>();
		
		SortedSet<String> strSet = new TreeSet<String>();
		
		strSet.add("Steve");
		strSet.add("Larry");
		strSet.add("Mark");
		strSet.add("Dan");
		strSet.add("dan");
		
		
		
		strSet.forEach(item -> System.out.println(item));
		
		SortedSet<SiriEmployee> siriEmployeeList = new TreeSet<SiriEmployee>();
		siriEmployeeList.add(new SiriEmployee(1, "Kranti", "k@siri", 90));
		siriEmployeeList.add(new SiriEmployee(2, "Rahul", "R@siri", 290));
		siriEmployeeList.add(new SiriEmployee(3, "Manoj", "m@siri", 190));
		siriEmployeeList.add(new SiriEmployee(3, "Manoj", "m@siri", 990));
		
		siriEmployeeList.forEach(item -> System.out.println(item));
		
	}

}
