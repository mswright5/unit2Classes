

/**
 * pair programming
 * 
 * @Matt Wright Allen Lin 
 * @9/17/2014 
 */
public class Door
{
    
    /** description of instance variable x (add comment for each instance variable) */
    private String doorStatus;
    private String doorLocation;
    

    /**
     * Default constructor for objects of class Door
     */
    public Door(String doorStatus, String doorLocation)
    {
        this.doorStatus = doorStatus; 
        this.doorLocation = doorLocation; 
      
              
    }
    

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
    public void doorClosed()

    {
        this.doorStatus = "Closed"; 
    }
    
    public void doorOpen()
    {
        this.doorStatus = "Open"; 
    }
    
    public String getName()
    {
        return this.doorLocation;
    }
    
    public String getStatus()
    {
        return this.doorStatus;
    }
    
    public void setName(String newName)
    {
        this.doorLocation = newName;
    }
    
    public void setStatus(String newStatus)
    {
        this.doorStatus = newStatus;
    }
    
}
