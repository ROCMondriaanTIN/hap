
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Behaalde punten. Wordt bovenaan links op het scherm getoond.
 */
public class Punten extends Actor
{
    private int totaal = 0;
    
    public Punten () {
        toon();
    }

    private void toon() {
        setImage( new GreenfootImage(Integer.toString(totaal), 25,  Color.BLUE, new Color(0,0,0,0)) );
    }
}
