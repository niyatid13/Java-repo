package a.common.java.interviewqs;

import java.io.*; 
import java.util.ArrayList; 
  
class Sum_Avg_list { 
    public static void main(String[] args) 
    { 
        ArrayList<Integer> list = new ArrayList<>(); 
        list.add(10); 
        list.add(20); 
        list.add(30); 
        list.add(45); 
        list.add(54); 
  
        // Calculate the sum of elements 
        int sum = 0; 
        for (int i = 0; i < list.size(); i++)  
        { 
            sum += list.get(i); 
        } 
        System.out.println("Sum: " + sum); 
  
        // Calculate the average of elements 
        double average = (double)sum / list.size(); 
        System.out.println("Average: " + average); 
    } 
} 

