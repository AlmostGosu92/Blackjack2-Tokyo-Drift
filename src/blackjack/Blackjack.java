package blackjack;
import java.util.ArrayList;
public class Blackjack {
	
	ArrayList<Card> createDeck() {
		
		ArrayList<Card> deck = new ArrayList<Card>();
		Suit[] suits = Suit.values();
		
		for (int j = 0; j < 4; j++) {
			
			for (int i = 1; i < 14; i++) {
				Card card = new Card(i, suits[j]);
				deck.add(card);
			}
		}
		
		return deck;
	}
	
	
	public static void main(String[] args) {
		
		Blackjack blackjack = new Blackjack();
		ArrayList<Card> deck = blackjack.createDeck();
		System.out.println(deck);
	}
}