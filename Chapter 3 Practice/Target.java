import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Write a description of class Target here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Target
{
    /** description of instance variable x (add comment for each instance variable) */
    private int diameter;

    /**
     * Default constructor for objects of class Target
     */
    public Target(int diam)
    {
        // initialise instance variables
        this.diameter = diam;
    }

    /**
     * Draws out the target and draws onto frame
     * 
     * @param   g2      The graphics frame to draw on
     * @param   width   Point where circle's x lies
     * @param   height  Point where circle's y lies
     * 
     */
    public void draw(Graphics2D g2, int start)
    {
        Ellipse2D.Double ellipse = new Ellipse2D.Double();
        ellipse.setFrame(start, start, this.diameter, this.diameter);
        
        g2.draw(ellipse);
        g2.fill(ellipse);
    }
}
