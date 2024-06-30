package a.common.java.interviewqs;

public class String_palindrome_check {
	
	
	public static boolean isPalindrome(String input) {
		
		boolean check = true;
		int length = input.length();
		
		for(int i = 0; i < length/2; i++) {
			if(input.charAt(i) != input.charAt(length - i - 1)) {
				check = false;
				break;
			}
		}
		return check; //return the check
		
		
	}
	
	public static void main(String[] args) {
		String str = "madam";
		
		System.out.println("The string is Palindrome: " + isPalindrome(str));
	}

}
