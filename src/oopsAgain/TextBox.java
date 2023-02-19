package oopsAgain;


// public keyword is an access modifier and it means other classes have access to it.
public class TextBox extends UIControl {
	
	private String text ="";    // Field,  assign "" to it to avoid a NullPointerException which can crash the whole program later on. 
	
	public TextBox() {
		super(true);                      // we use super here to call the constructor of the base/super/parent class! It always comes first in the body!
		System.out.println("TextBox");
		
	}
	
	@Override              //this is method Overriding:
	public String toString() {
		return text;
		
	}
	
	
	
	
	public void setText(String text) {           // this is the method and void means it won't return any values. Also, we are setting the value of 
											//field here. 
	this.text=text;                            //we use this keyword when the name in the field and parameter are the same. 
	}
	
	
	
	public void clear(){						// this is another method. it is without any parameters. We don't need this keyword here because there 
												// are no parameters (the previous example text was repeated twice so we used this to differentiate the two)
		text = "";
	}
	
	
	
	
	
	
	
	// this is how you create a new class. In the 'CreateObjectFromTextBoxClass' we will create a new object from this specific class!
	
	
	
	
	
	
	

}
