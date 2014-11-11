package blackjack;


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

    void hit(){
    	if(player.turn){
            player.hand.addCard(deck.deckCards[recorrido]);
            recorrido++;
            player.turn = !player.turn;
            dealer.turn = !dealer.turn;
    	}
    	else{
            dealer.hand.addCard(deck.deckCards[recorrido]);
            recorrido++;
            player.turn = !player.turn;
            dealer.turn = !dealer.turn;
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
 
   
}
