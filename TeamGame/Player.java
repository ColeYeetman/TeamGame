import greenfoot.*;

public class Player extends Actor {
    private int speed = 5;
    private int jump = 15;
    private int gravity = 1;
    private int velocity;

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
}

