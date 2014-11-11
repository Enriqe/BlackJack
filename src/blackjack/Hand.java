package blackjack;

public class Hand {
    
	Card[] cards = new Card [10]; //arreglo dinamico para agregar cartas con cada "hit"
    int cartas=0;
    int suma = 0;
    
    public Hand() {
    	Card carta = new Card();
    	carta.setRank(1);
    	carta.setSuit("Diamond");
    	cards[0] = carta;
    }
    
	public void addCard(Card cardDrawn) {
		cards[cartas] = cardDrawn;
		cartas++;
	}
	
	public int getSum() {
		suma = 0;
		for(int i = 0; i < cartas; i++) {
			suma += cards[i].getRank();
		}
		return suma;
	}
	
	public void show() {
		for(int i = 0; i < this.cards.length; i++){
        	System.out.println(this.cards[i].getSuit() + " " + this.cards[i].getRank());
        }
	}

}
