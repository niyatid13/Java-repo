package a.common.java.interviewqs;

public class Bubblesort {
	
	static int length;
	
	public static void sort(int arr[]) {
		int temp = 0; //for swapping
		
		for(int i = 0; i < length; i++) {
			for(int j = i + 1; j < length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}
	
    // To print the array
    public static void printArray(int[] array)
    {
        
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args)
    {
        
        int[] arr = new int[] { -5, -9, 8, 12, 1, 3 };
 
        length = arr.length;
   
        System.out.print("Elements of original array: ");
        printArray(arr);
 
        System.out.println("Elements of array sorted in ascending order: "); 
       // Call sortArray method
        sort(arr);
        printArray(arr);
    }
    
    
 
	
	

}
