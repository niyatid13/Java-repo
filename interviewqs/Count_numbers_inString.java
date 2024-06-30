package a.common.java.interviewqs;

//Java Program to Count Number of Digits in a String

import java.util.*;


public class Count_numbers_inString{

	public static void main(String[] args)
	{
		String str = "GeeksforGeeks password is : 123467";
		String num="0123456789";
		
		ArrayList<Character> numbers= new ArrayList<>();
		for(int i=0;i<num.length();i++)
		{
			numbers.add(num.charAt(i));
		}
		
		int digits = 0;
		for (int i = 0; i < str.length(); i++) {
			if (numbers.contains(str.charAt(i)))
				digits++;
		}
		
		System.out.println("Total number of Digits = "+ digits);
	}
}

