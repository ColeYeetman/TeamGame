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
        
        setPaintOrder(Player.class);
        prepare();

    }
    
    public void act()
    {
       
    }
    
    /**
     * Scrolls until specified actor is at the center of the screen.
     */
    public void centerScroll(Actor actor) {
        int scrollX = actor.getX() - getWidth() / 2;
        int scrollY = actor.getY() - getHeight() / 2;
        scroll(scrollX, scrollY);
    }
    
    
    /**
     * Sliding scroll. Only scrolls when player close to edge.
     */
    public void slidingScroll()
    {
        int scrollX = 0;
        int scrollY = 0;
        
        // Example one-time scroll, on the y axis.
        // Calculate how much to scroll on y axis this frame.
        if (player.getY() < scrollMarginY)
        {
            scrollY = -scrollSpeedY;
        }
        else if (player.getY() > getHeight() - scrollMarginY)
        {
            scrollY = scrollSpeedY;
        }
        
        // Example multiple-frame scroll, on the x axis.
        // Calculate how much to scroll on x axis over next few frames.
        if (player.getX() < scrollMarginX || player.getX() > getWidth() - scrollMarginX)
        {
            smoothScrollX = player.getX() - getWidth() / 2;
        }
        
        // Calculate how much to scroll on x axis this frame.
        if ((smoothScrollX > 0 && smoothScrollX < scrollSpeedX) || (smoothScrollX < 0 && smoothScrollX > -scrollSpeedX))    // Should stop scroll.
        {
            scrollX = 0;
        }
        else if (smoothScrollX >= scrollSpeedX) // Should scroll right.
        {
            scrollX = scrollSpeedX;
        }
        else if (smoothScrollX <= -scrollSpeedX)    // Should scroll left.
        {
            scrollX = -scrollSpeedX;
        }
        
        
        scroll(scrollX, scrollY);
        smoothScrollX = smoothScrollX - scrollX;    // Decrease amount still needed to scroll over future frames.
    }
    
    
    /**
     * Scrolls all objects by specified x and y amounts.
     */
    public void scroll(int x, int y)
    {
        for (Actor actor : getObjects(Actor.class))
        {
            actor.setLocation(actor.getX() - x, actor.getY() - y);
        }
    }
    private void prepare() {
        addObject(new Player(), 400, 750);
    }
}
