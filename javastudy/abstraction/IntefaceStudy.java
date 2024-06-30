package javastudy.abstraction;

/*Like abstract classes, interfaces cannot be used to create objects (in the example above, 
 * it is not possible to create an "Animal" object in the Main Class, you have to inherent the Animal (interfec/abstract class)
 * and then overwrite its empty methods and create its objects)
 */


interface FirstInterface {
	public void myMethod(); // interface method
}

interface SecondInterface {
	public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
	public void myMethod() {
		System.out.println("Some text..");
	}
	public void myOtherMethod() {
		System.out.println("Some other text...");
	}
}

//Running class
class IntefaceStudy {
	public static void main(String[] args) {
		DemoClass myObj = new DemoClass();
		myObj.myMethod();
		myObj.myOtherMethod();
	}
}