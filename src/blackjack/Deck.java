package blackjack;

public class Deck extends Card{
	
	Card deckCards[52];

	public void createDeck() {
		int count = 0;
		for(int i = 0; i < 13; i++){
			deckCards[i].setSuit('');
			count++;
			deckCards[i].setRank(count);
			else if(i > 12 && i < 26){
				
			}
			
		}
		count = 0;
		for(int i = 13; i < 26; i++){
			deckCards[i].setSuit('');
			count++;
			deckCards[i].setRank(count);
		}
		count = 0;
		for(int i = 26; i < 39; i++){
			deckCards[i].setSuit('︎');
			count++;
			deckCards[i].setRank(count);
		}
		count = 0;
		for(int i = 39; i < 52; i++){
			deckCards[i].setSuit('');
			count++;
			deckCards[i].setRank(count);
		}
	}

	public void shuffleDeck() {
		// TODO Auto-generated method stub
		
	}

}
