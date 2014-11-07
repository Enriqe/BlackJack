package blackjack;

import java.util.Random;

public class Hand extends Card{
    Card cards[]; //arreglo dinamico para agregar cartas con cada "hit"
    int cartas=0;
    Random rand	= new Random();
    
	public void addCard() {
		// TODO Auto-generated method stub
		int n= rand.nextInt(52)+1;
		cards[cartas] = 
		cartas +=1;
	}
	
	
    
    //int getSum(cards[]);
    //void addCard();

}
