package interviewQuestions;

import java.util.ArrayList;

public class ProcessString {
	
	public static void main(String [] args) {
	
	
		String three = "Freedom is not a free thing";
		System.out.println(processSentence(three));
		System.out.println("\n" + " ======================================");
		
//		
//		String two = "Freedom isnt Free";
//		processWords(two);
//		
//		
//		 
//		
//		
//		
//	}
//	
//	public static void processWords(String str) {
//		
//		String [] xray = str.split(" ");
//		for (String y : xray) {
//			System.out.println(y.charAt(0) +  "" + y.charAt(y.length()-1));
//		}
//		
//		
		
		
		
ProcessString obj = new ProcessString();
		System.out.println(obj.fibcreater(10));
		
		}
		
		

	
	
	
	//generate a function that guesses the next fibonacci number:
	// 1,1,2,3,5,8,13,21,34,55
	
	
//
//
//	ArrayList<Integer> fibocreate(int n){
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		if( n == 1) {
//			numbers.add(1);
//		}else {
//		
//		numbers.add(1);
//		numbers.add(1);
//		}
//		for( int i = 2; i < n; i++) {
//			int x = numbers.get(i-1) + numbers.get(i-2);
//			numbers.add(x);
//		}
//		return numbers ;
//		
//	}
//	

	
	
	
	
	
	
	
	







public ArrayList<Integer> fibcreater(int n){
	ArrayList<Integer> number = new ArrayList<Integer>();
	
	if (n == 1) {
	number.add(1);
	}else{
		number.add(1);
		number.add(1);
		for( int i = 2; i < n; i++) {
			int z = number.get(i-1) + number.get(i-2);
			number.add(z);
		}
		
	}
	return number;
	
	
}







public static String processSentence(String temp) {
	String some = "";
	
	String [] arr =temp.split(" ");
	for (String x : arr) {
		if (x.length() > 1) {
		some+= x.charAt(0) + ""+ x.charAt(x.length()-1)+ " ";
		}else {
		some += 	x.charAt(0) + " ";
		}
		
	}
	return some;
}











	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	

