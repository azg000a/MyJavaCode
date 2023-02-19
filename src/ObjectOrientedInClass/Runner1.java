package ObjectOrientedInClass;

public class Runner1 {
	public static void main(String[] args) {
		
		
		String str = new String ("test");
		
		Student stu = new Student ();
		stu.firstName = "Jack";
		stu.lastName = "Ma";
		stu.age = 4;
		
		
		
		
		Student stu2 = new Student("Ahmad ","Ghafoor ", 25);
		
		
		System.out.println(stu.firstName);
		System.out.println(stu.lastName);
		System.out.println(stu.age);
		
		System.out.println(stu2.firstName + stu2.lastName + stu2.age);
		
		System.out.println("=============================================");
		
		stu.printStudent();
		stu2.printStudent();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
