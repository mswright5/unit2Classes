import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * Creates a sun for the cityscape
 * 
 * @author Matt Wright
 * @version October 7, 2014
 */
public class Sun
{
    /** The radius of the Sun */
    private double radius;

    /**
     * Default constructor for objects of class Sun
     */
    public Sun(double radius)
    {
        this.radius = radius;
    }

    /**
     * Draws the sun onto the Graphics2D object
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double sun = new Ellipse2D.Double(0, 0, this.radius, this.radius);
        
        g2.draw(sun);
        g2.fill(sun);
    }

}
