package blackjack;


public class Player {

	public boolean turn;
	public String name;
	public Hand hand;
	public int score;
	
	public Player(String name){
		this.name = name;
		this.hand = makeHand();
		score = 0;
	}
	
	public Hand hit(){
		hand.addCard();
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
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
