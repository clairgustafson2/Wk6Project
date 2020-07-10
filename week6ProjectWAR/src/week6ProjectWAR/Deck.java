package week6ProjectWAR;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	//List of card
	private List<Card> cards = new ArrayList<>();
	
	private String[] suits = {"Diamonds", "Hearts", "Spades", "Clubs"};
	private String[] values = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	
	//create new deck
	public Deck() {
		for ( String suit : suits) {
			for (int index = 0; index < values.length; index++) {
			String value = values[index];
			String cardName = value + " of " + suit;
			int cardValue = index + 2;
			
			Card card = new Card(cardValue, cardName);
			getCards().add(card);
			}
		}
	}
		
	//Shuffle method	
	public void shuffle() {
		Collections.shuffle(getCards());
	}
	
	//removes and returns the top card of the Cards field
	public Card draw() {
		
		return cards.remove(0);
	}
	
	//getters and setters for cards
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
		
}
