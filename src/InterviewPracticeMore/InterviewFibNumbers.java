package InterviewPracticeMore;

import java.util.ArrayList;

public class InterviewFibNumbers {

	public static ArrayList<Integer> fibcreateme(int n) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		if (n == 1) {
			numbers.add(1);
		} else {
			numbers.add(1);
			numbers.add(1);
			for (int i = 2; i < n; i++) {
				int y = numbers.get(i - 1) + numbers.get(i - 2);
				numbers.add(y);
			}

		}

		return numbers;
	}

	
	
	public static String reverseMe(String str) {
		String x = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			x += str.charAt(i);
		}
		
		
		return x;
	}
	
	
	public static String processString(String str) {
		String temp = "";
		String [] arr = str.split(" ");
		for(String s : arr) {
			if(s.length() > 1) {
			temp += s.charAt(0) + ""+ s.charAt(s.length()-1) + " ";
		}else {
			temp += s.charAt(0)+ " ";
		}
		
		
		}
		return temp;
	}
	
	
	
	
	
	
	
	
	public static void main(String [] args) {
		
		System.out.println(processString("This a is so cool"));
		System.out.println(reverseMe("Hello"));
		System.out.println(fibcreateme(10));
		
	}
	
	
	
}
