package blackjack;

public class Game {
    Deck deck;
    Player player, dealer;
    int score = 0;
    
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


