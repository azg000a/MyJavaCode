package InterviewPracticeMore;

import java.util.ArrayList;

public class PracticeInt {
	
	// create a fib function
	
	
	
	
	
	ArrayList<Integer> creatingfib(int x){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		if ( x == 1) {
			numbers.add(1);
		}else {
			numbers.add(1);
			numbers.add(1);
			for ( int i = 2; i < x; i++) {
				int y = numbers.get(i-1) + numbers.get(i-2);
				numbers.add(y);
			}
		}
		
		return numbers;
	}
	
	
	// create a sentence process function
	// print the first and last letter in every word
	

	public static String processString(String n) {
				String x = "";
		String [] str =n.split(" ");
		for (String y : str) {
			if ( y.length() > 1) {
			x += y.charAt(0) +""+ y.charAt(y.length()-1) + " ";
		}else {
			x += y.charAt(0) + " ";
		}
		
		
	}
	return x;
	}
	
	
	
	
	
	public static void main (String [] args) {
		
		PracticeInt obj = new PracticeInt();
		System.out.println(obj.creatingfib(10));
		
		String xyz = "This is a very cool idea";
		
		System.out.println(obj.processString(xyz));
		
	}

}
