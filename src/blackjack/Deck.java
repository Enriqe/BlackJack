package blackjack;
import java.util.*;

public class Deck extends Card{
	
	Card[] deckCards = new Card[52];
	
	public void Deck(){
		Card[] deckCards = new Card[52];
		this.createDeck();
	}

	public Card[] getDeckCards() {
		return deckCards;
	}

	public void setDeckCards(Card[] deckCards) {
		this.deckCards = deckCards;
	}

	public void createDeck() {
		int count = 0;
		for(int i = 0; i < 13; i++){
			deckCards[i].setSuit("Heart");
			count++;
			deckCards[i].setRank(count);
		}
		
		count = 0;
		for(int i = 13; i < 26; i++){
			deckCards[i].setSuit("Diamond");
			count++;
			deckCards[i].setRank(count);
		}
		
		count = 0;
		for(int i = 26; i < 39; i++){
			deckCards[i].setSuit("Spade");
			count++;
			deckCards[i].setRank(count);
		}
		
		count = 0;
		for(int i = 39; i < 52; i++){
			deckCards[i].setSuit("Club");
			count++;
			deckCards[i].setRank(count);
		}
		int index;
		Card temp;
		Random random = new Random();
		for(int i = deckCards.length - 1; i > 0; i--) {
			index = random.nextInt(i + 1);
			temp = deckCards[index];
			deckCards[index] = deckCards[i];
			deckCards[i] = temp;
		}
	}
	
	

}
