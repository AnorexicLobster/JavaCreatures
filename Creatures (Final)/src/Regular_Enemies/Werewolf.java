package Regular_Enemies;

public class Werewolf extends Monster{

    public Werewolf(){

        //Main Creature Details.
        race = "Werewolf";
        
        HP = 65;
        minAttack = 9;
        maxAttack = 14;
        movementSpeed = 25;

        //Elite Names.
        bossName1 = "Roffe the Damned";
        bossName2 = "Ulfr";
        bossName3 = "Goro";

        //Item Drops.
        commonDrop = "Wolf-Skull Mace - (Type '5' to pick up: Or '0' to leave).";
        rareDrop = "Wolf Pelt Armour - (Type '6' to pick up: Or '0' to leave)."; 
        legendaryDrop = "Ophelia's Claw Rapier - (Type '7' to pick up: Or '0' to leave).";

        //Attack Names.
        attackOne = "Savage Slash"; 
        attackTwo = "Claw Whirwind";
        specialAttack = "Feral Charge"; 

        //Dialogue Lines.
        DialogueOne = "\n" + "Tonight, as we Wander the Shadows, our Claws shall slash thee. And our fangs shall rip thee apart." + "\n";
        DialogueTwo = "\n" + "Beneath the Moon's, our blessed Goddess' eye, we shall unleash our Primal Fury." + "\n";
        DialogueThree = "\n" + "Our howls will echo in the Shadows as we tear through thee." + "\n";
    }
}
