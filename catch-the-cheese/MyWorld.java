import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
      super(600, 400, 1); 
      
      addObject(new House(), 100,310);
        
      addObject(new Wood(), 90,90);
      addObject(new Wood(), 460,215);
      addObject(new Wood(), 90,360);
      addObject(new Cheese(), 545, 175);
     addObject(new Mouse(), 50, 53);
     
    }  
}
