import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Adds commas and removes commas from string numbers
 * 
 * @author Matt Wright
 * @version September 30, 2014
 */
public class StringParsingPractice
{
    /**
     * Main method that carries out everything
     *
     * @post    Prints an entered number from the user, but with commas
     * 
     */
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###");
        
        //Prompts number without comma
        System.out.print("Please enter number: ");
        int number = s.nextInt();
        
        //Formats and prints number
        System.out.println(df.format(number));
        
        //Prompts user for a number with a comma
        System.out.print("Enter number with a comma: ");
        String number2 = s.next();
        
        number2 = number2.replace(",","");
        System.out.println(number2);
    }
}
