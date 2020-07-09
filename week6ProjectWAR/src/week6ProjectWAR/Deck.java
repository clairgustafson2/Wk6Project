package week6ProjectWAR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> cards = new ArrayList<Card>(); 
	private String[] suits = {" of Diamonds", " of Hearts", " of Spades", " of Clubs"};
	private String[] values = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	
	public void Card() {
		for(String name : suits) {
			for (String value : values) {
				
				cards.add(new Card(value, name));
			}
		}
	}
		
		
	public void shuffle() {
		Collections.shuffle(cards);
	}	
	
	
}
