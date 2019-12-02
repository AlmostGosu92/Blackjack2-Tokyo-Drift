package blackjack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException {
			
		// === SKAPA KORTLEK MED EN LIST ===

		ArrayList<Card> deck = new ArrayList<Card>();

		Suit[] suits = Suit.values();
		
		for (int j = 0; j < 4; j++) {
			for (int i = 1; i < 14; i++) {

				Card card = new Card(i, suits[j]);
				deck.add(card);
			}

		}
		
		ArrayList<Card> shuffledDeck = new ArrayList<Card>();
		
		while (deck.size() > 0) {
		
			int randomInt = (int) Math.floor(Math.random() * deck.size());
	
			Card card = deck.get(randomInt);
			shuffledDeck.add(card);
			
			deck.remove(randomInt);
		
		}
		
		ArrayList<Card> hand = new ArrayList<Card>();
		ArrayList<Card> dealerHand = new ArrayList<Card>();
		
		while(hand.size() < 2 || dealerHand.size() < 2) {
			
			Card drawnCard = shuffledDeck.get(0);
			hand.add(drawnCard);
			shuffledDeck.remove(0);

			drawnCard = shuffledDeck.get(0);
			dealerHand.add(drawnCard);
			shuffledDeck.remove(0);

		}
		
		boolean again = true;
		Scanner in = new Scanner(System.in);
		
		while (again) {
			
			System.out.println("=== DEALER ===");
			for (Card card3 : dealerHand) {
				System.out.println(card3);
			}
			
			System.out.println("=== HAND ===");
			for (Card card4 : hand) {
				System.out.println(card4);
			}
			
			System.out.println("Your score is: " + getScore(hand));
			
			System.out.println("Do you want to hit (h) or stay (s)?");
			
			String svar = in.nextLine();
			
			
			if (svar.equals("h")) {
				Card drawnCard = shuffledDeck.get(0);
				hand.add(drawnCard);
				shuffledDeck.remove(0);	
				System.out.println("hit");
			}else {
				System.out.println("stayed");
				again = false;
			}
		}
		in.close();
		
	}
	static int getScore(ArrayList<Card> hand) {
		
		int points = 0;
		for (Card cards : hand){
			points += cards.value;
			
		}
		return points;
	}
}

