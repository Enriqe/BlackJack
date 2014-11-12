package blackjack;

public class Hand extends Game{
    
	Card[] cards = new Card [10]; //arreglo dinamico para agregar cartas con cada "hit"
    int cartas=0;
    int suma = 0;
    int size = 0;
    
    public Hand() {
//    	Card carta = new Card();
//    	carta.setRank(1);
//    	carta.setSuit("Diamond");
//    	cards[0] = carta;
//    	size = 1;
    	size = 0;
    }
    
	public void addCard(Card cardDrawn) {
		cards[cartas] = cardDrawn;
		cartas++;
		size++;
	}
	
	public int getSum() {
		suma = 0;
		for(int i = 0; i < cartas; i++) {
			suma += cards[i].getRank();
		}
		return suma;
	}
	
	public void show() {
		for(int i = 0; i < this.size; i++){
        	if(this.cards[i].getSuit() != "")
			System.out.println(this.cards[i].getSuit() + " " + this.cards[i].getRank());
        }
	}

}
