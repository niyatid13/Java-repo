package collection.java;

//Java program to demonstrate the 
//creation of SortedSet object using 
//the TreeSet class 

import java.util.*; 

class Set_SortedSet { 

	public static void main(String[] args) 
	{ 
		SortedSet<String> ts = new TreeSet<String>(); 

		// Adding elements into the TreeSet 
		// using add() 
		ts.add("India"); 
		ts.add("Australia"); 
		ts.add("South Africa"); 

		// Adding the duplicate 
		// element 
		ts.add("India"); 

		// Displaying the TreeSet 
		System.out.println(ts); 

		// Removing items from TreeSet 
		// using remove() 
		ts.remove("Australia"); 
		System.out.println("Set after removing " + "Australia:" + ts); 

		// Iterating over Tree set items 
		System.out.println("Iterating over set:"); 
		
		Iterator<String> i = ts.iterator(); 
		while (i.hasNext()) 
			System.out.println(i.next()); 
	} 
	
	
} 




