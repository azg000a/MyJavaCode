package interviewQuestions;

import java.util.Stack;

public class ParanthesesBalanced {
	
	// if you have a set of Parentheses and or brackets then they must have an opener and a closer () []:
	//1.  )( -----> these are not balanced
	//2.  (()((  ----> these are not balanced
	//3.  ()(())) ----> these ARE balanced
	//4.  [({})]()   -----> these ARE balanced
	// as you can see the parentheses have to have an open and closer in a sequential flow... which is why #1 is not balanced!!!!! 
	
	// create a method to check this, use STACK because it is LIFO (last in and first out) 
	
	
	public static boolean isBalanced(String str) {
	// validation == make sure that str is not null
		if(str == null) {
			System.out.println("Input is null");
			return false ;
			
		}
		
		Stack <Character> chars = new Stack <Character>();
		
		for(Character c : str.toCharArray()) {
			//if it is an opening then add it to the stack
			
			if(c == '(' || c == '{' || c =='[' || c == '<') {
				chars.add(c);
			} else {
				//at this point there must be atleast 1 variable in the stack
				if(chars.size()< 1) {
					return false;
				}
				//else if it is closing then compare it to the last value added to the stack 
				//checking for different cases:
				
				if (c == ')' && chars.pop() != '(' ) {
					return false;
				}
				if (c == '}' && chars.pop() != '{' ) {
					return false;
				}
				if (c == ']' && chars.pop() != '[' ) {
					return false;
				}
				if (c == '>' && chars.pop() != '<' ) {
					return false;
				}
				
			}
		}
		
		return chars.size() == 0;
	}
	
	
	
	
	
	
	
	
	
	
	public static void main (String [] args) {
		

		String sample1 = "()()()()()()()()()";
		String sample2 = "()()()()()((((";
		String sample3 = "))()()()()()()((";
		String sample4= "<(()){}{<>()<>()}>";
		String sample5 = "<{[()]}";
		String sample6 = "<{(test)(test2)]}>";
		String sample7 = "null";
		
		
		
		System.out.println(isBalanced(sample7));
		
		
		
		
		
	}
	
	

}
