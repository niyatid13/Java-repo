package a.common.java.interviewqs;

public class Fibonacci {
	
	public static int FibonacciNum(int count) {
		//base case
		if( count <= 1) {
			return count;
		}
		
		return FibonacciNum(count - 1) + FibonacciNum(count - 2);
	}
	
	public static void main(String[] args) {
		
		int seqLength = 10;

    	System.out.print("A Fibonacci sequence of " + seqLength + " numbers: ");
    	
    	for(int i = 0; i < seqLength; i++) {
    		
    		System.out.print( FibonacciNum(i) + " " );
    	}
	}

}
