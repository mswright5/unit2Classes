import java.util.Scanner;

/**
 * Transforms a 10 digit string phone number into a formatted phone number with parentheses 
 * and hyphens 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Psuedocode
{

    /**
     * Default constructor for objects of class Psuedocode
     */
    public Psuedocode()
    {
    }

    /**
     * Formats the string number
     */
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter telephone number: ");
        String telephone = s.next();
        
        String formattedTelephone = "(" + telephone.substring(0,3) + ")" + telephone.substring(3,6)
                                    + "-" + telephone.substring(6);
                                    
        System.out.println(formattedTelephone);
    }

}
