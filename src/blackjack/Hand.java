package blackjack;

import java.util.Random;

public class Hand extends Card{
    
	
	Card[] cards = new Card [10]; //arreglo dinamico para agregar cartas con cada "hit"
    int cartas=0;
    
    
	public void addCard(Card cardDrawn) {
		// TODO Auto-generated method stub
		cards[cartas] = cardDrawn;
		cartas++;
		//cards[cartas] = cartas +=1;
	}
	
	
    
    //int getSum(cards[]);
    //void addCard();

}
