import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Heroe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heroe extends Actor
{
    private double velocidad =0.0;
    public int velX = 3;
    public int velY= 20;
    public boolean estaSaltando=false;
    //constantes
    public static final double GRAVEDAD = 0.5;
    public static final int IMPULSO=10;    
    public Heroe()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/5;
        int myNewWidth = (int)myImage.getWidth()/5;
        myImage.scale(myNewWidth,myNewHeight);
    }
    /**
     * Act - do whatever the Heroe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld thisGame;
    public void act()
    {
        
        // para mover     /////COMANDOS SIN UTILIZAR AÚN DEBIDO A QUE ESTA EN PRUEBA;
        mover();
                        //movimiento();
        atrapar();
                        //if (Greenfoot.isKeyDown("Up") && !estaSaltando)
                        //{
                          //  this.saltar();
                        //}
                        //else if (estaSaltando)
                        //{
                          //  this.caer();
                        //}
        
    }
    public void atrapar()
    {
        Actor Fichas =getOneIntersectingObject(Fichas.class);
        if (Fichas !=null)
        {
            getWorld().removeObject(Fichas);
            thisGame.score++;
        }
    }
    public void mover()
    {
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY()-10);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+5,getY());
        }
        if (Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-5,getY());
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()+10);
        }
    }
    public void movimiento()
    {
        if (Greenfoot.isKeyDown("Right"))
        {
        setLocation(getX()+velX,getY());
        }
        
    }
    public void saltar()
    {
        velocidad += IMPULSO;
        int x=getX();
        int y=(int)(getY() + velocidad);
        setLocation(x,y);
    }
    public void caer()
    {
        
       velocidad += GRAVEDAD;
       int x=getX();
       int y= (int) (this.getY()+ this.velocidad);
       setLocation(x,y);
    }
}
