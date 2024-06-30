package collection.java;

//Java program to demonstrate the
//creation of queue object using the
//PriorityQueue class

import java.util.*;

class Queue_PriorityQueue {

	public static void main(String args[])
	{
		// Creating empty priority queue
		Queue<Integer> pQueue = new PriorityQueue<Integer>();

		// Adding items to the pQueue
		// using add()
		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);
		pQueue.add(30);
		pQueue.add(50);

		// Printing the top element of
		// the PriorityQueue
		System.out.println(pQueue.peek());

		// Printing the top element and removing it
		// from the PriorityQueue container
		System.out.println(pQueue.poll());

		// Printing the top element again
		System.out.println(pQueue.peek());
		
		Iterator<Integer> iterator = pQueue.iterator();
		 
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        
        
	}
}


