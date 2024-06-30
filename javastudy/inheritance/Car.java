package javastudy.inheritance;

class Vehicle {
	
	protected String brand = "Ford";
	int modelyear = 1996;
	
	public void honk() {
		System.out.println("Honk honk");
	}

}

//The name of the file wala class should have the main method to run this file

class Car extends Vehicle {
	private String modelname = "Mustang";
	
	public static void main(String args[]) { // <--- this one 
		Car Myobj = new Car();
		
		System.out.println(Myobj.brand + " " + Myobj.modelname + "was my car since " + Myobj.modelyear);
		
		Myobj.honk();
		
	}
	
}

