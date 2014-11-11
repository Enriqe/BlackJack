package blackjack;

import java.util.Random;

public class Hand {
    
	Card[] cards = new Card [10]; //arreglo dinamico para agregar cartas con cada "hit"
    int cartas=0;
    int suma = 0;
    
    
	public void addCard(Card cardDrawn) {
		cards[cartas] = cardDrawn;
		cartas++;
	}
	
	public int getSum() {
		suma = 0;
		for(int i = 0; i < cartas; i++) {
			suma += cards[i].getRank();
		}
		return suma;
	}

}
