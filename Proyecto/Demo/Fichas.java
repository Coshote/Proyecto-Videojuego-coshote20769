import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fichas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fichas extends Actor
{
    public Fichas()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/20;
        int myNewWidth = (int)myImage.getWidth()/20;
        myImage.scale(myNewWidth,myNewHeight);
        
    }
    /**
     * Act - do whatever the Fichas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
