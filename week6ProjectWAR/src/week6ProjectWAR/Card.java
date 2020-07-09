package week6ProjectWAR;

public class Card {
	//fields of name and value
	private int name;
	private int value;
	
	public Card (int value, int name) {
		this.value= value;
		this.name= name;	
	}
	
	
	//Getters and setters
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

	public String toString(){

	        StringBuilder playingCard = new StringBuilder();
	        
	        switch(value){
	            case 11:
	                playingCard.append("Jack");
	                break;
	            case 12:
	                playingCard.append("Queen");
	                break;
	            case 13:
	                playingCard.append("King");
	                break;
	            case 14:
	                playingCard.append("Ace");
	                break;    
	            default:
	                playingCard.append(value); 
	                break;
	        }
	        
	        playingCard.append(" of ");
	        
	        switch(name){
	            case 0:
	                playingCard.append("Spades");
	                break;
	            case 1:
	                playingCard.append("Hearts");
	                break;
	            case 2:
	                playingCard.append("Clubs");
	                break;
	            case 3:
	                playingCard.append("Diamonds");
	                break;
	            default:
	                break;
	        }
	        
	        //return the result of an entire combined string
	        return playingCard.toString();
	    }
	
	//prints out information about a card
	
	}
