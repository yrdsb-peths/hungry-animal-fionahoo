import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wombat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wombat extends Actor
{
    private GreenfootImage[] rightImages;
    private GreenfootImage[] leftImages;
    private SimpleTimer animTimer;
    private boolean isFacingRight = true;
    
    /**
     * Act - do whatever the Wombat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Wombat()
    {
        rightImages = new GreenfootImage[11];
        leftImages = new GreenfootImage[11];
        for(int i = 0; i < rightImages.length; i++)
        {
            rightImages[i] = new GreenfootImage("media3_giphy_com-giphy-" + i + ".png");
            rightImages[i].scale(200, 100);
            leftImages[i] = new GreenfootImage("media3_giphy_com-giphy-" + i + ".png");
            leftImages[i].mirrorHorizontally();
            leftImages[i].scale(200, 100);
        }
        setImage(rightImages[3]);
        animTimer = new SimpleTimer();
        animTimer.mark();
    }
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("a"))
        {
            move(-3);
            isFacingRight = false;
        }
        if(Greenfoot.isKeyDown("d"))
        {
            move(3);
            isFacingRight = true;
        }
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY() - 3);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY() + 3);
        }

        consume();
        animate();
    }
    
    public void consume()
    {
        if(isTouching(Pingo.class))
        {
            removeTouching(Pingo.class);
            MyWorld w = (MyWorld) getWorld();
            w.increaseScore();
            w.spawnPingo();
        }    

    }
    
    int curIndex = 0;
    public void animate()
    {
        if(animTimer.millisElapsed() > 100)
        {
            if(isFacingRight)
            {
                setImage(rightImages[curIndex]);
            }
            else
            {
                setImage(leftImages[curIndex]);
            }
            curIndex++;
            curIndex %= 11;
            animTimer.mark();
        }
    }
}