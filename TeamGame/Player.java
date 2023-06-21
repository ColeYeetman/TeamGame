import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Steam Man player character.
 */
public class Player extends Actor
{
    /**
     * Constants for amount to sink into solid objects by.
     */
    private static final int X_SINK_AMOUNT = 3;
    private static final int Y_SINK_AMOUNT = 1;

    
    /**
     * Movement variables.
     */
    protected double gravity = 1;
    protected int deltaX = 0;
    protected int deltaY = 0;
    private int speedX = 4;
    private int jumpSpeed = 15;
    protected boolean isInAir = true;
    private boolean isFacingRight = true;
    
    
    /**
     * Movement keys
     */
    private String leftKey;
    private String rightKey;
    private String jumpKey;

    public Player(String left, String right, String jump)
    {
        leftKey = left;
        rightKey = right;
        jumpKey = jump;
    }
    
    /**
     * Act - do whatever the SteamMan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movementControls();
        applyGravity();
        collisions();
    }
    
    /**
     * Key controls and movement updates.
     */
    private void movementControls()
    {
        deltaX = 0;
        
        if (Greenfoot.isKeyDown("a"))
        {
            deltaX = deltaX - speedX;
        }
        
        if (Greenfoot.isKeyDown("d"))
        {
            deltaX = deltaX + speedX;
        }
        
        if (!isInAir && Greenfoot.isKeyDown(jumpKey))   // Jump.
        {
            deltaY = -jumpSpeed;
        }
        
        // Remember whether facing right or left.
        if (deltaX > 0)
        {
            isFacingRight = true;
        }
        else if (deltaX < 0)
        {
            isFacingRight = false;
        }
        
        // Update position.
        setLocation(getX() + deltaX, getY() + deltaY);
    }
    
    /**
     * Check whether standing on objects, and apply gravity.
     */
    protected void applyGravity()
    {
        // Assume is in air.
        isInAir = true;
        
        if (deltaY >= 0)    // if falling (as opposed to rising)
        {
            // Check whether standing on any objects.
            List<bottom> objects = getIntersectingObjects(bottom.class);
            for (bottom object : objects)
            {
                if (isStandingOnObject(object))
                {
                    // Stop falling.
                    deltaY = 0;
                    // Not in air.
                    isInAir = false;
                    // Adjust position to standing exactly on top of object.
                    // FIX: Sink in by 1 pixel, so that next time we can detect that character is touching object and gravity is not applied.
                    setLocation(getX(), object.getY() - object.getImage().getHeight()/2 - getImage().getHeight()/2 + Y_SINK_AMOUNT);
                    break;
                }
            }
        }
        
        if (isInAir)    // only true if not touching or standing on any objects.
        {
            // Apply gravity.
            deltaY += gravity;
        }
    }
    
    /**
     * Checks whether above top of specified object.
     * Sinking into object by at most Y_SINK_LIMIT is counts as standing on top of it.
     */
    private boolean isStandingOnObject(Actor object)
    {
        int height = getImage().getHeight();
        int bottomY = getY() + height / 2;
        int objectHeight = object.getImage().getHeight();
        int objectTopY = object.getY() - objectHeight / 2;
        
        //return bottomY <= objectTopY + Y_SINK_LIMIT_FACTOR * deltaY + Y_SINK_AMOUNT
        return bottomY - deltaY <= objectTopY + Y_SINK_AMOUNT;
    }
    
    /**
     * Checks collisions.
     */
    private void collisions()
    {
        int width = getImage().getWidth();
        int leftX = getX() - width / 2;
        int rightX = getX() + width / 2;
            
    }
}

