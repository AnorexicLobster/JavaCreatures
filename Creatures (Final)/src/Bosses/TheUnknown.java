package Bosses;
public class TheUnknown extends Boss{

    public TheUnknown(){

        //Main Boss details.    
        name = "The Unknown";
        HP = 400; 
        minAttack = 12;
        maxAttack = 20;
        movementSpeed = 30;

        //Boss Item Drops.
        commonDrop = "Thief's Ring - (Type '21' to pick up: Or '0' to leave).";
        rareDrop = "Irrilian Staf - (Type '22' to pick up: Or '0' to leave).";
        legendaryDrop = "Olko's Twin Daggers - (Type '23' to pick up: Or '0' to leave).";

        //Boss Attacks.
        attackOne = "Misty Dropkick";
        attackTwo = "Shadow Blade Frenzy";
        specialAttack = "Soul Possession";

        //Dialogue Lines.
        DialogueOne = "\n" + "In the shadows, I am the embodiment of terror. Witness the eclipse of hope as I unleash my malevolent fury." + "\n";
        DialogueTwo = "\n" + "Submit to the void, for I am its master. In my wake, only despair and ruin shall remain." + "\n";
        DialogueThree = "\n" + "From the depths of darkness, I emerge, wielding shadows as my weapon. Surrender to oblivion or face eternal torment." + "\n";
    }


    //The Unknown's Special Ability 1 - Heal. 
    //To be called recurringly. 
    public double specialHealthRegen(){
        double healthIncrement = 2;
        healthIncrement++;
        System.out.println("The Unknown used Azzaji's Shadow Blessing.");
        System.out.println("It's health has Increased by: " + healthIncrement + "\n");

        return healthIncrement;
    }

    
    //The Unknown's Special Ability 2 - Double Attack.
    public double specialDoubleAttack(){
        double attackOne = attack();
        double attackTwo = attack();

        double fullAttack = attackOne + attackTwo;

        return fullAttack;
    }
}
