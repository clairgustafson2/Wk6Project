package week6ProjectWAR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> cards = new ArrayList<Card>(); {
	
		for (int x=0; x<4; x++) {
			for (int y=2; y<15;y++) {
				
				cards.add(new Card(x, y));
			}
		}
	}
		
	public void shuffle() {
		Collections.shuffle(cards);
	}	
	
	
}
