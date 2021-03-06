import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Balloon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balloon extends Actor
{
    /**
     * Act - do whatever the Balloon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        setLocation(x, y- Greenfoot.getRandomNumber(8));
        MouseClick();
      
    }  
    
    void MouseClick(){
        
         MouseInfo mouse = Greenfoot.getMouseInfo();   
        if(mouse != null){
            int button = mouse.getButton();
            if(button==1){
                getWorld().removeObject(this);
            }
       } 
    }
}
