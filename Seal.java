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
        move(-1);
    }
    
    public Seal(String name)
    {
        this.name = name;
    }
}
