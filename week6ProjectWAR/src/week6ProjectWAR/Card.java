package week6ProjectWAR;

public class Card {
	//fields of name and value
	private String name;
	private String value;
	
	public Card (String value, String name) {
		this.value= value;
		this.name= name;	
	}
	
	
	//Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	//prints out information about a card
	public void describe() {
			System.out.println(getValue()+ " of " + getName());
		
	}
	}
