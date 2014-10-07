import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.JComponent;
import java.util.Random;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author Matt Wright
 * @version October 7 2014
 */
public class CityscapeComponent extends JComponent
{
    
    /**The street line of the cityscape, passed in as the y starting point for the apartment */
    public static final int STREET_LINE = 200;
    
    /**
     * Allows the city to be viewed
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Random generator = new Random();
        
        //Street line of buildings
        int street = getHeight() - 100;
        
        //Creates the sky
        Sky sky = new Sky(street, getWidth());
        g2.setColor(Color.CYAN);
        sky.draw(g2);
        
        
        //Starting point for apartment
        int x = 0;
        
        //Width of the apartment
        int wide = getWidth() / 4;
        
        street = getHeight() - 300;
        
        //Creates new apartment, sets the graphics color to red, and draws the apartment
        //onto the graphics object
        Apartment apartment = new Apartment(x, 200, wide, street);
        g2.setColor(Color.RED);
        apartment.draw(g2);
        
        //Apartment 2
        x = getWidth() / 4 + 50;
        g2.setColor(Color.GREEN);
        
        
    }

}
