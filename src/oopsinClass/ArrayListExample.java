package oopsinClass;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
			// wrapper classes:
		//wrapper classes will wrap a primitive into a reference data type;
		//byte = Byte
		//short = Short
		//int = Integer
		// double = Double
		//float = Float
		//char = Character
		// boolean = Boolean
		//<cannot take primitive here> is called generics. Generics will not accept primitives. 
		
		
		
		
		
		ArrayList <String> names = new ArrayList <String> ();
		
		// to get the length = use the method size()
		System.out.println(names.size());
		
		
		// to add items = use the method add()
		
		names.add("name1");
		names.add("name2");
		names.add("name3");
		names.add("name4");
		names.add("name5");
		names.add("name6");
		// to get a value, use the method get()
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		System.out.println(names.get(3));
		System.out.println(names.get(4));
		System.out.println(names.get(5));
		System.out.println(names.get(6));
		// print the list, you can loop or print the name of your list
		
		for(String n : names ) {
			System.out.println("foreach" + n);
		}
		
		
		
		
	}

}
