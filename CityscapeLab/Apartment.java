import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * Creates Apartments with a starting point x and y, and have a width and height
 * 
 * @author Matt Wright
 * @version October 7, 2014
 */
public class Apartment
{
    /** Sarting X, Y, the Width, and Height of the apartment building */
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
     * Draws the Apartment onto the Graphics2D object
     */
    public void draw(Graphics2D g2)
    {
        Rectangle rectangle = new Rectangle(this.startX, this.startY, this.width, this.height);
        
        g2.draw(rectangle);
        g2.fill(rectangle);
    }

}
