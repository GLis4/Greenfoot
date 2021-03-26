import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BalloonG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BalloonG extends Actor
{
    /**
     * Act - do whatever the BalloonG wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(), getY()- Greenfoot.getRandomNumber(7));
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
