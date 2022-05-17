import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
<<<<<<< Updated upstream
        Seal s = new Seal("sadge");
        addObject(s, 300, 200);
=======
        Seal s1 = new Seal("sadge");
        Seal s2 = new Seal("boohoo");
        addObject(s1, 150, 100);
        addObject(s2, 450, 250);
        Wombat baby = new Wombat();
        addObject(baby, 300, 200);
        
        spawnPingo();
    }
    
    public void spawnPingo()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        Pingo p = new Pingo();
        addObject(p, x, y);
>>>>>>> Stashed changes
    }
}
