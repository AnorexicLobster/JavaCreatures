package Test;
import Regular_Enemies.Monster;

public class PlayerTest extends Monster{

    public PlayerTest(){
        
        //Main Creature Details.
        race = "Human";
        
        HP = 3000;
        minAttack = 15;
        maxAttack = 25;
 
        //Attack Names.
        attackOne = "Basic Attack"; 
        attackTwo = "Heavy Attack";
        specialAttack = "Special Attack"; 
    }
}