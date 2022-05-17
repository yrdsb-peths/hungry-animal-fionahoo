import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class phoq here.
 * 
 * @author fionahoo 
 * @version apr 29
 */
public class Seal extends Actor
{
    private String name;
    
    /**
     * Act - do whatever the phoq wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
<<<<<<< Updated upstream
        move(-1);
=======
        move(1);
        turn(2);
        
        if(isTouching(Wombat.class))
        {
            removeTouching(Wombat.class);
            endGame();
        }
    }
    
    public void endGame()
    {
        MyWorld w = (MyWorld) getWorld();
        Label endLabel = new Label("Game over :(((", 2);
        w.addObject(endLabel, 300, 200);
>>>>>>> Stashed changes
    }
    
    public Seal(String name)
    {
        this.name = name;
    }
}
