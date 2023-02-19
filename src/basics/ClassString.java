package basics;

public class ClassString {

	public static void main(String[] args) {

		String str = "test is what we had at first";
		String str2 = "test";

		String str3 = new String("test");

		System.out.println("using method equals: " + str.equals(str3));

		System.out.println(str.length());

		System.out.println(str.concat(" : this is the text we added"));
		
		
		
		String java = "Java is fun!";
		
		System.out.println(java.charAt(11));

		System.out.println((java.length()-1));
		
		
		
		String firstName = "Ahmad";
		String lastName = "Ghafoor";
		String email = firstName.toLowerCase() +"." + lastName.toUpperCase() + "@gmail.com";
		
		System.out.println(email);
		
		boolean itcontains = firstName.contains("Ahm");
		System.out.println(itcontains);
		
		
		String s1 = "Wel Done";
		boolean x=s1.startsWith("Done");
		System.out.println(x);
		
	}

}
