
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
        super(600, 400, 1, false); 
        //addBallon();
        addObject(new Balloon(), 200, 480);
        addObject(new BalloonG(),Greenfoot.getRandomNumber(590), 480);
        addObject(new BalloonP(),Greenfoot.getRandomNumber(200), 480);

    }

    public void act(){
        counter++;
        if(counter >= 100 || counter>= 200 ){
            addObject(new Balloon(),Greenfoot.getRandomNumber(600), 480);
            addObject(new BalloonG(),Greenfoot.getRandomNumber(800), 500);
            addObject(new BalloonP(),Greenfoot.getRandomNumber(200), 480);
            addObject(new BalloonB(),Greenfoot.getRandomNumber(700), 480);

            counter= 0;
        }     
     }
}

