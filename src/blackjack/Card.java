package blackjack;

public class Card {
	public final int  value;
	private final Suit suit;
	
	
	Card(int value, Suit suit){
		this.value = value;
		this.suit = suit;
	}
	
	int getCardValue() {
		return value;
	}
	
	Suit getCardSuit() {
		return suit;
	}
	
	@Override
	public String toString() {
		String prettyValue;
		switch(value) {
		case 1:
			prettyValue = "A";
			break;
		case 10:
			prettyValue = "T";
			break;
		case 11:
			prettyValue = "J";
			break;
		case 12:
			prettyValue = "Q";
			break;
		case 13:
			prettyValue = "K";
			break;
		default:
			prettyValue = "" + value;
		}
		
		switch (suit) {
		case HEARTS:
			return prettyValue + "♥";
		case SPADES:
			return prettyValue + "♠";
		case DIAMONDS:
			return prettyValue + "♦";
		case CLUBS:
			return prettyValue + "♣";
		default:
			throw new RuntimeException("Vad är " + suit +"?");
		}
		
	}
}
