import java.util.ArrayList;

/**
 * Pam contains most of my methods, this is where I will add characters,
 * call info about them, set info, and this will change(level up) as 
 * the game goes on.
 * This will also contain the enum types 
 *
 * Nicholas Williams
 * P
 */
public class Folkemon
{
    public enum Types { FIRE, WATER, GRASS }
    private String name;
    private Types type;
    private int health;
    private ArrayList<Folkemon> characters;
    /**
     * Constructor for objects of class CandyBar
     * This is how is how I will each new item to the arraylist
     */
    public Folkemon(String n, Types t, int h)
    {
        this.name = n;
        this.type = t;
        this.health = h;
    }
    
    /**
     * This just allows me to check the type
     */
    public Types getTypes()
    {
        return this.type;
    }
    
    /**
     * Same thing just to check the health
     */
    public int getHealth()
    {
        return this.health;
    }
    
    /**
     * Not sure if I will need this but this prints all the info about them
     */
    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println("they are a " + this.type);
        System.out.println(this.health + " hp");
    }
}
