package oopsinClass;

public class BookMain {
	public static void main(String[] args) {
		
	
	
	
		Book b1 = new Book("Harry Potter", 19.99);
		
		System.out.println(b1.title + " $" +  b1.price);
	

		
		
		int add = b1.sum(55, 10, 55);
		
		System.out.println("add is: " + add);
		
		
		System.out.println("my add signs: " + b1.pluses(1));
		
		
		
		System.out.println(b1.findLongestLength("This", "is the longest", "String"));
		
		System.out.println(b1.dashes(100));
		
		b1.printTitle();
		
		System.out.println("========================================" + "\n");
		System.out.println(b1.longestLength("23", "1", "123"));

		
		System.out.println("========================================");
		
		
b1.printTitle();		
		
		
}
}