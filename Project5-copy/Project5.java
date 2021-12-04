import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;

/**
 * This is the main file of the project most of the code will be run here
 * The other classes only will serve hold most of my methods
 * This class will contain many if statements and locators for arrays
 * if need be.
 * Nicholas Williams
 * 1.0 trail of making a game using input and outputs.
 */
public class Project5
{
    public static void main(String[] args) {
        ArrayList<Folkemon> folks = new ArrayList<Folkemon>();
        addFolkemonToList(folks);
        Scanner in = new Scanner(System.in);
        //printList(folks);
        
        /*
         * Introduction Code, picking Folkemon, name and intro story.
         */
        int i = 1;
        int p = 0;
        System.out.print("Please enter your characters name: ");
        String name = in.nextLine();
        System.out.print("Welcome " + name);
        System.out.print(" you're about to begin your adventure! Please enter one, two or three to determine your fighter! ");
        String choice = in.nextLine();
        if (choice.equals("one")) {
            System.out.println("You picked the fire Folkemon! ");
            p = 0;
        }
        else if (choice.equals("two")) {
            System.out.println("You picked the water Folkemon! ");
            p = 1;
        }
        else if (choice.equals("three")) {
            System.out.println("You picked the grass Folkemon! ");
            p = 2;
        }
        else {
            System.out.println("Invalid choice, defaulted to choice one.");
            System.out.println("You picked the fire Folkemon! ");
            p = 0;
        }
        Folkemon mine = folks.get(p);
        Folkemon.Types t = mine.getTypes();
        int h = mine.getHealth();
        System.out.println(name + " wakes up in their home with a Folkemon watching over them. Not sure how they made it home last night, " + name + " slowly gets up and regards");
        System.out.println("their newfound friend, vaguely remembering how the small creature had saved your life the night before. ");
        System.out.println("It then begins to ask you if you would help him. He explains of the recent attacks to his village and begs you to come fight with him. ");
        System.out.println("Decideing to help the creature, " + name + " leaves his home determined to repay this debt to the Folkemon who saved his life! ");
        int c = 0;
        int eH = 25;
        
        
        
        /*
         * Begin pathing with the first fork, loops for fights
         */
        System.out.println("\nReaching the first fork in their path, " + name + " must deciede whether to turn left or right. (please enter L or R)");
        choice = in.nextLine();
        if (choice.equals("L")) {
        System.out.println(name + " turns left with their Folkemon following close behind. The pair soon find a potion, which will heal the Folkemon, hopefully they won't need it...");
        System.out.println("\nThey come across a wild grass Folkemon!!");
        eH = 20;            
        c = 1;
            while (i > 0) { // this is the loop with the differential,player favor
            System.out.println("Your " + t + " Folkemon has " + h + " health!");
            System.out.println("Enemy has " + eH + " hp!");
            System.out.println("\nWill you basic attack(enter one), elemental attack(enter two), or heal(enter three)? ");
            String battleC = in.nextLine();
            if (battleC.equals("one")) {
                eH = eH - 10;
                System.out.println("you attacked for 10 damage!");
            }
            else if (battleC.equals("two")) { //if we have a type advantage
                eH = eH - 15;
                System.out.println("you attacked for 15 damage!");
            }
            else if (battleC.equals("three")) {
                h = h + 5;
                System.out.println("you gained 5 health!");
            }
            else {eH = eH - 10;}    
            h = h - 5; //we will always assume they will elemential attack
            System.out.println("they attacked for 5 damage");
            if (h <= 0) {   
                i = 0;
                System.out.println("You blacked out... Game Over!");
                System.exit(0);
            }
            else if (eH <= 0) {
                System.out.println("The enemy fainted!");
                i = 0;
            }
        }
        }
        else if (choice.equals("R")) {
            System.out.println(name + " turns right with their Folkemon following close behind.");
            System.out.println("\nThey come across a wild water Folkemon!!");
            c = 2;
            eH = 15;
                
                while (i > 0) { // this is the loop with the differential,player favor
            System.out.println("Your " + t + " Folkemon has " + h + " health!");
            System.out.println("Enemy has " + eH + " hp!");
            System.out.println("\nWill you basic attack(enter one), elemental attack(enter two), or heal(enter three)? ");
            String battleC = in.nextLine();
            if (battleC.equals("one")) {
                eH = eH - 10;
                System.out.println("you attacked for 10 damage!");
            }
            else if (battleC.equals("two")) { //if we have a type advantage
                eH = eH - 5;
                System.out.println("you attacked for 5 damage!");
            }
            else if (battleC.equals("three")) {
                h = h + 5;
                System.out.println("you gained 5 health!");
            }
            else {eH = eH - 10;}    
            h = h - 15; //we will always assume they will elemential attack
            System.out.println("they attacked for 15 damage");
            if (h <= 0) {   
                i = 0;
                System.out.println("You blacked out... Game Over!");
                System.exit(0);
            }
            else if (eH <= 0) {
                System.out.println("The enemy fainted!");
                i = 0;
            }
            }
        }
        else {
            System.out.println("Your Folkemon takes the led and turns right.");
            System.out.println(name + " turns right with their Folkemon following close behind.");
            System.out.println("\nThey come across a wild water Folkemon!!");
            c = 2;
            eH = 15;
                
                while (i > 0) { // this is the loop with the differential,player favor
            System.out.println("Your " + t + " Folkemon has " + h + " health!");
            System.out.println("Enemy has " + eH + " hp!");
            System.out.println("\nWill you basic attack(enter one), elemental attack(enter two), or heal(enter three)? ");
            String battleC = in.nextLine();
            if (battleC.equals("one")) {
                eH = eH - 10;
                System.out.println("you attacked for 10 damage!");
            }
            else if (battleC.equals("two")) { //if we have a type advantage
                eH = eH - 5;
                System.out.println("you attacked for 5 damage!");
            }
            else if (battleC.equals("three")) {
                h = h + 5;
                System.out.println("you gained 5 health!");
            }
            else {eH = eH - 10;}    
            h = h - 15; //we will always assume they will elemential attack
            System.out.println("they attacked for 15 damage");
            if (h <= 0) {   
                i = 0;
                System.out.println("You blacked out... Game Over!");
                System.exit(0);
            }
            else if (eH <= 0) {
                System.out.println("The enemy fainted!");
                i = 0;
            }
            }
        }
        
        i = 1;
        
        /*
         * To see if they will heal
         */
        System.out.println("\nYour Folkemon survived with " + h + " health!");
        if (c == 1) {   //Heal method
            System.out.println("Your Folkemon drank a potion!");
            //String heal = in.nextLine();
            //if (heal == "yes") {
            h = 40;
            c = 0;
            System.out.println("They now have 40 hp!");
        }
        
        
        /*
         * Begin second path
         */
        System.out.println("\nReaching the second fork in their path, " + name + " must deciede whether to turn left or right. (please enter L or R)");
        choice = in.nextLine();
        if (choice.equals("L")) {
            //battle against grass man
            eH = 30;
            System.out.println("\nThey come across a wild fire Folkemon!!");
            while (i > 0) { // this is the loop with the differential,player favor
            System.out.println("Your " + t + " Folkemon has " + h + " health!");
            System.out.println("Enemy has " + eH + " hp!");
            System.out.println("\nWill you basic attack(enter one), elemental attack(enter two), or heal(enter three)? ");
            String battleC = in.nextLine();
            if (battleC.equals("one")) {
                eH = eH - 10;
                System.out.println("you attacked for 10 damage!");
            }
            else if (battleC.equals("two")) { //if we have a type advantage
                eH = eH - 10;
                System.out.println("you attacked for 10 damage!");
            }
            else if (battleC.equals("three")) {
                h = h + 5;
                System.out.println("you gained 5 health!");
            }
            else {eH = eH - 10;}
            
            h = h - 10; //we will always assume they will elemential attack
            System.out.println("they attacked for 10 damage");
            if (h <= 0) {   
                i = 0;
                System.out.println("You blacked out... Game Over!");
                System.exit(0);
            }
            else if (eH <= 0) {
                System.out.println("The enemy fainted!");
                i = 0;
            }
        }
        }
        else if (choice.equals("R")) {
            //gets stabbed by poison thorns loses 10 health
            System.out.println("As you walk right your Folkemon cries out in pain as it steps on a posion thorn in the path... he loses 10 health.");
            h = h - 10;
            if (h <= 0) {   
                //i = 0;
                System.out.println("You blacked out... Game Over!");
                System.exit(0);}
        }      
        else {
            //gets stabbed by poison thorns loses 15 health
            System.out.println("As you walk right your Folkemon cries out in pain as it steps on a posion thorn in the path... he loses 15 health.");
            h = h - 15;
            if (h <= 0) {   
                //i = 0;
                System.out.println("You blacked out... Game Over!");
                System.exit(0);}
        }
        
        i = 1;
        
        /*
         * End second, see if they will heal...
         */
        System.out.println("\nYour Folkemon survived with " + h + " health!");
        if (c == 1) {   //Heal method
            System.out.println("Your Folkemon drank a potion!");
            //String heal = in.nextLine();
            //if (heal == "yes") {
            h = 60;
            c = 0;
            System.out.println("They now have 60 hp!");
        }
        /*
         * begin final fork...
         */
        System.out.println("\n You reach the final fork...");
        System.out.println(name + " must deciede whether to turn left or right. (please enter L or R)");
        choice = in.nextLine();
        if (choice.equals("R")) {
        System.out.println("Upon going right, the pair find a few berries which the Folkemon eat... this raises his health by 30!");
        h = h + 30;
        }
        else if (choice.equals("L")) {
        System.out.println("Upon going left, the pair find a chest with two potions, the Folkemon drinks one right away, it healed him up to 60hp!");
        h = 60;
        c = 1;
        }
        else {
        System.out.println("Upon going right, the pair find a few berries which the Folkemon eat... this raises his health by 30!");
        h = h + 30;
        }
        System.out.println("\nYour Folkemon survived with " + h + " health!");
        
        /*
         * heal
         */
        if (c == 1) {   //Heal method
            System.out.println("Your Folkemon drank a potion!");
            //String heal = in.nextLine();
            //if (heal == "yes") {
            h = h + 40;
            c = 0;
            System.out.println("They now have "+ h +" hp!");
        }
        i = 1;
        System.out.println("\nAs the pair enter the clearing with the Folkemon's home village, they see a massive " + t + " robotic Folkemon...");
        System.out.println("\nIt's red eyes glares at the team as it turns to charge!!");
        eH = 70;
        int xyz = 1;
        while (i > 0) { // Final battle
            System.out.println("Your " + t + " Folkemon has " + h + " health!");
            System.out.println("Enemy has " + eH + " hp!");
            System.out.println("\nWill you basic attack(enter one), elemental attack(enter two), or heal(enter three)? ");
            String battleC = in.nextLine();
            if (battleC.equals("one")) {
                eH = eH - 10;
                System.out.println("you attacked for 10 damage!");
            }
            else if (battleC.equals("two")) { //if we have a type advantage
                eH = eH - 15;
                System.out.println("you attacked for 15 damage!");
            }
            else if (battleC.equals("three")) {
                h = h + 10;
                System.out.println("you gained 10 health!");
            }
            else {eH = eH - 10;}
            
            if (xyz == 1) {
            h= h-15;
            System.out.println("they attacked for 15 damage");
            xyz =0;
            }
            else {
            //h = h - 5; //we will always assume they will elemential attack
            System.out.println("The enemy charged and nearly missed your Folkemon!!");
            xyz = 1;}
            if (h <= 0) {   
                i = 0;
                System.out.println("You blacked out... Game Over!");
                System.exit(0);
            }
            else if (eH <= 0) {
                System.out.println("The enemy fainted!");
                i = 0;
            }
        }
        
        
        
        
        
        
        //final fight
        System.out.println("Congrats!! You won and saved the village!");
    }
    
    /*
     * Just in case I need to print every option
     */
    public static void printList(ArrayList<Folkemon> list) {
        for (Folkemon b : list) {
        b.printInfo();
        }
    }
    /*
     * This contains every option, this is also what I will pull data from.
     */
    public static void addFolkemonToList(ArrayList<Folkemon> list)
    {
        Folkemon firemans = new Folkemon("Firemans", Folkemon.Types.FIRE, 30);
        list.add(firemans);
        
        Folkemon watermans = new Folkemon("Watermans", Folkemon.Types.WATER, 35);
        list.add(watermans);
        
        Folkemon grassmans = new Folkemon("Grassmans", Folkemon.Types.GRASS, 25);
        list.add(grassmans);
    }
}