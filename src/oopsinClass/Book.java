package oopsinClass;

public class Book {
	
	String title;
	String genre;
	String author;
	String issueDate;
	double version;
	String isbn;
	double price;
	String publisher;
	int pageQty;
	
	
	public Book () {
		title = "";  genre = ""; author = "";issueDate = ""; version = 0; isbn = ""; price = 0; publisher = ""; pageQty = 0;
		
	}
	
	public Book(String title, double price ) {
	this.title = title;
	this.price = price;
	
		
	
	}
	
	
	public int sum(int a, int b, int c) {
		return a + b + c;
		
	}
	// void means it is just processing something; it will never return anything!
	
	public void printTitle() {
		String line1 = "Hell000000000000000000";
		String line2 = "Bye";
		String line3 = "Hi";
		System.out.println(addSigns(findLongestLength(line1, line2, line3)));

		System.out.println(line1);
		System.out.println(line2);
		System.out.println(line3);
		System.out.println(addSigns(longestLength(line1, line2, line3)));
}
	
	
	public String dashes(int n ) {
		String res = "";
		for (int i = 0; i < n; i++) {
			res+= "-";
		}
		
		return res ;
		
	}
		//print 10 pluses
		public String pluses (int k) {
			String adds = "";
			for(int i = 0; i < k; i++) {
				adds+= "+";
				
			}
			
			return adds;
		}
		
		
	
	
	
	public int findLongestLength(String s1, String s2, String s3) {
		int res = s1.length();

		if(s2.length() > s1.length()) {
			res = s2.length();
		}
		
	
	if (s3.length() > res) {
		res = s3.length();
	}
	return res;

	
	}
	
	
	
	
	
	
	
	
	
	// this is extra practice example of comparing 3 strings that I did on my own time: 
	
	
	
	public int longestLength(String n1 , String n2, String n3) {
		int result = n1.length();
		if(n2.length() > result) {
			result = n2.length();
		}
		if (n3.length() > result ) {
			result = n3.length();
		}
		
		
		
		return result;
	}
	
	
	
	
	
	
	
	public String addSigns (int x) {
		String sign = "";
		for (int i = 0; i < x; i++) {
			sign+= "+";
		}
		
		return sign;
	}
	
	
	
	
	
	
	
	 
	 
	
	
	
	
	
	
	
	
}
