package blackjack;

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
	}

	public void shuffleDeck() {
		// TODO Auto-generated method stub
		
	}

}
