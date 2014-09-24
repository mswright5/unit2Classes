

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A class that tests all of the methods of the Vending Machine class
 * 
 * @author Matt Wright 
 * @version 9/19/14
 */
public class VendingMachineTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class VendingMachineTest
     */
    public VendingMachineTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testFillUp()
    {
        VendingMachine vendMachine = new VendingMachine();
        vendMachine.fillUp(10);
        int amount = vendMachine.getCanCount();
        assertEquals(20,amount);
    }
    
    @Test
    public void testInsertToken()
    {
        VendingMachine vendMachine = new VendingMachine(5);
        vendMachine.insertToken();
        int tokens = vendMachine.getTokenCount();
        int cans = vendMachine.getCanCount();
        assertEquals(1,tokens);
        assertEquals(4,cans);
    }
}






