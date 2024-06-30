package dsa.array;

public class negarray {
	
	static void negativearray(int arr[], int arr_size) {
		
		
		int negcount = 0;
		//counting negative elements in array
		for (int i = 0; i < arr_size; i++) {
			if ( arr[i] < 0) {
				negcount++;
			}
		}
		
		int i = 0;
		int j = negcount;
		while ( i < negcount && j < arr_size) {
			if (arr[i] < 0) {
				i++;
			}
			else if (arr[i] > 0 && arr[j] > 0) {
				j++;
			}
			else if (arr[i] > 0 && arr[j] < 0) {
				int temp;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j++;
			}	
		}	
	}
	
	static void display(int arr[], int arr_size) {
		for (int i = 0; i < arr_size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {-17, -5, 5, -12, 2, -54, 4};
		int arr_size = arr.length;
		
		System.out.println("The negative sorted array is given as: ");
		negativearray(arr, arr_size);
		display(arr, arr_size);

	}

}
