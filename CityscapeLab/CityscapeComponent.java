import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.JComponent;
import java.util.Random;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
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
        
        int y = generator.nextInt(getHeight());
        
        //Street line of the cityscape
        int x = getHeight() - (getWidth() /5);
        
        //where the building starts
        int start = getWidth() / 5;
        
        //Where the building ends
        int end = getWidth() / 5 + (getWidth() / 5 + 5);
        
        Apartment apartment = new Apartment(start - end, y);
        g2.setColor(Color.RED);
        
        
    }

}
