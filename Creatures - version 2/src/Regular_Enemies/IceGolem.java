package Regular_Enemies;

public class IceGolem extends Monster{

    public IceGolem(){

        // Main Creature Details.
        HP = 100;
        minAttack = 6;
        maxAttack = 12;

        //Elite Names.
        bossName1 = "Itariel the Frozen Demon";
        bossName2 = "Nedia";
        bossName3 = "Vaaldra the Ice Princess";

        //Item Drops.
        commonDrop = "Ice Hammer - (Type '15' to pick up: Or '0' to leave).";
        rareDrop = "Frozen Ring - (Type '16' to pick up: Or '0' to leave)."; 
        legendaryDrop = "Ijik's Ice Crown - (Type '17' to pick up: Or '0' to leave).";

        //Attack Names.
        attackOne = "Ice Blast"; 
        attackTwo = "Frozen Fury";
        specialAttack = "Ijik's Avalanche";   

        //Dialogue Lines.
        DialogueOne = "\n" + "With Frozen Fists I will shatter your dreams and freeze your hopes!" + "\n";
        DialogueTwo = "\n" + "From the depths of glaciers, you awaken me, cold and relentless. With icy power, I will break you!" + "\n";
        DialogueThree = "\n" + "Behold the embodiment of Ijik's wrath! With unyielding force, I shall freeze the battlefield and overcome all who oppose me." + "\n";
    }
    
}
