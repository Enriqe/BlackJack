package blackjack;

public class Game {
    Deck deck;
    Player player, dealer;
    public int score = 0;
    
    public Game(Deck d, Player p, Player deal, int s){
    	deck = d;
    	player = p;
    	dealer = deal;
    	score = s;
    }
    
    Deck deck(){
    	return null;
    }
    
    Player player(String nombre) {
		return null;
	}
    
    void incrementScore() {
    	
	}


    void deal() {
        score = 0;
        deck.createDeck();
        deck.shuffleDeck();
        player.turn = true;
        player.name = "";
        dealer.name = "Dealer";
        dealer.turn = false;
        player.addCard();
        player.addCard();
        dealer.addCard();
        dealer.addCard();
    };
}
