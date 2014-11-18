package blackjack;

import java.util.*;

public class Main {
	public static Deck deck;
    public static Player player, dealer;
    public static int recorrido = 0;
    
    /*
     * El metodo menu es para desplegar las opciones disponibles para el 
     * usuario que debe de hacer para llevar acabo su juego
     * 
     */
    private static void menu(){
    	System.out.println("What would you like to do now?");
    	System.out.println("Hit? (1)");
        System.out.println("Stay? (2)");
        System.out.println("Quit? (3)");
        System.out.println("New Game? (4)");
    }
	
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i; // user input for the game
        
        do {
        	recorrido = 0;
        	player = new Player();
        	dealer = new Player();
        	deck = new Deck();
        	Game Juego = new Game(player, dealer, recorrido);
            System.out.println("BlackJack!");
            Juego.deal();
            
            System.out.println("What is your name?");
            String s = in.next();
            player.setName(s);
            
            System.out.println(player.getName() + " it's your turn.");
            
            //System.out.println("Your hand: ");
            //for(int i = 0; i < player.hand.cards.length; i++){
            	//System.out.println(player.hand.cards[i].getSuit() + "  "+ player.hand.cards[i].getRank());
            //}
            
            do {
            	System.out.println("Your hand: ");
                player.hand.show();
                System.out.println("\nYour score: " + player.getScore());
                if(player.getScore() > 21){
                	System.out.println("You Lose\n");
                	System.out.println("New Game? (4)");
                	System.out.println("Quit? (3)");
                	i = in.nextInt();
                }
                else {
                	menu();
                    i = in.nextInt();
                    
                    if(i == 1){
            			if(player.turn){
            				Juego.hit();
            				/*player.turn = !player.turn;
            				dealer.turn = !dealer.turn;*/
            			}else{
            				Juego.hit();
            				player.turn = !player.turn;
            				dealer.turn = !dealer.turn;
            			}
            		}
                    else if(i == 2){
                        Juego.stay();
                        System.out.println("New Game? (4)");
                    	System.out.println("Quit? (3)");
                    	i = in.nextInt();
                    }
                    else if(i == 3){
                        System.out.println("Ended Game");
                        System.exit(0);
                    }
                    else if(i == 4){
                    	System.out.println("Starting New Game");
                    }
                }
            } while((player.turn || player.getScore() <= 21) && i != 2 && i != 3 && i !=4);
        }while(i != 3);
        System.out.println("Game Ended");
        
         in.close();
    }
    
}