package blackjack;

import java.util.Scanner;

public class Game {
    public static Player player = new Player(), dealer = new Player();
    public int recorrido = 0;
    public static Deck deck = new Deck();
    
    public Game(){
    	recorrido = 0;
    }
    
    public Game(Player p, Player deal, int r){
    	player = p;
    	dealer = deal;
    	recorrido = r;
    }
   
    
    Player player(String nombre) {
		return null;
	}

    void hit(boolean p){
    	if(p){
            player.hand.addCard(deck.deckCards[recorrido]);
            recorrido++;
    	}
    	else{
            dealer.hand.addCard(deck.deckCards[recorrido]);
            recorrido++;
    	}
    }
    
    void deal() {
        recorrido = 0;
        
        player.turn = true;
        player.name = "";
        dealer.name = "Dealer";
        dealer.turn = false;
        
        player.hand.addCard(deck.getCard(recorrido));
        //System.out.println("Carta: " + deck.getCard(recorrido).getSuit() + deck.getCard(recorrido).getRank());
        recorrido++;
        
        player.hand.addCard(deck.getCard(recorrido));
        //System.out.println("Carta player: " + deck.deckCards[recorrido].getSuit() + deck.deckCards[recorrido].getRank());
        recorrido++;
        
        dealer.hand.addCard(deck.getCard(recorrido));
        //System.out.println("Carta dealer: " + deck.deckCards[recorrido].getSuit() + deck.deckCards[recorrido].getRank());
        recorrido++;     
        
        dealer.hand.addCard(deck.getCard(recorrido));
        //System.out.println("Carta dealer: " + deck.deckCards[recorrido].getSuit() + deck.deckCards[recorrido].getRank());
        recorrido++;
    };
    
    public static void main(String [] args){
    	Scanner in = new Scanner(System.in);
    	
    	Game Juego = new Game();
    	System.out.println("BlackJack!");
    	Juego.deal();
    	
    	System.out.println("What is your name?");
    	//String s = System.console().readLine();
    	String s = in.next();
    	player.setName(s);
    	
    	System.out.println(player.getName() + " it's your turn.");
    	System.out.println("Your hand: " + player.getScore());
    	
    	System.out.println("Hit? (1)");
    	System.out.println("Stay? (2)");
    	System.out.println("Quit? (3)");
    	
    	int i = in.nextInt();
    	
    	if(i == 1){
    		if(player.turn){
    			//.hit(true);
    		}else{
    			while(dealer.getScore() < player.getScore()){
    				//.hit(true);
    				if(dealer.getScore() >= player.getScore()){
    					player.turn = !player.turn;
    					dealer.turn = !dealer.turn;
    							
    				}
    			}
    		}
    	}
    	else if(i == 2){
    		//stay
    		if(player.turn){
    			player.turn = !player.turn;
    			dealer.turn = !dealer.turn;
    		}
    		
    	}
    	else if(i == 3){
    		System.out.println("Ended Game");
    		System.exit(0);
    	}
    	
    	System.out.println(i);
    	System.out.println(s);
    	
    	 in.close();
    }
}
