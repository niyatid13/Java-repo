package collection.java;


//Java program to illustrate
//traversal of Hashtable

import java.util.Hashtable;
import java.util.Map;

public class Map_Hashtable {
	public static void main(String[] args)
	{
		// Create an instance of Hashtable
		Hashtable<String, Integer> ht = new Hashtable<>(3, 0.5f); //int capacity, float fillRatio

		// Adding elements using put method
		ht.put("vishal", 10);
		ht.put("sachin", 30);
		ht.put("vaibhav", 20);
	
		// Iterating using enhanced for loop
		for (Map.Entry<String, Integer> e : ht.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());
		
		if (ht.containsKey("vishal")) {
            Integer a = ht.get("vishal");
            System.out.println("value for key" + " \"vishal\" is:- " + a);
        }
	}
}


