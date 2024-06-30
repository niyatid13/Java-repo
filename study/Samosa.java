package concepts.java.study;

//Singleton class creation Lazy way
public class Samosa {
	
	public static Samosa samosa;
	
	//constructor private
	private Samosa() {
		
	}
	
	public static Samosa getSamosa() {
		
		if( samosa == null) {
			
			//to make it thread-safe use synchronized
			synchronized (Samosa.class) {
				if( samosa == null) {
					
					samosa = new Samosa();
				}
			}
		}
		
		return samosa;
		
	}

}
