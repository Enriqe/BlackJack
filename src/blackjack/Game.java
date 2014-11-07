package blackjack;

public class Game {
    Deck deck;
    Player player, dealer;
    
    public Game(Deck d, Player p, Player deal){
    	deck = d;
    	player = p;
    	dealer = deal;
    }
    
    Deck deck(){
    	return null;
    }
    
    Player player(String nombre) {
		return null;
	}


    void deal() {
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
