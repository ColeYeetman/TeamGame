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
        Platform platform = new Platform(500, 250);
        addObject(platform,591,777);
        Platform platform2 = new Platform(500, 250);
        addObject(platform2,170,777);
        bottom bottom = new bottom();
        addObject(bottom,80,760);
        bottom bottom2 = new bottom();
        addObject(bottom2,230,760);
        bottom bottom3 = new bottom();
        addObject(bottom3,380,760);
        bottom bottom4 = new bottom();
        addObject(bottom4,530,760);
        bottom bottom5 = new bottom();
        addObject(bottom5,680,760);
        bottom bottom6 = new bottom();
        addObject(bottom6,780,760);
        
        
    }
}
