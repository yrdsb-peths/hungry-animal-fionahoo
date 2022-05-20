import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameStart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameStartWorld extends World
{

    /**
     * Constructor for objects of class gameStartWorld.
     * 
     */
    public gameStartWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Label subtitleL = new Label("hungry for:", 60);
        addObject(subtitleL, 300, 125);
        Label titleL = new Label("ratatouille <3", 70);
        addObject(titleL, 300, 175);
        Label instructionsL = new Label("press [space] to begin", 50);
        addObject(instructionsL, 300, 300);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }
}
