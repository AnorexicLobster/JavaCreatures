package Bosses;
public class Boss{

    // Main Boss Details. 
    protected String name;
    protected double HP; 
    protected double minAttack;
    protected double maxAttack;

    //Item Drops. 
    protected String commonDrop;
    protected String rareDrop;
    protected String legendaryDrop;
    protected int randomGoldDrop;

    //Fields for attack cycle. Both names and attack range.
    protected String attackOne;
    protected String attackTwo;
    protected String specialAttack;
    protected int attackRange;

    //Fields for Dialogue.
    protected int randomDialogueGen;
    protected String DialogueOne;
    protected String DialogueTwo;
    protected String DialogueThree;


    //Getters. 
    public String getName(){
        return name;
    }

    public double getHP(){
        return HP;
    }

    public double getMinAttack(){
        return minAttack;
    }

    public double getMaxAttack(){
        return maxAttack;
    }


    //Setters. 
    public double setMinAttack(double aMinAttack){
        minAttack = aMinAttack;
        return aMinAttack;
    }

    public double setMaxAttack(double aMaxAttack){
        minAttack = aMaxAttack;
        return aMaxAttack;
    }



    //Other Methods: 

    // Encounter Message - will display Name, HP and Attack Power.
    public String encounterMessage(){
        String encounter = "";
        encounter += "You've encountered: " + getName() + "\n";
        encounter += "They have: " + getHP() + " HP." + "\n";
        encounter += "Minimum Attack Power: " + getMinAttack() + "\n"; 
        encounter += "Maximum Attack Power: " + getMaxAttack() + "\n"; 

        dialogue();

        return encounter;
    }

    
    //Method for generating Random Dialogue.
    public void dialogue(){
        randomDialogueGen = (int)(Math.random()*3)+1;

        if (randomDialogueGen == 1){
            System.out.println(DialogueOne);

        } else if (randomDialogueGen == 2){
            System.out.println(DialogueTwo);

        } else {
            System.out.println(DialogueThree);
        }    
    }


     // Method Responisble for randomly determining item drop. 
    public String death(){
        String itemDrop = "";
         //Dice Roll for random Item Drop after enemy Death.
        int randomItemDrop = (int)(Math.random()*100)+1;
      
        if (randomItemDrop <= 65) {
            randomGoldDrop = (int)(Math.random()*30)+1;
            itemDrop = "You've Killed the " + getName() + "\n" + 
                    " Items dropped: " + commonDrop + " (Common Item) and " + randomGoldDrop + " Gold";          

        } else  if (randomItemDrop > 65 && randomItemDrop <= 90){
            randomGoldDrop = (int)(Math.random()*45)+1;
            itemDrop = "You've Killed the " + getName() + "\n" + 
                                " Items dropped: " + rareDrop + " (Rare Item) and " + randomGoldDrop + " Gold";            
        
        } else if (randomItemDrop > 90) {
            randomGoldDrop = (int)(Math.random()*60)+1;
            itemDrop = "You've Killed " + getName() + "\n" + 
                                " Items dropped: " + legendaryDrop + " (Legendary Item) and " + randomGoldDrop + " Gold";  
        }

        return itemDrop;
    }   
    

    // Method for Different Attacks. 
    public double attack(){
        //Dice roll for generating a random attack.
        int randomAttackGen = (int)(Math.random()*10)+1;

        //Block for Regular Attack.
        if (randomAttackGen > 1 && randomAttackGen < 6) {
            attackRange = (int)(Math.random()*(this.minAttack-this.maxAttack+1)+this.minAttack);
            System.out.println("Enemy used: " + attackOne + "\n" 
                                + " They dealt: " + attackRange + " Damage." + "\n"); 
 
        //Block for Heavy Attack.  
        } else if (randomAttackGen > 5 && randomAttackGen < 10) {
            attackRange = (int)(Math.random()*(this.minAttack-this.maxAttack+1)+this.minAttack+2);
            System.out.println("Enemy used: " + attackTwo + "\n" + 
                                " They dealt: " + attackRange + " Damage." + "\n");
           
        //Block for Special Attack.
        } else if (randomAttackGen == 10) {
            attackRange = (int)(Math.random()*(this.minAttack-this.maxAttack+1)+this.minAttack+3);
            System.out.println("Enemy used: " + specialAttack + "\n" +
                                 "They dealt: " + attackRange + " Damage." + "\n");              
        }   

        return attackRange;     
    }




}