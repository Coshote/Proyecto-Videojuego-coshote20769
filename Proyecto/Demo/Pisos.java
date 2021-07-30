import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pisos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pisos extends Actor
{
    public Pisos()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/9;
        int myNewWidth = (int)myImage.getWidth()/15;
        myImage.scale(myNewWidth,myNewHeight);
    }
    /**
     * Act - do whatever the Pisos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
