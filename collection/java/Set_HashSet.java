package collection.java;

import java.util.HashSet;
import java.util.Iterator;

public class  Set_HashSet {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        HashSet<String> hs = new HashSet<>();

        // Add elements to the HashSet
        hs.add("A");
        hs.add("B");
        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Z");

        // Using iterator() method to iterate over the HashSet
        System.out.print("Using iterator(): ");
       
        Iterator<String> iterator = hs.iterator();
        
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }

        System.out.println(); 

        // Using enhanced for loop to iterate over the HashSet
        System.out.print("Using enhanced for loop: ");
        
        for (String element : hs) {
            System.out.print(element + ", ");
        }
    }
}


