import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BalloonGreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BalloonGreen extends Actor
{
    /**
     * Act - do whatever the BalloonGreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        // Add your action code here.
    int counter;
    public void act() 
    {
        int speed= Greenfoot.getRandomNumber(5);
       setLocation(getX(), getY()- speed);
        mouseClick();
    }
    void mouseClick(){
        MouseInfo mouse = Greenfoot.getMouseInfo();          
       if(mouse != null){
            boolean button = Greenfoot.mousePressed(this);
            if(button==true){ 
                Greenfoot.playSound("Balloon popping.mp3");
                setImage("powImage.png");
            }
            if(getImage().toString().contains("powImage.png")){
                counter++;
            }          
       }
       
       if(getY()== 10){
             getWorld().showText("You Lose",250,350);
             Greenfoot.stop();
       } else if(counter== 8){
          getWorld().removeObject(this);                
        }
    }    
}
