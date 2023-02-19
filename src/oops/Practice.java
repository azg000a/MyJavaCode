package oops;

public class Practice {
	
	private String student_Name;  
    private int student_rollNo;  
    private int student_Age;  
    
    
    public int getAge() {
        return student_Age;
    }
    public String getName() {
        return student_Name;
    }
    public int getRoll() {
        return student_rollNo;
    }
    public void setAge(int newAge) {
        student_Age = newAge;
    }
    public void setName(String newName) {
        student_Name = newName;
    }
    public void setRoll(int newRoll) {
        student_rollNo = newRoll;
    }
}


