package a.common.java.interviewqs;

class Node{
	int data;
	Node next;
	//constructor
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LL_middle_element {
	
	public static void pushNode(Node[] head_ref, int data) {
		
		Node new_node = new Node(data);
		
		new_node.next = head_ref[0];
		head_ref[0] = new_node;	
	}
	
	public static int middleNode(Node head) {
		Node slow_ptr = head;
		Node fast_ptr = head;
		
		while(fast_ptr != null && fast_ptr.next != null) {
			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next.next;
		}
		return slow_ptr.data;
		
	}
	
	
	public static void main(String[] args) {
		
		Node[] head = new Node[1];
		
		for(int i = 10; i > 0; i--) {
			pushNode(head, i);
		}
		
		System.out.println( "Middle Value Of Linked List is: " + middleNode(head[0]));
		
	}

}
