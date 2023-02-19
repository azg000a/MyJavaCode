package interviewQuestions;

import java.util.ArrayList;

public class FibCreate {



	public static String reverseString(String str) {
		String x = "";
		
		for (int i = str.length()-1; i >= 0; i --) {
			x += str.charAt(i);
		}
		
		
		
		return x;
	}
	
	
	
	
	
	
	
	
	
	public static void main (String [] args	) {
		
		
		System.out.println(reverseString("My Name is Ahmad"));
		
		
		
		
		
		
		
		
		
		
		
		String x = "Hello";
		
		String y = "";
		for(int i = x.length()-1; i >= 0; i--){
			y += x.charAt(i);
		}
		
		System.out.println(y);
		
	}
	
	
}
