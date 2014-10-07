import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 * Write a description of class Cityscape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apartment
{
    /** Width and Height of the entire apartment building */
    private int width, height, startX, startY;

    /**
     * Default constructor for objects of class Apartment
     */
    public Apartment(int startX, int startY, int width, int height)
    {
        this.startX = startX;
        this.startY = startY;
        this.width = width;
        this.height = height;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)
    {
        Rectangle rectangle = new Rectangle(this.startX, this.startY, this.width, this.height);
        
        g2.draw(rectangle);
        g2.fill(rectangle);
    }

}
