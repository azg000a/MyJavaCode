package interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
	
	// counting characters
	
	public static Map<Character, Integer> countChars(String str){
		
		Map<Character, Integer> chars = new HashMap<Character,Integer>();
		
		for(int i =0; i <str.length(); i++) {
			if (chars.containsKey(str.charAt(i))) {
				chars.put(str.charAt(i), chars.get(str.charAt(i)) +1);
			}
			else {
				chars.put(str.charAt(i), 1);
			}
		}
		
		
		return chars;
	}
	
	
	// counting words
	
	public static Map<String,Integer> countWords(String str){
		Map<String, Integer> words = new HashMap<String,Integer>();
		for(String w : str.split(" ")) {
			if(words.containsKey(w)) {
				words.put(w,words.get(w) +1);
			}
			else {
				words.put(w,1);
				
			}
		}
		return words;
	}
	
	public static void main (String [] args) {
		
		System.out.println(countChars("My Name is Ahmad Zia Ghafoor"));
		
		System.out.println(countWords("My name is is Ahmad Zia Ghafoor"));
	}
	
	
	
 


}


