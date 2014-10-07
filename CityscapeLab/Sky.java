import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 * Creates the sky
 * 
 * @author Matt Wright
 * @version October 7, 2014
 */
public class Sky
{
    /** Where the sky meets the ground */
    private int horizon, length;

    /**
     * Default constructor for objects of class Sky
     */
    public Sky(int horizon, int length)
    {
        this.horizon = horizon;
        this.length = length;
    }

    /**
     * Draws the sky onto the Graphics2D object
     *
     * @post    A colored Sky
     */
    public void draw(Graphics2D g2)
    {
        Rectangle sky = new Rectangle(0,0, this.length, this.horizon);
        
        g2.draw(sky);
        g2.fill(sky);
    }

}
