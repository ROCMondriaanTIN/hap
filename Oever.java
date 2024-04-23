import greenfoot.*; 

/**
 * Onze versie van de wereld
 */
public class Oever extends World
{
    private Punten punten;

    private Levens levens;

    private Resultaat resultaat;

    /**
     * Constructor for objects of class Oever.
     */
    public Oever()
    {    
        super(20, 15, 22);

        punten = new Punten();
        addObject (punten, 1,0 );

        levens = new Levens();
        addObject (levens, 18, 0 );

        resultaat = new Resultaat();
        addObject (resultaat, 10, 1);

        Greenfoot.setSpeed(50);

        setPaintOrder(
            Punten.class, Levens.class,
            Aardbei.class, 
            Nijlpaard.class
        );
    }
    
}
