import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(), getY() + Greenfoot.getRandomNumber(5));
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null) {
            Actor a = mouse.getActor();
            if(mouse.getButton() == 3  && a != null && a.equals(this)){
                Greenfoot.playSound("Balloon popping.mp3");
                setImage("powImage.png");
                getWorld().removeObject(this);
                MyWorld.LIVE++;
            }
        }
        if(getY() > getWorld().getHeight() - 10) {
            MyWorld.LIVE -=3;
            getWorld().removeObject(this);
        }
    }    
}
