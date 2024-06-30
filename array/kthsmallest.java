package dsa.array;
import java.util.*;

public class kthsmallest {

	static int smallestele(int arr[], int l, int r, int k) {
		
		//int n = r - l + 1;
		Arrays.sort(arr);
		
		return (arr[k - 1]);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {11, 5, 30, 6, 84, 25};
		int l = 0;
		int r = arr.length - 1;
		int k;
		
		System.out.println("Enter the K: ");
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		
		int kthelement = smallestele(arr, l, r, k);
		System.out.println(" The kth smallest element in the array is : " + kthelement);

	}

}
