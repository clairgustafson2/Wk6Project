package week6ProjectWAR;

public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		Player clair = new Player("Clair");
		Player derek = new Player("Derek");
		
		
		//call shuffle method on deck
		
		deck.shuffle();
		
		//use traditional for loop to loop 52x giving player a card
		for(int index = 0; index < 52;index++) {
			if(index %2 == 0) {
				clair.draw(deck);
			}
			else {
				derek.draw(deck);
			}
		}
		
		//use traditional for loop 26x. Call flip for each player. Call increment score on winner.
		 for (int index = 0; index <26; index++) {
			 Card clairCard = clair.flip();
			 Card derekCard = derek.flip();
			 
			 if(clairCard.getValue() > derekCard.getValue()) {
				 clair.incrementScore();
			 }
			 else if(derekCard.getValue() > clairCard.getValue()){
				 derek.incrementScore();
			 }
		 }
		
		//print final scores
		if (clair.getScore() > derek.getScore()) {
			System.out.println("Clair is the winner with a score of  " + clair.getScore());
		}
		else if (derek.getScore() > clair.getScore()){
			System.out.println("Derek is the winner with a score of " + derek.getScore());
		}
		else {
			System.out.println("It's a draw!");
		}

	}

}
