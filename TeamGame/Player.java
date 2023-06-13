import greenfoot.*;
import java.util.List;

public class Player extends Actor {
    private int speed = 5;
    private int jump = 15;
    private int gravity = 1;
    private int velocity;
    private static final int X_SINK_AMOUNT = 3;
    private static final int Y_SINK_AMOUNT = 1;
    public Player() {
        velocity = 0;
    }

    public void act() {
        movement();
        jumping();
        getGravity();
    }

    private void movement() {
        if (Greenfoot.isKeyDown("left")) {
            move(-speed);
        }
        if (Greenfoot.isKeyDown("right")) {
            move(speed);
        }
    }

    private void jumping() {
        if (Greenfoot.isKeyDown("space") && isOnGround()) {
            velocity = -jump;
        }
    }

    private void getGravity() {
        if (!isOnGround()) {
            velocity += gravity;
        }
        setLocation(getX(), getY() + velocity);
    }

    private boolean isOnGround() {
        int groundLevel = getWorld().getHeight() - getImage().getHeight() / 2;
        return getY() >= groundLevel;
    }
    private boolean isStandingOnObject(Actor object)
    {
        int height = getImage().getHeight();
        int bottomY = getY() + height / 2;
        int objectHeight = object.getImage().getHeight();
        int objectTopY = object.getY() - objectHeight / 2;
        
        //return bottomY <= objectTopY + Y_SINK_LIMIT_FACTOR * deltaY + Y_SINK_AMOUNT
        return bottomY - speed <= objectTopY + Y_SINK_AMOUNT;
    }
    
    /**
     * Checks collisions.
     */
    private void collisions()
    {
        int width = getImage().getWidth();
        int leftX = getX() - width / 2;
        int rightX = getX() + width / 2;
        
       
        List<SolidObject> objects = getIntersectingObjects(SolidObject.class);
        for (SolidObject object : objects)
        {
            if (isStandingOnObject(object))
            {
                continue;   // Standing behaviour is handled by gravity.
            }
            
            // Otherwise,
            int objectWidth = object.getImage().getWidth();
            int objectLeftX = object.getX() - objectWidth / 2;
            int objectRightX = object.getX() + objectWidth / 2;
            if (getX() < object.getX())    // To the left of touching object.
            {
                setLocation(objectLeftX - width/2 + X_SINK_AMOUNT, getY());   // Sink into object left edge.
            }
            else if (getX() > object.getX())  // To the right of touching object.
            {
                setLocation(objectRightX + width/2 - X_SINK_AMOUNT, getY());  // Sink into object right edge.
            }
        }
    }
}

