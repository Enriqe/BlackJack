package blackjack;
import java.util.*;

public class Deck extends Card{
	
	Card[] deckCards = new Card[52];

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
		int index, temp;
		String sTemp;
		Random random = new Random();
		for(int i = deckCards.length - 1; i > 0; i--) {
			index = random.nextInt(i + 1);
			temp = deckCards[index].rank;
			sTemp = deckCards[index].suit;
			deckCards[index] = deckCards[i];
			deckCards[i].rank = temp;
			deckCards[i].suit = sTemp;
		}
	}

}
