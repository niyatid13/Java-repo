package collection.java;

//Java Program to Illustrate Removal of Elements
//in a TreeSet

//Importing utility classes
import java.util.*;

//Main class
class Set_TreeSet {

 // Main driver method
 public static void main(String[] args)
 {
     // Creating an object of NavigableSet
     // with reference to TreeSet class
     // Declaring object of string type
     NavigableSet<Integer> ts = new TreeSet<>();

     // Elements are added
     // using add() method
     ts.add(5);
     ts.add(2);
     ts.add(4);
     ts.add(10);
     ts.add(6);
     ts.add(1);

     // Print and display initial elements of TreeSet
     System.out.println("Initial TreeSet " + ts);

     // Removing a specific existing element inserted
     // above
     ts.remove(10);

     // Printing the updated TreeSet
     System.out.println("After removing element " + ts);

     // Now removing the first element
     // using pollFirst() method
     ts.pollFirst();

     // Again printing the updated TreeSet
     System.out.println("After removing first " + ts);

     // Removing the last element
     // using pollLast() method
     ts.pollLast();

     // Lastly printing the elements of TreeSet remaining
     // to figure out pollLast() method
     System.out.println("After removing last " + ts);
     
     Integer val = 3;

     // Find the values just greater
     // and smaller than the above string
     System.out.println("Higher " + ts.higher(val));
     System.out.println("Lower " + ts.lower(val));
 }
}





