package InterviewPracticeMore;

public class PalindromeExamplee {
	
	//using a String Builder, for loop and a for loop to cut execution time with
	// and without casing consideration
	
	
	//StringBuilder Example
	public static boolean isPalindrome1(String word) {
		
		StringBuilder sb = new StringBuilder(word);
		
		
		
		
		
		return word.equals(String.valueOf(sb.reverse()));
	}
	
	//For Loop Example
	public static boolean isPalindrome2(String word) {
		String reverse = "";
		for(int i = word.length()-1; i >= 0; i --) {
			reverse += word.charAt(i);
		}
		
		return word.equals(reverse);
	}
	
	
	//Cut Execution time Example
	public static boolean isPalindrome3(String word) {
	String reverse = "";
//		
//		if(considerCase) {
//			word = reverse;
//			
//		}else {
//			word.toLowerCase();
//		}
		for (int fwd = 0, bck = reverse.length()-1; fwd < reverse.length();
				fwd ++, bck --) {
			if( fwd == bck || fwd > bck) {
			return true;
		}
			if( reverse.charAt(fwd) == reverse.charAt(bck)) {
				continue;
			}
			return false;
		}
		return true;
	}
	
	
	
	
	
	
	public static void main (String [] args) {
		
		
		String x = "Abcdedcba";
		
		
		
		System.out.println(isPalindrome1(x));
		System.out.println(isPalindrome2(x));
		System.out.println(isPalindrome3(x));
		
		
		
		
		
		
	}
	
	
	
	
}
