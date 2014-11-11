package blackjack;

import java.util.Random;

public class Hand extends Card{
    
	
	Card[] cards = new Card [10]; //arreglo dinamico para agregar cartas con cada "hit"
    int cartas=0;
    int suma = 0;
    
    
	public void addCard(Card cardDrawn) {
		// TODO Auto-generated method stub
		cards[cartas] = cardDrawn;
		cartas++;
		//cards[cartas] = cartas +=1;
	}
	
	public int getSum() {
		suma = 0;
		for(int i = 0; i < cartas; i++) {
			suma += cards[i].getRank();
		}
		return suma;
	}
    
    //int getSum(cards[]);
    //void addCard();

}
