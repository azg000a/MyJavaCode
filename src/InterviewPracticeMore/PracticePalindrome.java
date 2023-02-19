package InterviewPracticeMore;

public class PracticePalindrome {
	
	// use StringBuilder, use for loop and lastly create a function with reduced execution time
	
	
	
	
	public static boolean isPalindrome1(String word) {
		StringBuilder sb = new StringBuilder(word);
		
		
		return word.equals(String.valueOf(sb.reverse()));
	}
	
	
	public static boolean isPalindrome2(String word) {
		String x = "";
		for( int i = word.length()-1; i >=0; i--) {
			x += word.charAt(i);
		}
		
		
		return word.equals(x);
	}
	
	
	//cut execution time in half without Casing Consideration
	public static boolean isPalindrome3(String word) {
		for(int fwd = 0, bck = word.length()-1; fwd < word.length(); 
				fwd ++, bck --) {
			if( fwd == bck || fwd > bck) {
				return true;
			}
			if (word.charAt(fwd) == word.charAt(bck)) {
				continue;
			}
			return false;
		}
		
		return true;

	}
	
	//cut execution time in half with casing consideration
	
	public static boolean isPalindrome4(String word, boolean caseConsider) {
		String x = "";
		
		if(caseConsider) {
			x=word;
		}else {
			x= word.toLowerCase();
		}
		for(int fwd = 0, bck = x.length()-1; fwd<x.length(); fwd++, bck--) {
		
		if(fwd == bck || fwd > bck) {
			return true;
		}
		
		if(x.charAt(fwd) == x.charAt(bck)) {
			continue;
		}
		return false;
		}	
		
		return true;
	}
	
	
	
	
	
	
	public static void main (String [] args) {
		
		String str = "Abcdcba";
		
		System.out.println(isPalindrome1(str));
		System.out.println(isPalindrome2(str));
		System.out.println(isPalindrome3(str));
		System.out.println(isPalindrome4(str,false));
		
	}

}
