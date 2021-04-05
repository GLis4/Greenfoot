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
    static int COUNTER = 0;
    int timerEraseBallon = 0;

    public Balloon(String imgName)
    {
        setImage(new GreenfootImage(imgName));

    }

    public void act() 
    {
        getWorld().showText("Score : " + COUNTER, 60, 10);
        int speed = Greenfoot.getRandomNumber(5);
        setLocation(getX(), getY() - speed);
        if(getY() < 10) {
            MyWorld.LIVE--;
            getWorld().removeObject(this);
        }
        if(timerEraseBallon == 0){
            mouseClick();
        }else if(timerEraseBallon == 1){
            getWorld().removeObject(this);
        } else {
            timerEraseBallon--;
        }

    }
    void mouseClick(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null) {
            Actor a = mouse.getActor();
            if(mouse.getButton() == 1 && a != null && a.equals(this)){
                Greenfoot.playSound("Balloon popping.mp3");
                setImage("powImage.png");
                COUNTER++;
                timerEraseBallon = 50;
            }
        }
    }
}