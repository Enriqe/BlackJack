package blackjack;

public class Hand{
    
	Card[] cards = new Card [10]; //arreglo dinamico para agregar cartas con cada "hit"
    int cartas=0;
    int suma = 0;
    int size = 0;
    
    public Hand() {
    	size = 0;
    }
    /* 
     * El metodo addCard agrega una carta a la clase mano
     * 
     */
    
	public void addCard(Card cardDrawn) {
		cards[cartas] = cardDrawn;
		cartas++;
		size++;
	}
	
	/*
	 * El metodo getSum regresa la suma de la mano que tiene actualmente
	 * el jugador
	 */
	
	public int getSum() {
		suma = 0;
		for(int i = 0; i < cartas; i++) {
			suma += cards[i].getRank();
		}
		return suma;
	}
	
	/*
	 * El metodo show, despliega la mano que tiene
	 * actualmente el jugador
	 * 
	 */
	
	public void show() {
		for(int i = 0; i < this.size; i++){
        	if(this.cards[i].getSuit() != "")
			System.out.println(this.cards[i].getSuit() + " " + this.cards[i].getRank());
        }
	}

}
