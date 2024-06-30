package a.common.java.interviewqs;


public class reverseArray {
	
	static void reversearray( int arr[], int start, int end) {
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
			
		}
	}
	
	static void printarr(int arr[], int size) {
		
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}
	

	public static void main(String[] args) {
		
		int arr[] = {5, 4, 3, 2, 1};
		printarr(arr, arr.length); // (arr, 5)
		reversearray(arr, 0, arr.length - 1); // (arr, 0, 4)
		System.out.println("Reversed array: ");
		printarr(arr, arr.length); // (arr, 5)
		

	}

}
