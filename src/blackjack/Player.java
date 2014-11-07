package blackjack;


public class Player {

	public boolean turn;
	public String name;
	public Hand hand;
	
	public Player(String name){
		this.name = name;
		this.hand = makeHand();
	}
	
	public Hand makeHand(){
		return new Hand();
	}

	public boolean isTurn() {
		return turn;
	}

	public void setTurn(boolean turn) {
		this.turn = turn;
	}
	
	
}
