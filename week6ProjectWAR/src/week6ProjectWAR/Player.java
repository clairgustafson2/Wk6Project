package week6ProjectWAR;

import java.util.ArrayList;
import java.util.List;

public class Player {
	//field hand
	List<Card> hand = new ArrayList<>();
	
	//field score
	int score;
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	//field name
	String name;
	public Player(String name) {
		this.name = name;
	}
	
	//prints out information about the player and calls the describe method for each card in the Hand List
	public String describe() {
		StringBuilder builder = new StringBuilder();
		builder.append(Player.class.getSimpleName())
		.append(" name=").append(name)
		.append(" , score= ").append(score);
		
		for(Card card : hand) {
			builder.append("\n").append(card.describe());
		}
		return builder.toString();
	}

	//removes and returns the top card of the Hand
	public Card flip() {
		return hand.remove(0);
	}
	
	//takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	//adds 1 to the Player’s score field
	public void incrementScore() {
		score +=1;
	}
}
