
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Het aantal overblijvende levens. Wordt bovenaan rechts op het scherm
 * getoond.
 */
public class Levens extends Actor
{
    private int totaal = 30;  
    
    public Levens () {
        toon();
    }

    private void toon() {
        setImage( new GreenfootImage(Integer.toString(totaal), 25,  Color.RED, new Color(0,0,0,0)) );
    }
}
