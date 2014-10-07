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
        Sky sky = new Sky(getHeight(), getWidth());
        g2.setColor(Color.CYAN);
        sky.draw(g2);
        
        
        //Creates the sun
        double radius = getWidth() / 6;
        Sun sun = new Sun(radius);
        g2.setColor(Color.YELLOW);
        sun.draw(g2);
        
        
        //Creates new apartment, sets the graphics color to red, and draws the apartment
        //onto the graphics object
        int x = 50; //Starting point for apartment
        int y1 = generator.nextInt(getHeight() - 200) + 100; //each apartment has seperate 
                                                             //y starting points for height randomness
        int wide = getWidth() / 4;
        int high = street - y1; //Sets height equal to the horizon
        Apartment apartment = new Apartment(x, y1, wide, high);
        g2.setColor(Color.RED);
        apartment.draw(g2);
        
        
        //Apartment 2, with a green color
        x = getWidth() / 4 + 100; //Puts a space between the first and second apartment
        int y2 = generator.nextInt(getHeight() - 200) + 100;
        high = street - y2;
        Apartment apartment2 = new Apartment(x, y2, wide, high);
        g2.setColor(Color.GREEN);
        apartment2.draw(g2);
        
        //Apartment 3, with a blue color
        x = x + wide + 50;
        int y3 = generator.nextInt(getHeight() - 200) + 100;
        high = street - y3;
        Apartment apartment3 = new Apartment(x, y3, wide, high);
        g2.setColor(Color.BLUE);
        apartment3.draw(g2);
        
        
        //Constructs the road
        x = 0;
        int y = getHeight() - 100;
        wide = getWidth();
        high = getHeight();
        Road road = new Road(x, y, wide, high);
        g2.setColor(Color.BLACK);
        road.draw(g2);
        
        
        
    }

}
