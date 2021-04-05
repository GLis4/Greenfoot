
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
    int y = 780;
    public static int LIVE = 10;
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
        showText("Live : " + LIVE, 400, 10);
        if(LIVE == 0) {
            showText("You Lose",250,350);
            Greenfoot.stop();
        }
        counter++;
        if(counter == 100) {
            Balloon Balloon0 = new Balloon("ballonred.png");
            addObject(Balloon0,Greenfoot.getRandomNumber(500), y);
            Balloon Balloon1 = new Balloon("ballonblue.png");
            addObject(Balloon1,Greenfoot.getRandomNumber(500), y);
            Balloon Balloon2 = new Balloon("ballonpurple.png");
            addObject( Balloon2,Greenfoot.getRandomNumber(500), y);
            addObject(new Balloon("ballongreen.png"), Greenfoot.getRandomNumber(500), y);
        }else if(counter == 200){
            Balloon Balloon1 = new Balloon("ballonblue.png");
            addObject(Balloon1,Greenfoot.getRandomNumber(500), y);
        }else if (counter == 300) {
            Balloon Balloon2 = new Balloon("ballonpurple.png");
            addObject( Balloon2,Greenfoot.getRandomNumber(500), y);
            addObject(new Balloon("ballongreen.png"), Greenfoot.getRandomNumber(500), y);
            counter= 0;
        }
        
        
        //drop bomb
        int random = Greenfoot.getRandomNumber(1000);
        if(random < 5) {
            addObject(new Bomb(), Greenfoot.getRandomNumber(500), 0);
        }
    }
}

