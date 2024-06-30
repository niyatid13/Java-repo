package collection.java;

import java.util.LinkedList;

public class List_LinkedList {
    public static void main(String[] args) {
        // Create a new linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements to the linked list
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println(linkedList);
        
        linkedList.set(1, 100);
        System.out.println(linkedList);
        
        // Add an element to the beginning of the linked list
        linkedList.addFirst(0);

        // Add an element to the end of the linked list
        linkedList.addLast(4);

        // Print the elements of the linked list
        for (int i : linkedList) {
            System.out.println(i);
        }
        
        Object[] a = linkedList.toArray();
        System.out.print("After converted LinkedList to Array: ");
        for(Object element : a)
        System.out.print(element+" ");
    }
}



