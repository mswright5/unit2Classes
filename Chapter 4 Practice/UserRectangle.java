import java.awt.Rectangle;
import java.util.Scanner;

/**
 * Allows the user to input the length and width of a rectangle they would like to be drawn
 * 
 * @author Matt Wright
 * @version September 29, 2014
 */
public class UserRectangle
{
    /** description of instance variable x (add comment for each instance variable) */
    private int width, height;

    /**
     * Default constructor for objects of class UserRectangle
     */
    public UserRectangle(int x, int y)
    {
        this.width = x;
        this.height = y;
    }
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter rectangle width: ");
        int wide = s.nextInt();
        System.out.print("Please enter rectangle height: ");
        int high = s.nextInt();
        System.out.println("");
        
        UserRectangle userRect = new UserRectangle(wide, high);
        userRect.construct();
    }
    
    /**
     * Constructs the actual rectangle based on user given params
     *
     * 
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void construct()
    {
        Rectangle rect = new Rectangle(this.width, this.height);
        System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
        System.out.println(this.diameter(this.width, this.height));
    }
    
    public double diameter(int a, int b)
    {
        double c = Math.pow(a, 2) + Math.pow(b, 2);
        c = Math.sqrt(c);
        c = Math.round(c * 100) / 100;
        return c;
    }

}
