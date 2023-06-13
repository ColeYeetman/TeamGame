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
    
    private Player Player;
    
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
        Player = new Player("left", "right", "space");
        addObject(Player,50,550);
        Platform platform = new Platform(200, 20);
        addObject(platform,100,750);
         Platform platform2 = new Platform(200, 20);
        addObject(platform2,300,750);
         Platform platform3 = new Platform(200, 20);
        addObject(platform3,500,650);
         Platform platform4 = new Platform(200, 20);
        addObject(platform4,650,500);
        SolidObject SolidObject = new SolidObject(100, 100);
        addObject(SolidObject,400,500);
    }
}
