package interviewQuestions;

import java.util.ArrayList;

public class PracticeJavaCoding {

// largest, smallest, sum, avg, second largest, second smallest
	
	
	
	public static int findLargestNumber(int [] num) {
		
		int largest = num [0];
		for (int i = 0; i < num.length; i ++) {
			if (largest < num[i])
				largest = num[i];
		}
		
		
		return largest;
	}
	
	public static int findSmallestNumber(int [] num) {
		int smallest = num[0];
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] < smallest) {
				smallest = num[i];
			}
		}
		
		
		return smallest;
	}
	
	public static void main(String [] args) {
		
		
		int [] number = {2,5,9,10,15,25,45};
		
		System.out.println("The largest value is: " + findLargestNumber(number));
		System.out.println("The smallest value is: "+findSmallestNumber(number));
		
		
		
		
		
	}
	
	
	
}