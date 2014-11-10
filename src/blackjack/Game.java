package blackjack;

import java.util.Scanner;

public class Game {
    public Deck deck;
    public static Player player = new Player(), dealer = new Player();
    public int recorrido = 0;
    public Card cartaActual;
    
    public Game(){
    	deck = new Deck();
    	player = new Player();
    	dealer = new Player();
    	recorrido = 0;
    }
    
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
        Deck deck = new Deck();
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
    	Game Juego = new Game();
    	System.out.println("BlackJack!");
    	Juego.deal();
    	System.out.println("Score: " + player.getScore());
    	System.out.println("Hit? (1)");
    	System.out.println("Stay? (2)");
    	System.out.println("Quit? (3)");
    	int i = in.nextInt();
    	
    	if(i == 1){
    		if(player.turn){
    			//.hit(true);
    		}
    	}
    	else if(i == 2){
    		//stay
    	}
    	else if(i == 3){
    		System.exit(0);
    	}
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
