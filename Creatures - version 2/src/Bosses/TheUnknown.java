package Bosses;
public class TheUnknown extends Boss{

    public TheUnknown(){

        //Main Boss details.    
        name = "The Unknown";
        HP = 1000; 
        minAttack = 12;
        maxAttack = 20;

        //Boss Item Drops.
        commonDrop = "Thief's Ring - (Type '21' to pick up: Or '0' to leave).";
        rareDrop = "Irrilian Staf - (Type '22' to pick up: Or '0' to leave).";
        legendaryDrop = "Olko's Twin Daggers - (Type '23' to pick up: Or '0' to leave).";

        //Boss Attacks.
        attackOne = "Misty Dropkick";
        attackTwo = "Shadow Blade Frenzy";
        specialAttack = "Soul Possession";

        DialogueOne = "\n" + "In the shadows, I am the embodiment of terror. Witness the eclipse of hope as I unleash my malevolent fury." + "\n";
        DialogueTwo = "\n" + "Submit to the void, for I am its master. In my wake, only despair and ruin shall remain." + "\n";
        DialogueThree = "\n" + "From the depths of darkness, I emerge, wielding shadows as my weapon. Surrender to oblivion or face eternal torment." + "\n";
    }


    //The Unknowns Special Ability - Heals and Generates a double attack. 
    //To be called recurringly. 
    public double specialAzzajiBless(){
        double healthIncrement = 2;
        healthIncrement++;
        System.out.println("Azzaji's Shadow Blessing.");
        System.out.println("It's health has Increased by: " + healthIncrement + "\n");

        return healthIncrement;
    }

        /*  Example of how to call in the middle of an attack.

    if (Hp < 70){
        Hp += en1.specialHealthRegen();

        System.out.println("Double Attack:");
                    Hp2 -= en1.attack();
    }
    Note: double attack too much? Is there a better way to do it? 
    */      
}
