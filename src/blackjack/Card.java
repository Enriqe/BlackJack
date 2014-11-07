package blackjack;

public class Card {
    String suit;
    int rank;
    boolean isUsed;
    
    public Card(){
    	suit = "";
    	rank = 0;
    	isUsed = false;
    }
    
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
}
