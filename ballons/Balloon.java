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
      int counter;
    public void act() 
    {
     
        setLocation(getX(), getY()- Greenfoot.getRandomNumber(8));
        MouseClick();
      
    }  
    void MouseClick(){
        //getWorld().showText(""+counter, 50,50);
        MouseInfo mouse = Greenfoot.getMouseInfo(); 
        if(mouse != null){
            boolean button = Greenfoot.mousePressed(this);
            if(button==true){
               setImage("powImage.png");
            }
              if(getImage().toString().contains("powImage.png")){
              counter++;
            }
              if(counter== 8){
              getWorld().removeObject(this);
            }
       } 
       
       
    }
}
