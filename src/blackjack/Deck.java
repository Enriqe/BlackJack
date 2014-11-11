package blackjack;
import java.util.*;

public class Deck {
	
	public Card[] deckCards = new Card[52];
	
	public void Deck(){
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
		System.out.println("Deck:");
		for(int i = 0; i < 52; i++) {
			System.out.println(deckCards[i].getSuit() + deckCards[i].getRank());
		}
	}
	
	public Card getCard(int index) {
		return this.deckCards[index];
	}
}
