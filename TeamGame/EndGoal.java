import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndGoal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndGoal extends Actor
{
    /**
     * Act - do whatever the EndGoal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (isTouching(Player.class)){
            Greenfoot.setWorld(new Level1());
        }
    }
}
