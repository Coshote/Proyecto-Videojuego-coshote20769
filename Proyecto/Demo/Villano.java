import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Villano here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Villano extends Actor
{
    public Villano()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/6;
        int myNewWidth = (int)myImage.getWidth()/6;
        myImage.scale(myNewWidth,myNewHeight);
        myImage.rotate(-90);
    }
    /**
     * Act - do whatever the Villano wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(-10);
        move(10);
        
    }
}
