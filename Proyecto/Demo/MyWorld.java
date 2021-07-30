import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static int score =0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(600, 400, 1);
        score=0;
        ///score
        addObject (new Score(),80,25);
        ///Fichas
            //1
        addObject (new Fichas(),225,265);
         addObject (new Fichas(),190,265);
          addObject (new Fichas(),155,265);
            //2
           addObject (new Fichas(),390,215);
            addObject (new Fichas(),355,215);
            //3
             addObject (new Fichas(),165,160);
              addObject (new Fichas(),200,160);
               addObject (new Fichas(),235,160);
             //4
                addObject (new Fichas(),530,160);
        ///Suelos
        addObject (new Pisos(),180,295);
         addObject (new Pisos(),350,245);
          addObject (new Pisos(),200,190);
           addObject (new Pisos(),500,190);
        ///Villano
        addObject (new Villano(),530, 200);
        ///Heroe
        addObject (new Heroe(),40,295);
        
    }
    public void act()
    {
        showText(""+ score,160,25);
    }
    private void prepare()
    {
        ///Heroe
        Heroe heroe = new Heroe();
        addObject (new Heroe(),40,295);
        ///Fichas
        Fichas fichas = new Fichas();
        addObject (new Fichas(),225,265);
        Fichas fichas2 = new Fichas();
        addObject (new Fichas(),190,265);
        
    }
}
