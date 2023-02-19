package InterviewPracticeMore;

import java.util.ArrayList;

public class PracticeQuestionsAgain {

	public static ArrayList<Integer> fibonator(int x) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		if (x == 1) {
			number.add(1);
		} else {
			number.add(1);
			number.add(1);
			for (int i = 2; i < x; i++) {
				int y = number.get(i - 1) + number.get(i - 2);
				number.add(y);
			}

		}

		return number;
	}

	
	
	public static String reverseString(String input) {
		
String temp = "";
for(int i = input.length()-1; i >=0; i--) {
	temp += input.charAt(i);
			
		}
		return temp;
	}
	
	
	public static String processString(String str) {
		String some = "";
		String [] xyz =str.split(" ");
		for (String s : xyz) {
			if (s.length() > 1) {
			some += s.charAt(0)+ "" + s.charAt(s.length()-1) +" ";
		}else {
			some += s.charAt(0) + " ";
		}
	
	}
	return some;
	}
	
	
	
	
	
	public static void main(String[] args) {

		System.out.println(fibonator(10));
		System.out.println(reverseString("this is a test"));
		System.out.println(processString("This is a so cool"));
	}

}
