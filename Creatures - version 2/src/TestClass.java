import java.util.*;
import Regular_Enemies.*;
import Bosses.*;

public class TestClass{

    

    public static void main(String[] args) {

        Orc or2 = new Orc();
        or2.creatureForm();

        Dragon en1 = new Dragon();
        en1.creatureForm();
        System.out.println(en1.encounterMessage());


        int replay; 
        double Hp = en1.getHP();
        double Hp2 = or2.getHP(); 

      
        do{

              
            Scanner in = new Scanner(System.in);

           

            int diceRoll = (int)(Math.random()*6)+1;
            int diceRollTwo = (int)(Math.random()*6)+1;
             System.out.println("The Enemy Rolled: " + diceRoll); 
             System.out.println("The Player Rolled: " + diceRollTwo);

    
            if (diceRoll > diceRollTwo){
                Hp2 -= en1.attack();
                System.out.println("Player HP: " + Hp2);
                  
            } else if (diceRollTwo > diceRoll) {
                Hp -= or2.attack();
                System.out.println("Enemy HP: " + Hp);
            }  
            
            if (Hp <= 0){
                System.out.println(en1.death());
            } 
         
            do{
                    System.out.println("Type '1'to Roll Again or '0' to Quit.");
                    replay = in.nextInt(); 

                    if (replay !=0 && replay !=1){
                    System.out.println("Invalid Input.");
                    }

                } while (replay !=0 && replay !=1);
            } while (Hp > 0 && Hp2 > 0);


            System.out.println("GAME OVER."); 
}    
}
        


