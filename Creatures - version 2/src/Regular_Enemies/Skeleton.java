package Regular_Enemies;

public class Skeleton extends Monster{

    public Skeleton(){

        // Main Creature Details.
        race = "Skeleton";

        HP = 100;
        minAttack = 3;
        maxAttack = 6;

        //Elite Names.
        bossName1 = "Vikein the Mad Bard";
        bossName2 = "Zakin, Lord of the Undead";
        bossName3 = "Vegalok";

        //Item Drops.
        commonDrop = "Bonewalker Boots - (Type '8' to pick up: Or '0' to leave).";
        rareDrop = "Necromancer's Staff - (Type '3' to pick up: Or '0' to leave)."; 
        legendaryDrop = "Nostro's Skeletal Axe - (Type '4' to pick up: Or '0' to leave).";

         //Attack Names.
        attackOne = "Boney Slap"; 
        attackTwo = "Projectile Head-Butt";
        specialAttack = "Rattling Undead Dance";   
        
        //Dialogue Lines.
        DialogueOne = "\n" + "Rattle your bones and clatter your teeth! I'm bone-tired of losing! Let's show 'em our funny bone-crushing moves!" + "\n";
        DialogueTwo = "\n" + "Attention Fleshbags! I'll be cracking jokes and bones in equal measure! Let's boogie!" + "\n";
        DialogueThree = "\n" + "Outta the Road! Or I'll serve up some bone-shaking jokes and bone-crushing moves! Bone-appétit!" + "\n";
    }   
}
