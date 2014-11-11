package blackjack;

import java.util.*;
 
public class Main {
	public Deck deck;
    public static Player player = new Player(), dealer = new Player();
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Game Juego = new Game();
        System.out.println("BlackJack!");
        Juego.deal();
        
        System.out.println("What is your name?");
        String s = in.next();
        player.setName(s);
        
        System.out.println(player.getName() + " it's your turn.");
        System.out.println("Your hand: " + player.getScore());
        
        System.out.println("Hit? (1)");
        System.out.println("Stay? (2)");
        System.out.println("Quit? (3)");
        
        int i = in.nextInt();
        
        if(i == 1){
            if(player.turn){
                //hit(true);
            }else{
                while(dealer.getScore() < player.getScore()){
                    //hit(true);
                    
                }
            }
        }
        else if(i == 2){
            //stay
            if(player.turn){
                player.turn = !player.turn;
                dealer.turn = !dealer.turn;
            }
            else {
                //compare scores declare winner
            }
            
        }
        else if(i == 3){
            System.out.println("Ended Game");
            System.exit(0);
        }
        
        System.out.println(i);
        System.out.println(s);
        
         in.close();
    
    }
}