package blackjack;
import java.util.*;

public class Deck {
	
	public Card[] deckCards = new Card[52];
	
	public Deck(){
		int count = 0;
		
		for(int i = 0; i < 13; i++){
			
			Card testcard = new Card();
			testcard.setSuit("Heart");
			count++;
			testcard.setRank(count);
			deckCards[i] = testcard;
		}
		
		count = 0;
		for(int i = 13; i < 26; i++){
			this.deckCards[i].setSuit("Diamond");
			count++;
			this.deckCards[i].setRank(count);
		}
		
		count = 0;
		for(int i = 26; i < 39; i++){
			this.deckCards[i].setSuit("Spade");
			count++;
			this.deckCards[i].setRank(count);
		}
		
		count = 0;
		for(int i = 39; i < 52; i++){
			this.deckCards[i].setSuit("Club");
			count++;
			this.deckCards[i].setRank(count);
		}
		int index;
		Card temp;
		Random random = new Random();
		for(int i = this.deckCards.length - 1; i > 0; i--) {
			index = random.nextInt(i + 1);
			temp = this.deckCards[index];
			this.deckCards[index] = this.deckCards[i];
			this.deckCards[i] = temp;
		}
		System.out.println("Deck:");
		for(int i = 0; i < 52; i++) {
			System.out.println(this.deckCards[i].getSuit() + this.deckCards[i].getRank());
		}
	}
	
	public Card getCard(int index) {
		return this.deckCards[index];
	}
}
