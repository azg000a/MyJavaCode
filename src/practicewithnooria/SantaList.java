package practicewithnooria;

import java.util.ArrayList;

public class SantaList  {
	
	
	ArrayList <Gift> giftList;
	ArrayList <Person> personList;
	
	
	public SantaList() {
		super();
		this.giftList = new ArrayList<Gift>();
		this.personList = new ArrayList<Person>();
		
	}
	
	public ArrayList<String> addToys(String name){
		ArrayList<String> toys2 = new ArrayList<String>();
		toys2.add("Teddy Bear");
		toys2.add("Cookie");
		toys2.add("monster truck");
		toys2.add("Socks");
	
	return toys2;
	}
	
	// using Map to assign gifts to each person (person as keys and values being the gift)
	
	
	
	public void addGift(Gift type) {
		giftList.add (type);
	}
	
	public void addPerson(Person name) {
		personList.add(name);
	}
	

	
	public void PersonGift(Gift type, Person name) {
		personList.add(name);
		giftList.add(type);
		
	}
	
	
	public void printGiftList() {
		System.out.println(giftList);
	}
	public void printPersonList() {
		System.out.println(personList);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String toString() {
		
		return "Gift List: " + giftList + " Person List: " + personList;
	}
	
	
	
	
	
	
	
	

}
