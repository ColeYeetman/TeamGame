import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level2 extends World
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
    public Level2()
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
        addObject(Player,20,700);

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

        bottom bottom7 = new bottom();
        addObject(bottom7,700,690);      
        bottom bottom8 = new bottom();
        addObject(bottom8,700,620);
        bottom bottom9 = new bottom();
        addObject(bottom9,700,550);
        bottom bottom10 = new bottom();
        addObject(bottom10,700,480);
        Death death = new Death();
        addObject(death,644,646);

        Death death2 = new Death();
        addObject(death2,755,504);
        death2.setLocation(762,434);
        bottom bottom11 = new bottom();
        addObject(bottom11,395,457);

        bottom bottom12 = new bottom();
        addObject(bottom12,070,550);

        bottom bottom13 = new bottom();
        addObject(bottom13,050,450);

        Death death3 = new Death();
        addObject(death3,90,404);

        bottom bottom14 = new bottom();
        addObject(bottom14,050,350);

        bottom bottom15 = new bottom();
        addObject(bottom15,306,276);
        bottom bottom16 = new bottom();
        addObject(bottom16,593,209);
        bottom bottom17 = new bottom();
        addObject(bottom17,716,109);
        Death death4 = new Death();
        addObject(death4,651,162);
        Death death5 = new Death();
        addObject(death5,308,259);
    }
}