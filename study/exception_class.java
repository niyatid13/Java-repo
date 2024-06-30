package concepts.java.study;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}


public class exception_class {
    public static void main(String[] args) {
        
    	int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        
        if (a<9){
        	
            try{
                 throw new MyException();
                //throw new ArithmeticException("This is an exception");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace(); //gives info about error at what line
                System.out.println("Finished");
            }
            
            System.out.println("Yes Finished");
        }
    }
}
