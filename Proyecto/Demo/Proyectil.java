import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Proyectil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Proyectil extends Actor
{
    
    /**
     * Act - do whatever the Proyectil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        movimiento();
        {
            Actor Heroe=getOneObjectAtOffset(0, 0, Heroe.class);
        if (Heroe!= null)
        {
        MyWorld mundo=(MyWorld)getWorld();
        getWorld().removeObject(Heroe);
        mundo.objVida.restar();
        getWorld().addObject(new Heroe(),40,295);
        
        }
        }
        
    }
    
    public Proyectil()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/2;
        int myNewWidth = (int)myImage.getWidth()/2;
        myImage.scale(myNewWidth,myNewHeight);
        //myImage.rotate(-240);
    }
    
    public void movimiento()
    {
        move(2);
        World m = getWorld();
        if(getX()>m.getWidth()-5 || getX() <=5)
        {
            turn(180);
            if (Greenfoot.getRandomNumber(100)<90)
            {
                turn(Greenfoot.getRandomNumber(90-45));
            }
            
        }
    }
    
    
}
