package a.common.java.interviewqs;

import java.util.Scanner;

public class isEven_odd {
	
	public static void isEven(int a) {
		
		if( a % 2 == 0) {
			System.out.println("The number is Even.");
		}
		else
			System.out.println("The number is odd.");
		
		
	}
	
	public static void main(String args[]) {
		
		int num;
		
		System.out.println("Enter the Number: ");
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		isEven(num);
		
		
	}

}
