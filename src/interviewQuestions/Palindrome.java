package interviewQuestions;

public class Palindrome {
	
	//find out if a word is a palindrome:  this can be done 2 days: 1) using a String builder or String buffer   (2) using a for loop... in
	// interviews explain there are 2 ways I can do this, which way would you like? 
	// I can also cut the execution time in half, I can show this to you guys if you would like me to: 
	
	
	public static void main (String [] args) {
		String word = "Abcdcba";
		
		System.out.println("isPalindrome1:      " + isPalindrome1(word));
		System.out.println("isPalindrome2:      " + isPalindrome2(word));
		System.out.println("isPalindrome3:      " + isPalindrome3(word));
		System.out.println("isPalindrome4:      " + isPalindrome4(word,true));  // when i pass false here it means do not consider the casing!!
		
		
	}
		
		
		public static boolean isPalindrome1(String word) {
			
			//this is option 1:  String builder or String buffer      has a method that you can use to reverse a string 
			
			StringBuilder sb = new StringBuilder(word);
			
			
			 
			
			
			
			return word.equals(String.valueOf(sb.reverse()));
		}
		
		
		
		
		
		public static boolean isPalindrome2(String word) {
			// this is option2: for loop
			
			String rev = "";
			
			for(int i = word.length()-1; i >= 0; i--) {
				
				rev+=word.charAt(i);
				
			}
			
			
			return word.equals((rev));
		}
		
		//less execution time without boolean parameter
		
		public static boolean isPalindrome3(String word) {
			for(int fwd = 0, bck = word.length()-1; fwd<word.length(); fwd++, bck--) {
				
				if( fwd == bck || fwd > bck) {
					return true;
				}
				if(word.charAt(fwd)== word.charAt(bck)) {
					continue;
				}
				return false;
			}
			
			return true;
		}
		
		
		
		public static boolean isPalindrome4(String word, boolean considerCase) {
			//this cuts execution time in half: considerCase refers to upper and lower case alphabets. if they ask during interview to not consider casing
			//then you would write it like this. with the boolean!
			 String w = "";
			 
			if(considerCase ) { 
				w = word;
			}else {
				w = word.toLowerCase(); // or you can do toUpperCase(), it does not matter. 
			}
			for (int fwd = 0, bck = w.length()-1; fwd < w.length(); fwd++, bck--) {
				//if at any point fwd is == to bck then it is a palindrome and
				// return true to get out of the method!
				if(fwd == bck || fwd > bck) {
					return true; 
				}
				if(w.charAt(fwd) == w.charAt(bck)) {
					//the chars are equal, we go to the next chars
					continue;
				}
				return false; // return false because if chars are not equal
				// then it is not a palindrome!
				// if the continue gets executed then this line here will never be reached. 
			}
			
			
			
			
			return true;
		}
		
		
		
		
		
	
	
	

}
