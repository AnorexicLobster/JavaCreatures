package Regular_Enemies;

public class Dragon extends Monster{

    public Dragon(){

        // Main Creature Details.
        race = "Dragon";

        HP = 1000;
        minAttack = 8;
        maxAttack = 12;

        //Elite Names.
        bossName1 = "Ertali the Sky Empress";
        bossName2 = "Xudoir the Damned";
        bossName3 = "Ormioryt the Eternal";

        //Item Drops.
        commonDrop = "Dragon Scale Gloves - (Type '11' to pick up: Or '0' to leave).";
        rareDrop = "Dragon Tooth Club - (Type '12' to pick up: Or '0' to leave)."; 
        legendaryDrop = "Quelii's Elven Bow - (Type '13' to pick up: Or '0' to leave).";

         //Attack Names.
        attackOne = "Arial Assault"; 
        attackTwo = "Fire Barrage";
        specialAttack = "Infernal Storm"; 

        //Dialogue Lines.
        DialogueOne = "\n" + "Once majestic witness our sorrowful flight! With heavy hearts, we unleash our flames, mourning our fallen kin!" + "\n";
        DialogueTwo = "\n" + "Darkness descends as I unleash my wrath. Let the flames of chaos consume all who dare challenge my dominion." + "\n";
        DialogueThree = "\n" + "From the shadows of time, I emerge, a harbinger of doom. Tremble, mortals, as I unleash chaos upon you!" + "\n";
    }      
}
