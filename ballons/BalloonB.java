import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BallonB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BalloonB extends Actor
{
    /**
     * Act - do whatever the BallonB wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int x = getX();
        int y = getY();
        setLocation(x, y- Greenfoot.getRandomNumber(8));
        mouseClick();
    }    
    void mouseClick()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();   
        if(mouse != null){
            boolean button = Greenfoot.mousePressed(this);
            if(button==true){
                getWorld().removeObject(this);
            }
       } 
    }
}
