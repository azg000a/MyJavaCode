package oopsAgain;

public class CreateObjectFromTextBoxClass {
	public static void main (String [] args) {
		
		
		
	//	TextBox textbox1 = new TextBox();         // this is creating a new instance OR (Object) of the TextBox class. 
		
		var textbox1 = new TextBox();  		// this is a better way to write it. **var keyword** is used and because we have new TextBox on the right side
											// of the assignment operator and using the right side it can detect which class we are referring to! 
// var keyword being used here **IS STATIC** meaning you cannot change it!  Other languages it could mean something else like assigning new values.
		
		
		
		textbox1.setText("Box 1");
		System.out.println(textbox1.text.toLowerCase());
		
		
		
		var textbox2 = new TextBox();
		textbox2.setText("Box 2");
		System.out.println(textbox2.text.toUpperCase());
		
		
		
		
		
//		Memory Allocation: 
	//				use var textbox1 = new TextBox()	as an example:
		//                 FIRST     JAVA runtime evaluates what is on the right side of the assignment operator
		//					THEN  it creates a new TextBox object on the HEAP 
		//					THEN lets say the address of the TextBox is 100
		//					THEN  JAVA looks at the left side **var textbox1** and it allocates some memory on the STACK and stores the address 
		//									of the TextBox object that is on the HEAP.  **var textbox1** is referencing an object on the HEAP. 
		
		
		// Garbage Collector in JAVA removes unused objects on the HEAP. 
		
		
		
		
		
		
	}

}
