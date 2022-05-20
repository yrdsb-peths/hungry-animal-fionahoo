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
<<<<<<< Updated upstream
        move(1);
        turn(2);
=======
=======
>>>>>>> Stashed changes
        MyWorld w = (MyWorld) getWorld();
        
        if(w.worldPause == false)
        {
            move(1);
            turn(2);
        }
        
        if(isTouching(Wombat.class))
        {
            removeTouching(Wombat.class);
            w.endGame();
        }
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
    }
    
    public Seal(String name)
    {
        this.name = name;
    }
}
