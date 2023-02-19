package basics2;

import java.util.Scanner;

public class CalculatorClassExample {

	public static void main(String[] args) {

		
		int input = 0;
	int input2 = 0 ;
	String operator = "";
	int result = 0;
		
		Scanner one = new Scanner (System.in);
		
		System.out.println("Enter a value:  ");
		 input =  one.nextInt();
		
		System.out.println("Enter a second value:  ");
		  input2 = one.nextInt();
		  
		  
		System.out.println("Please select an operator:  + , - , * , / , %");
		
		
		operator = one.next();
		if (operator .equals("+")) {
			result = input + input2;
		}
		
		System.out.println("Result: " + (result));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
