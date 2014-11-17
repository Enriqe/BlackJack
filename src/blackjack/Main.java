package blackjack;

import java.util.*;

public class Main {
	public Deck deck;
    public static Player player = new Player(), dealer = new Player();
    public static int recorrido = 0;
    
    private static void menu(){
    	System.out.println("What would you like to do now?\n");
    	System.out.println("Hit? (1)");
        System.out.println("Stay? (2)");
        System.out.println("Quit? (3)");
    }
	
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
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
        
        int i; // user input for the game
        do {
        	System.out.println("Your hand: ");
            player.hand.show();
            System.out.println("\nYour score: " + player.getScore());
            menu();
            i = in.nextInt();
            
            if(i == 1){
    			if(player.turn){
    				Juego.hit();
    				player.turn = !player.turn;
    				dealer.turn = !dealer.turn;
    			}else{
    				Juego.hit();
    				player.turn = !player.turn;
    				dealer.turn = !dealer.turn;
    			}
    		}
            else if(i == 2){
                Juego.stay();
            }
            else if(i == 3){
                System.out.println("Ended Game");
                System.exit(0);
            }
        } while((player.turn || player.getScore() <= 21) && i != 2 && i != 3);
        
        Juego.stay();
        
         in.close();
    }
    
}