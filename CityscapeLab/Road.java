import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * Creates a Road with a constant distance from the bottom of the screen and stays with
 * the edge of the screen
 * 
 * @author Matt Wright
 * @version October 7, 2014
 */
public class Road
{
    /**Starting X, Y, the Width, and Height of the apartment building */
    private int x, y, width, height;

    /**
     * Constructor for objects of class Road
     */
    public Road(int x, int y, int wide, int high)
    {
        this.x = x;
        this.y = y;
        this.width = wide;
        this.height = high;
    }

    /**
     * Draws the Road onto the Graphics2D object
     */
    public void draw(Graphics2D g2)
    {
        Rectangle rectangle = new Rectangle(this.x, this.y, this.width, this.height);
        
        g2.draw(rectangle);
        g2.fill(rectangle);
        
        
        //Creates the yellow line on roads
        int LINE_LENGTH = this.width;
        int LINE_HEIGHT = 10;
        int LINE_VERT_POS = this.y + 45;
        int lineX = this.x;
        
        Rectangle line1 = new Rectangle(0, LINE_VERT_POS, LINE_LENGTH, LINE_HEIGHT);
        g2.setColor(Color.YELLOW);
        g2.draw(line1);
        g2.fill(line1);
    }
}
