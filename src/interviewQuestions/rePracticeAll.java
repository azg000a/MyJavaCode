package interviewQuestions;

import java.util.ArrayList;

public class rePracticeAll {
	

	public static void removeSpecialCharacters(String str) {
		
		String [] arr = str.split("[^a-zA-Z ]");
		for(int i = 0; i <arr.length; i++) {
			System.out.print(arr[i] );
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String [] args) {

String temp = "THI@S i!S @a B@E!A*UT!IF(U!!LL D@@A@@@Y!!! ";

String [] arr = temp.split("[^a-zA-Z ]");

for(int i = 0; i <arr.length; i++) {
	System.out.print(arr[i]);
	
}


	
}
}