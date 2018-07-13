package com.siri.collection;

import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsDemo {

	public static void main(String[] args) {
		ArrayList<SiriEmployee> siriEmployeeList = new ArrayList<SiriEmployee>();
		
		siriEmployeeList.add(new SiriEmployee(1, "Kranti", "k@siri", 90));
		siriEmployeeList.add(new SiriEmployee(1, "Rahul", "R@siri", 290));
		siriEmployeeList.add(new SiriEmployee(1, "Manoj", "m@siri", 190));
		siriEmployeeList.add(new SiriEmployee(1, "Dhruv", "D@siri", 390));
		
		for( SiriEmployee siriEmp : siriEmployeeList ) {
			//System.out.println(siriEmp);
		}
		
		//System.out.println(siriEmployeeList.get(3));
		
		List<String> strList = new ArrayList<String>();
		strList.add("Steve");
		strList.add("Larry");
		strList.add("Mark");
		strList.add("dan");
		/*strList.add("dan");
		strList.add(null);
		strList.add(null);*/
		
		/*for(String s : strList) {
			strList.remove(s);
		}*/
		
		
		
		/*Iterator<String> itr = strList.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			if(s.equalsIgnoreCase("mark")) {
				strList.remove(s);
			}
		}*/
		
		//strList.forEach(xyz -> System.out.println(xyz));
		
		/*strList.forEach(item -> {
			if(item.equalsIgnoreCase("Dan")) {
				System.out.println(item);
			}
		});*/
		
		//strList.stream().filter(item-> item !=null && item.contains("r")).forEach(item -> System.out.println(item));
		
		
		
		
		
		
		
		

	}

}
