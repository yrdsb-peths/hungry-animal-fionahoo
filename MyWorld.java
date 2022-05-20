import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static int score = 0;
    public Label scoreL = new Label(0, 80);
    public boolean worldPause = false;
    public Label overL = new Label("u drowned ur rat :(", 70);
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        // Add actors to world
        Seal s1 = new Seal("sadge");
        Seal s2 = new Seal("boohoo");
        addObject(s1, 150, 100);
        addObject(s2, 450, 250);
        Wombat baby = new Wombat();
        addObject(baby, 300, 200);

        // Add score label
        addObject(scoreL, 50, 340);
        
        // Add falling penguin
        spawnPingo();
    }
    
    public void increaseScore()
    {
        score++;
        scoreL.setValue(score);
    }
    
    public void spawnPingo()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        Pingo p = new Pingo();
        addObject(p, x, y);

    }
    
    public void endGame()
    {
        addObject(overL, 300, 200);
        worldPause = true;
    }
    
    
}
