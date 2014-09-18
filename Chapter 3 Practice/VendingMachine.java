

/**
 * VendingMachine is a class that counts the total number of cans in a veinding machine
 * and whether or not a token has been entered
 * 
 * @author Matt Wright 
 * @version September 18, 2014
 */
public class VendingMachine
{
    /** The total number of cans in the vending machine with no maximum limit */
    private int totalCans;
    
    /** The total amount of tokens in the vending machine, currently not checking for no cans 
     * assume it will always be positive 
     */
    private int tokens;

    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine()
    {
        totalCans = 10;
        tokens = 0;
    }
    
    /** Constructor for Vending Machine that allows a parameter to be passed in 
     * for the total amount of cans
     * @param cans the total amount of cans the Vending Machine will start with
     */
    public VendingMachine(int cans)
    {
        totalCans = cans;
        tokens = 0;
    }

    /**
     * Fills up the vending machine the specified number of cans
     *
     * @post    VendingMachine object will have an updated totalCans variable
     * @param   cans    an integer of the number of cans to fill the vending machine with
     */
    public void fillUp(int cans)
    {
        this.totalCans = this.totalCans + cans;
    }
    
    /**
     * Adds a token to the vending machine, and subtracts one can
     * 
     * @post    tokens is added by one, total amount of cans decreased by one
     */
    public void insertToken()
    {
        this.tokens++;
        this.totalCans--;
    }
    
    /**
     * Returns an integer of the total number of cans in the vending machine
     *
     * @return  a integer of the total amount of cans in the vending machine
     */
    public int getCanCount()
    {
        return this.totalCans;
    }
    
    /**
     * Returns an integer of the total number of tokens in the vending machine
     *
     * @return  a integer of the total amount of tokens in the vending machine
     */
    public int getTokenCount()
    {
        return this.tokens;
    }

}
