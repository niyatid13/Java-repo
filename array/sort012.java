package dsa.array;

public class sort012 {

	
	public static void sort210(int arr[], int n) {
		int low = 0;
		int mid = 0;
		int high = n - 1;
		
		while( mid <= high) {
			int temp;
			if(arr[mid] == 1) {
				mid = mid + 1;
			}
			else if(arr[mid] == 2) {
				temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high = high - 1;
			}
			else if (arr[mid] == 0) {
				temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				mid = mid + 1;
				low = low + 1;
			}
		}
	}
	
	static void printarr(int arr[], int n) {
			
			for (int i = 0; i < n; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 0, 2, 1, 1, 0, 2};
		int n = arr.length;
		
		sort210(arr, n);
		
		System.out.println("The sorted array: " );
		printarr(arr, n);

	}

}
