package week6ProjectWAR;

public class Card {
	//fields of name and value
	private int value;
	private String name;
	
	public Card (int value, String name) {
		this.value= value;
		this.name= name;	
	}
	
	//prints out information about a card
		public String describe() {
			return value + " " + name;	
		}
	
	//Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	}
