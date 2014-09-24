import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;

/**
 * This component draws the targets
 * 
 * @author  Matt Wright
 * @version 9/19/14
 */
public class TargetComponent extends JComponent
{
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
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        int start = getWidth() / 4;
        
        Target target1 = new Target(200);
        g2.setColor(Color.BLACK);
        target1.draw(g2, start);
        
        Target target2 = new Target(180);
        g2.setColor(Color.BLUE);
        start = start + 10;
        target2.draw(g2, start);
        
        Target target3 = new Target(160);
        g2.setColor(Color.CYAN);
        start = start + 10;
        target3.draw(g2, start);
        
        Target target4 = new Target(140);
        g2.setColor(Color.DARK_GRAY);
        start = start + 10;
        target4.draw(g2, start);
        
        Target target5 = new Target(120);
        g2.setColor(Color.GRAY);
        start = start + 10;
        target5.draw(g2, start);
        
        Target target6 = new Target(100);
        g2.setColor(Color.GREEN);
        start = start + 10;
        target6.draw(g2, start);
        
        Target target7 = new Target(80);
        g2.setColor(Color.LIGHT_GRAY);
        start = start + 10;
        target7.draw(g2, start);
        
        Target target8 = new Target(60);
        g2.setColor(Color.MAGENTA);
        start = start + 10;
        target8.draw(g2, start);
        
        Target target9 = new Target(40);
        g2.setColor(Color.ORANGE);
        start = start + 10;
        target9.draw(g2, start);
        
        Target target10 = new Target(20);
        g2.setColor(Color.PINK);
        start = start + 10;
        target10.draw(g2, start);
        
    }

}
