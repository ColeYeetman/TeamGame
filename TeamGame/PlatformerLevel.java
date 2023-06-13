import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PlatformerLevel extends World
{
    private static final int scrollMarginX = 100;
    private static final int scrollMarginY = 100;
    private static final int scrollSpeedX = 5;
    private static final int scrollSpeedY = 5;
    private int smoothScrollX = 0;
    private int smoothScrollY = 0;
    private boolean centerScrollMode = false;
    
    private Player player;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public PlatformerLevel()
    {    
        // Create an unbounded world.
        super(800, 800, 1, false);
        prepare();

    }
    
    public void act()
    {
       
    }
    
    private void prepare() {
        addObject(new Player(), 400, 750);
        Platform platform = new Platform(200, 200);
        addObject(platform,600,750);
        SolidObject SolidObject = new SolidObject(200, 200);
        addObject(SolidObject,300,750);
    }
}
