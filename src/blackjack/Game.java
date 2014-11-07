package blackjack;

import java.util.Scanner;

public class Game {
    public Deck deck;
    public static Player player = new Player(), dealer;
    public int recorrido = 0;
    public Card cartaActual;
    
    public Game(Deck d, Player p, Player deal, int r){
    	deck = d;
    	player = p;
    	dealer = deal;
    	recorrido = r;
    }
    
    Deck deck(){
    	return null;
    }
    
    Player player(String nombre) {
		return null;
	}


    void deal() {
        deck.createDeck();
        recorrido = 0;
        
        player.turn = true;
        player.name = "";
        dealer.name = "Dealer";
        dealer.turn = false;
        
        cartaActual = deck.deckCards[recorrido];
        player.hand.addCard(cartaActual);
        recorrido++;
        cartaActual = deck.deckCards[recorrido];
        player.hand.addCard(cartaActual);
        recorrido++;
        cartaActual = deck.deckCards[recorrido];
        dealer.hand.addCard(cartaActual);
        recorrido++;        
        cartaActual = deck.deckCards[recorrido];
        dealer.hand.addCard(cartaActual);
        recorrido++;
    };
    
    public static void main(String [] args){
    	Scanner in = new Scanner(System.in);
    	System.out.println("BlackJack!");
    	System.out.println("Score: " + player.getScore());
    	System.out.println("Hit?");
    	int i = in.nextInt();
    	String s = in.next();
    	System.out.println(i);
    	System.out.println(s);
    }

    
    
    void hit(boolean p){
    	if(p){
            cartaActual = deck.deckCards[recorrido];
            player.hand.addCard(cartaActual);
            recorrido++;
    	}
    	else{
            cartaActual = deck.deckCards[recorrido];
            dealer.hand.addCard(cartaActual);
            recorrido++;
    	}
    }
}
