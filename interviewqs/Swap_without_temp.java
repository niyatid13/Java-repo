package a.common.java.interviewqs;

public class Swap_without_temp {
	
	public static void swap(int a, int b) {
        System.out.println("Before swap: a = " + a + ", b = " + b);
        b = a + b;
        a = b - a;
        b = b - a;
        
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
	
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		swap(a, b);
	}

}
