import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wombat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wombat extends Actor
{
    /**
     * Act - do whatever the Wombat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("a"))
        {
            move(-5);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            move(5);
        }
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY() - 3);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY() + 3);
        }
    }
}