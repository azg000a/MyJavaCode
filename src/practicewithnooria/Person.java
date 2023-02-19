package practicewithnooria;

public class Person extends SantaList {

	private String personName;
	private String state;
	private int age;

	public Person() {
		super();
		this.personName = "";
		this.state = "";
		this.age = 0;
	}

	public Person(String personName, String state, int age) {
		super();
		this.personName = personName;
		this.state = state;
		this.age = age;
	}


	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age= age;
	}


	public String toString() {
		return "Person Name: " + personName + " State: " + state + " Age: " + age ;
	}







}
