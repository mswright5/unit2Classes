import java.util.Scanner;
/**
 * Calculates the payment according to investment over a certain number of years
 * 
 * @author Matt
 * @version September 26, 2014
 */
public class Annuity
{
    public static double pmt, i, n;
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print ("Enter your payment: ");
        pmt = s.nextDouble();

        System.out.print ("Enter interest: ");
        i = s.nextDouble();

        System.out.print ("Enter number of payments: ");
        n = s.nextDouble();
        
        double pvAnn = pmt * (
                                (Math.pow( 1+i , n-1) - 1) 
                                / i / 
                                (Math.pow( 1+i , n-1 ))
                                + 1);
        //attempted rounding, but rounds to 0, $1 lost
        //pvAnn = Math.round(pvAnn * 100) / 100;
        System.out.println(pvAnn);
    }
}
