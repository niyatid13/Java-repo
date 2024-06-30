package a.common.java.interviewqs;

import java.util.*;

public class LL_reverseLinkedlist {
	
	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
			
		}
	}
	
	Node reverse(Node node) {
		
		Node prevNode = null;
		Node current = node;
		Node nextNode = null;
		
		while(current != null) {
			nextNode = current.next;
			current.next = prevNode; //main move
			//update
			prevNode = current;
			current = nextNode;
		}
		node = prevNode; //important
		return node;
	}
	
	void printList(Node node) {
		
		while(node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	
	public static void main(String[] args)
    {
		LL_reverseLinkedlist list = new LL_reverseLinkedlist();
		
        list.head = new Node(10); //make the Node class static
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
        
        System.out.println("Given linked list");
        list.printList(head);
        
        head = list.reverse(head);
        
        System.out.println("");
        
        System.out.println("Reversed linked list ");
        list.printList(head);

       
    }

}
