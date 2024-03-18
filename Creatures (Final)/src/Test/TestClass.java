package Test;
import java.util.*;
import Regular_Enemies.*;
import Bosses.*;

public class TestClass{

    
    public static void main(String[] args) {

        PlayerTest pl1 = new PlayerTest();

        Dragon en1 = new Dragon();
        en1.creatureForm();
        System.out.println(en1.encounterMessage());


        int replay; 
        double enemyHP = en1.getHP();
        double playerHP = pl1.getHP(); 

        do{ 
            Scanner in = new Scanner(System.in);

            int diceRoll = (int)(Math.random()*6)+1;
            int diceRollTwo = (int)(Math.random()*6)+1;
            System.out.println("The Enemy Rolled: " + diceRoll); 
            System.out.println("The Player Rolled: " + diceRollTwo + "\n");

    
            if (diceRoll > diceRollTwo){
                if (enemyHP > 70){
                    playerHP -= en1.attack();
                    System.out.println("Player HP: " + playerHP);
                    System.out.println(enemyHP);
                } else {
                    enemyHP += en1.specialHealthRegen();
                    System.out.println("Player HP: " + playerHP);
                    System.out.println(enemyHP);
                }
        
            } else if (diceRollTwo > diceRoll) {
                if (enemyHP < 70){
                    playerHP -= en1.specialCounterAssault();
                    System.out.println("Player HP: " + playerHP);

                    enemyHP -= pl1.attack();
                    System.out.println("Enemy HP: " + enemyHP);

                } else {
                    enemyHP -= pl1.attack();
                    System.out.println("Enemy HP: " + enemyHP);
                }
            }
            
            if (enemyHP <= 0){
                System.out.println(en1.death());
            } 
         
            do{
                System.out.println("Type '1'to Roll Again or '0' to Quit.");
                replay = in.nextInt(); 

                if (replay !=0 && replay !=1){
                    System.out.println("Invalid Input.");
                }

            } while (replay !=0 && replay !=1);
        } while (enemyHP > 0 && playerHP > 0);


        System.out.println("GAME OVER."); 
    }    
}