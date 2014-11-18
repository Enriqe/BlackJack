package blackjack;
import java.util.*;

public class Deck {
	
	public Card[] deckCards = new Card[52];
	
	/*
	 * El metodo de Deck, crea un mazo de cartas las cuales empiezan revueltas 
	 * se crean 13 cartas de cada uno de las manos y se insertan en un arreglo de cartas
	 */
	
	public Deck(){
		int count = 0;
		
		for(int i = 0; i < 13; i++){
			Card testcard = new Card();
			testcard.setSuit("Heart");
			testcard.setRank(count);
			deckCards[i] = testcard;
			count++;
		}
		
		count = 0;
		for(int i = 13; i < 26; i++){
			Card testcard = new Card();
			testcard.setSuit("Diamond");
			testcard.setRank(count);
			deckCards[i] = testcard;
			count++;
		}
		
		count = 0;
		for(int i = 26; i < 39; i++){
			Card testcard = new Card();
			testcard.setSuit("Spade");
			testcard.setRank(count);
			deckCards[i] = testcard;
			count++;
		}
		
		count = 0;
		for(int i = 39; i < 52; i++){
			Card testcard = new Card();
			testcard.setSuit("Club");
			testcard.setRank(count);
			deckCards[i] = testcard;
			count++;
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
	}
	
	/*
	 * El metodo get card regresa una carta del mazo de cartas
	 */
	
	public Card getCard(int index) {
		return this.deckCards[index];
	}
}
