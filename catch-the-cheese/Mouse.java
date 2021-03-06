import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mouse extends Actor
{
    /**
     * Act - do whatever the Mouse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int speed= 4;
    public int vSpeed=0;
    private int aceleration=3;
    int checkCheese=0; 
    public void act(){
       
        
        keys();
        fall();
        checkFall();
        checkWinandLose();
    }

    public void checkFall(){
        Actor wood = getOneIntersectingObject(Wood.class);
        if (wood != null)
        {
            int dir = (int)Math.signum(vSpeed);
            int dist = (wood.getImage().getHeight()+getImage().getHeight())/2+1;
            setLocation(getX(), wood.getY()-dir*dist);
            vSpeed = 0;
        }
    }

    public void fall(){
        setLocation(getX(), getY()+vSpeed);
        vSpeed = vSpeed + aceleration;
    }

    public void keys() 
    {
        if(Greenfoot.isKeyDown("left")){
            setImage("MouseRight.png");
            setLocation(getX()-speed, getY());

        }
        if(Greenfoot.isKeyDown("right")){ 
            setImage("MouseLeft.png");
            setLocation(getX()+speed, getY());

        }

    }

    void checkWinandLose(){
        
        if(getY() == 323 && getX() > 99 && getX() < 109 && checkCheese==1){
            getWorld().showText("You Win!", 300, 200);
            Greenfoot.stop();
        }
        
        if(isAtEdge()){
            getWorld().showText("You Lose", 300, 200);
            Greenfoot.stop();
        }
        if (isTouching(Cheese.class)){
            removeTouching(Cheese.class);
            checkCheese++;
        }
        

    }
}

