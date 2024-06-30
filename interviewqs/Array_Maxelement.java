package a.common.java.interviewqs;

public class Array_Maxelement {
	
	
	public static void main(String args[]) {
		
		int[] arr = {2, 6, 21, 54, 3};
		int n = arr.length;
		
		int max = arr[0];
		
		for(int i : arr) {
			if( i > max) {
				max = i;
			}
		}
		
		System.out.println("The maximum element in array is: " + max);
	}
	
	

}
