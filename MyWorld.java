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
        Seal s1 = new Seal("sadge");
        Seal s2 = new Seal("boohoo");
        addObject(s1, 150, 100);
        addObject(s2, 450, 250);
        Wombat baby = new Wombat();
        addObject(baby, 300, 200);
        Pingo booo = new Pingo();
        addObject(booo, 300, 0);
    }
}
