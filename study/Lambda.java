package concepts.java.study;

interface FunctionalIntr {
	//abstract method
	 public void addition(int a, int b);
}

public class Lambda {
	
	public static void main(String args[]) {
		
		FunctionalIntr sum = (a, b) -> System.out.println("The sum of a and b is: " + (a + b));
		
		sum.addition(10, 20);
		sum.addition(50, 70);
	}

}
