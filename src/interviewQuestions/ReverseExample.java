package interviewQuestions;

public class ReverseExample {
	

public static String reverseString(String word) {
	String x = "";
	
	for (int i = word.length()-1; i >= 0; i-- ) {
		x += word.charAt(i);
	}
	
	
	return x;
}


public static void main (String [] args) {
	
	
	String some = "This is something new";
	
	System.out.println(reverseString(some));
	
	
	
}
}
