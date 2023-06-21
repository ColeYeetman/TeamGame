import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level1 extends World
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
    public Level1()
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

        bottom bottom7 = new bottom();
        addObject(bottom7,162,646);
        bottom bottom8 = new bottom();
        addObject(bottom8,414,573);
        bottom bottom9 = new bottom();
        addObject(bottom9,695,624);
        bottom bottom10 = new bottom();
        addObject(bottom10,780,510);
        bottom bottom11 = new bottom();
        addObject(bottom11,561,399);
        bottom bottom12 = new bottom();
        addObject(bottom12,240,385);
        bottom bottom13 = new bottom();
        addObject(bottom13,103,266);
        bottom bottom14 = new bottom();
        addObject(bottom14,366,192);
        bottom bottom15 = new bottom();
        addObject(bottom15,637,116);

        EndGoal endGoal = new EndGoal();
        addObject(endGoal,755,49);
        
        Bee bee = new Bee();
        addObject(bee,288,597);
        Bee bee2 = new Bee();
        addObject(bee2,646,464);
        Bee bee3 = new Bee();
        addObject(bee3,165,312);
        Bee bee4 = new Bee();
        addObject(bee4,494,241);
        Bee bee5 = new Bee();
        addObject(bee5,431,29);
    }
}
