import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class vidas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class vidas extends Actor
{
    /**
     * Act - do whatever the vidas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int c=3;
    public vidas(){
        
    }
    public void restar(){
        c--;
        if(c==0)
        {
            Greenfoot.stop();
        }
    }
    public void act()
    {
        // Add your action code here.
    }
}
