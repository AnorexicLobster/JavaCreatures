package Bosses;

public class Bramzark extends Boss{

    public Bramzark(){

        //Main Boss details. 
        name = "Bramzark the Despoiler";
        HP = 1500; 
        minAttack = 15;
        maxAttack = 25;

         //Boss Item Drops.
        commonDrop = "Oolak's Ring - (Type '18' to pick up: Or '0' to leave).";
        rareDrop = "Azzak's Demon Staff - (Type '19' to pick up: Or '0' to leave).";
        legendaryDrop = "Demon Lord Armour - (Type '20' to pick up: Or '0' to leave).";

        //Boss Attacks.
        attackOne = "Demon Claw Slash";
        attackTwo = "Metrorite Shower";
        specialAttack = "Ancient Demonic Karate Chop";

        DialogueOne = "\n" + "From the shadows of time, I emerge, a harbinger of doom. Tremble, mortals, as I unleash chaos upon thee!" + "\n";
        DialogueTwo = "\n" + "Behold my darkness, for it shall consume all. Tremble, fools, before my relentless might and eternal reign of terror." + "\n";
        DialogueThree = "\n" + "In the abyss of my power, all shall perish. Witness the darkness's embrace as I crush hope beneath my heel." + "\n";

        
    }


    //Bramzark's special Boss ability.
    // Increases Health and Attack Power.
    public double specialBerserkRage(){
        System.out.println("Bramzark Used Berserker's Rage");
        double upgrade = 100;
        setMinAttack(18);
        setMaxAttack(22);
        System.out.println("His Health has Increased by: " + upgrade + "\n" + 
                        "And his Attack Power has Increased by: 10." );

        return upgrade;
    }

    /*  Example of how to call in the middle of an attack.

    if (Hp < 40 && abilityUsed == false){
        Hp += en1.specialBerserkRage();
        abilityUsed = true;
    }
    Note: a boolean variable will need to be created outside the attack loop, 
            otherwise the ability will be repeatedly called. */  
}
