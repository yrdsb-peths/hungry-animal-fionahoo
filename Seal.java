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
    GreenfootImage seal = getImage();
    /**
     * Act - do whatever the Seal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

        MyWorld w = (MyWorld) getWorld();
        seal.scale(30, 30);
        if(w.worldPause == false)
        {
            move(1);
            turn(1);
        }
        
        if(isTouching(Wombat.class))
        {
            removeTouching(Wombat.class);
            w.endGame();
        }

    }
    
    public Seal(String name)
    {
        this.name = name;
    }
}
