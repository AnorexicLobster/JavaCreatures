package Regular_Enemies;

public class Orc extends Monster{

    public Orc(){

        //Main Creature Details.
        race = "Orc";
        
        HP = 70;
        minAttack = 6;
        maxAttack = 12;
        movementSpeed = 20;

        //Elite Names.
        bossName1 = "Orzanug";
        bossName2 = "Warchief Garullak";
        bossName3 = "Ferazul the Mad Shaman";

        //Item Drops.
        commonDrop = "Rusty Sword - (Type '2' to pick up: Or '0' to leave).";
        rareDrop = "Sturdy Iron Shield - (Type '9' to pick up: Or '0' to leave)."; 
        legendaryDrop = "Byzular's Spiked Club - (Type '10' to pick up: Or '0' to leave).";

        //Attack Names.
        attackOne = "Regular Strike"; 
        attackTwo = "Ferocious Strike";
        specialAttack = "Primal Fury"; 

        //Dialogue Lines.
        DialogueOne = "\n" + "With axes high and war cries loud, I shall paint the battlefield red with the blood, in the name of Byzular!." + "\n";
        DialogueTwo = "\n" + "Through chaos and carnage. The screams of my foes will fuel my relentless advance to victory!" + "\n";
        DialogueThree = "\n" + "With death in my eyes and fury in our hearts, I shall crush you and claim victory!" + "\n";
    }   
}
