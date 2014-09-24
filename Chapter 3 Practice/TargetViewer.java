import javax.swing.JFrame;

/**
 * Creates the frame for the Target Class
 * 
 * @author Matt Wright 
 * @version 9/22/14
 */
public class TargetViewer
{
     /**
     * Creates the frame and adds the target rings to the frame
     *
     */
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(400,400);
        frame.setTitle("A Target");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TargetComponent component = new TargetComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}
