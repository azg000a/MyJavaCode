package collectionsExamples;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {
	public static void main (String [] args) {
		
		Vector<String> vec = new Vector();
		
		vec.add("a");
		vec.add("b");
		vec.add("c");
		vec.add("d");
		
		
		Enumeration <String> en = vec.elements();
		while(en.hasMoreElements()) {
			
			String s = en.nextElement();
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
