package oopsAgain;

public class UIControl {
	
	// Learning Inheritance here:
	
	private boolean isEnabled = true;
	
	public UIControl(boolean isEnabled) {
		this.isEnabled = isEnabled;
		System.out.println("UIControl");
		
	}
	
	
	public void enable() {
		isEnabled = true;
	}

	
	public void disable() {
		isEnabled = false;
	}
	
	public boolean isEnabled() {    // this is a getter
		return isEnabled;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
