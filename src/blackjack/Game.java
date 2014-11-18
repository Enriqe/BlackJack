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

	/*
	 * El metodo de hit es cuando un jugador sea Dealer/Jugador desea otra carta
	 * se le agrega una tercera o hasta cuarta carta a la mano por el metodo de 
	 * addCard
	 */
	public void hit(){
		if(player.turn){
			player.hand.addCard(deck.deckCards[recorrido]);
			recorrido++;

		}
		else{
			dealer.hand.addCard(deck.deckCards[recorrido]);
			recorrido++;

		}
	}
	
	/*
	  El metodo stay es cuando el jugador 
	  desea retirarse de seguir recibiendo cartas, al hacer esto
	  es el turno del dealer el cual ejecuta las mismas movidas que el jugador 
	  se realiza el calculo de quien ganara la partida.
	 */

	public void stay() {
		player.turn = !player.turn;
		dealer.turn = !dealer.turn;
		while(dealer.getScore() < player.getScore() && dealer.getScore() <= 21){
			this.hit();
		}
		if(player.getScore() == dealer.getScore()){
			System.out.println("Your Score: " + player.getScore());
			System.out.println("Dealer Score: " + dealer.getScore());
			System.out.println("You Lose!");
		}

		if(player.getScore() > dealer.getScore() && (player.getScore() <=21)){
			System.out.println("Your Score: " + player.getScore());
			System.out.println("Dealer Score: " + dealer.getScore());
			System.out.println("You Win!");
		}
		else {
			if(dealer.getScore() > 21){
				System.out.println("Your Score: " + player.getScore());
				System.out.println("Dealer Score: " + dealer.getScore());
				System.out.println("You Win!");
			}
			else{
				System.out.println("Your Score: " + player.getScore());
				System.out.println("Dealer Score: " + dealer.getScore());
				System.out.println("You Lose!");

			}
		}
		/*
    	if(player.turn){
            player.turn = !player.turn;
            dealer.turn = !dealer.turn;
            while(dealer.getScore() < player.getScore() && dealer.getScore() <= 21){
                this.hit();
            }
            //this.stay();
        }
        else {
            //compare scores declare winner
        	if(player.getScore() > dealer.getScore() && (player.getScore() <=21)){
        		System.out.println("Your Score: " + player.getScore());
        		System.out.println("Dealer Score: " + dealer.getScore());
        		System.out.println("You Win!");
        	}
        	else {
        		System.out.println("Your Score: " + player.getScore());
        		System.out.println("Dealer Score: " + dealer.getScore());
        		System.out.println("You Lose!");
        	}
        }
		 */
	}
	
	/*
	 * El metodo de Deal se usa cuando se inicia el juego, el jugador empieza por escoger que 
	 * desea hacer y es su turno, el metodo de addCard le agrega una mano a cada jugador 
	 * dandoles dos cartas e indicando su valor
	 */

	public void deal() {
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
