package collection.java;

import java.io.*;
import java.util.*;

class List_ArrayList {
 public static void main (String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
  
    // add the number 
  list.add(9);
  list.add(5);
  list.add(6);
  
  System.out.println(list);
  
  // get method
  Integer n= list.get(1);
  System.out.println("at indext 1 number is: "+n);
  
  list.add(2, 3); //at index 2 add element 3
  System.out.println(list);
  
  //replace
  list.set(0, 10);
  System.out.println(list);
  
  int b = list.size();
  System.out.println("The size is :" + b);
  
  //sorting
  Collections.sort(list);
  System.out.println("after sorting list:");
  System.out.println(list);
  
  //Using iterator
  Iterator<Integer> itr = list.iterator();
  
  while(itr.hasNext()) {
	  System.out.println(itr.next());
  }
  
 }
}


