import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
<<<<<<<< HEAD:TeamGame/Death.java
 * Write a description of class Death here.
========
 * Write a description of class EndGoal here.
>>>>>>>> main:TeamGame/EndGoal.java
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
<<<<<<<< HEAD:TeamGame/Death.java
public class Death extends Actor
{
    /**
     * Act - do whatever the Death wants to do. This method is called whenever
========
public class EndGoal extends Actor
{
    /**
     * Act - do whatever the EndGoal wants to do. This method is called whenever
>>>>>>>> main:TeamGame/EndGoal.java
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (isTouching(Player.class)){
            Greenfoot.setWorld(new Level1());
        }
    }
}
