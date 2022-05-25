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
    private GreenfootImage[] seaImages;
    private SimpleTimer animTimer;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        //Change background images
        seaImages = new GreenfootImage[152];
        for(int i = 0; i < seaImages.length; i++)
        {
            seaImages[i] = new GreenfootImage("3ce69531311986a8a78f1e093f53df3d-" + i + ".png");
            seaImages[i].scale(600, 400);
        }
        setBackground(seaImages[3]);
        animTimer = new SimpleTimer();
        animTimer.mark();
        animate();
        
        // Add actors to world
        Seal s1 = new Seal("sadge");
        Seal s2 = new Seal("boohoo");
        Seal s3 = new Seal("trois");
        addObject(s1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(600));
        addObject(s2, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(600));
        addObject(s3, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(600));
        Wombat baby = new Wombat();
        addObject(baby, 300, 200);

        // Add score label
        addObject(scoreL, 50, 340);
        
        // Add falling penguin
        spawnPingo();
    }
    
    int curIndex = 0;
    public void animate()
    {
        if(animTimer.millisElapsed() > 10)
        {
            curIndex++;
            curIndex %= 152;
            animTimer.mark();
        }
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
