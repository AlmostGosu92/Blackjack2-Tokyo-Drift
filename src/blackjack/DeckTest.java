package blackjack;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeckTest {
	
	Deck deck;

	@BeforeEach
	void newDeck() {
		deck = new Deck();
	}
	
	@Test
	void testDeckSizeBeforeAndAfterShuffle() {
		int unshuffled = deck.getSize();
		deck.shuffle();
		assertEquals(unshuffled, deck.getSize());
	}
	
	@Test
	void testDrawAndDeckSizeBeforeAndAfterShuffle() {
		deck.draw();
		int unshuffled = deck.getSize();
		deck.shuffle();
		assertEquals(unshuffled, deck.getSize());
	}

}
