
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int counter;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 700, 1, false); 
    }
     
    public void act(){
        counter++;
        if(counter >= 200  ){
            int y = 780;
            int xRandom=Greenfoot.getRandomNumber(500);
            Balloon Balloon0 = new Balloon("ballonred.png");
            addObject(Balloon0,xRandom-100, y);
            Balloon Balloon1 = new Balloon("ballonblue.png");
            addObject(Balloon1,xRandom+200, y);
            Balloon Balloon2 = new Balloon("ballonpurple.png");
            addObject( Balloon2,xRandom, y);
            addObject(new BalloonGreen(),xRandom-200, y);
            
            counter= 0;
        }     
     }
}

