package a.common.java.interviewqs;

public class StringReverse {
	
	public static void main (String[] args) {
		
		String str = "123456";
		System.out.println(str);
		
		String ReverseString = reverse(str); 
		
		System.out.println(ReverseString);
		
	} //main function ends
		
		public static String reverse(String in) {
			if(in == null) {
				throw new IllegalArgumentException("Null is not allowed");
			}
			
			StringBuilder out = new StringBuilder();
			
			char[] chars = in.toCharArray();
			
			for(int i = chars.length - 1; i >= 0; i--) {
				out.append(chars[i]);
			}
			
			return out.toString();			
		}
	

}
