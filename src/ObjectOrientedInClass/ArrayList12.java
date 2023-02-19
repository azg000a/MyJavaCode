package ObjectOrientedInClass;

import java.util.ArrayList;

public class ArrayList12 {

	public static void main(String[] args) {

		
		// ArrayList has toString function already implemeneted in it. 
		
		ArrayList <String> temp1 = new ArrayList <String>();
		
		
		temp1.add("String 1");
		temp1.add("String 2");
		temp1.add("String 3");
		temp1.add("String 4");
		temp1.add("String 5");
		temp1.add("String 6");
		
		System.out.println(temp1.size());
		
		System.out.println(temp1.get(1));
		
		System.out.println(temp1.remove(5));
		
		
		System.out.println(temp1);
		
		for(String x : temp1) {
			System.out.println(x);
		}
		
		
	}

}
