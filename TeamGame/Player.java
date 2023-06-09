import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
    }
        private void move() {
        int speed = 9; 
        int targetX = getX();
        int targetY = getY();

        if (Greenfoot.isKeyDown("left")) {
            targetX -= speed;
        }
        else if (Greenfoot.isKeyDown("a")) {
            targetX -= speed;
        }

        if (Greenfoot.isKeyDown("right")) {
            targetX += speed;
        }
        else if (Greenfoot.isKeyDown("d")) {
            targetX += speed;
        }

        int deltaX = targetX - getX();
        int deltaY = targetY - getY();

        setLocation(getX() + deltaX, getY() + deltaY);
    }
    }

