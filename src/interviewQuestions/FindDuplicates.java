package interviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

	// 2 options to do this: #1 is Shifting #2 is HashMap
	// Shifting has a code complexity of O(n^2)
	
// this is an example of shifting:
	public static boolean isDuplicate(String[] input) {

		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i].equals(input[j])) {
					return true;
				} 
			}
		}

		return false;
	}
// if you want to return just 1 value then write 'out:  '  infront of the first forloop and then break using the same word 'out'
	//if you want to return more than 1 duplicate value then remove the out feature!!
	
	//this is also an example of shifting:
public static void printDuplicate(String [] input) {
out:	for (int i = 0; i <input.length; i++) {
		for (int j = i +1; j < input.length; j++) {
			if(input[i].equals(input[j])) {
			System.out.println("Duplicate value is: " + input[i] + " and the indexes it is found on is: " + i +" and " + j);
			break out;
		}
	}
	}
	
}
	

// this is an example using Sets because they don't accept duplicate values!
// this code has a code complexity of O(n) and this method is more efficient than the shifting one!


public static void printDuplicate2(String  [] input) {
	
	Set<String> temp = new HashSet<String>();
	
	for(int i = 0; i <input.length; i++) {
		if(!temp.add(input[i])) {
			System.out.println("Duplicate element found on index of "+ i + " with a value of: "+input[i] );
		}
	}
	
	
	
}


























	public static void main(String[] args) {

		String[] temp = { "VA","VA", "CA", "MA", "CT", "NY", "DC", "FL", "TX", "CA", "MA"};

		System.out.println(isDuplicate(temp));
		printDuplicate(temp);
		System.out.println("========================================================");
		printDuplicate2(temp);

	}

}
