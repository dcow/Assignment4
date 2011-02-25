/*************************************************************************
* David Cowden  
* CSC 207.01
* Assignment 2: Life
* Organism: A simple organism capable of growing, mating, and which has
* an energy level and energy usage rules.
************************************************************************/

public abstract class Organism {
    /*
     * Useful Constants:
     */
    public static final boolean ALIVE = true;
    public static final boolean DEAD = false;
    public static final String WETLAND = "Wetland";
    public static final String DESERT = "Desert";
    public static final String FOREST = "Forest";
    
    /*
     * Running energy level total:
     */
    private int energyLevel;
    /*
     * Running size of the organism:
     */
    private int size;
    /*
     * Organism environment:
     */
    private String environment;
    /*
     * Initial energy values for the organism:
     */
    private int energyAmount;
    private int threshAmount;
    private int dailyEnergy;
    /*
     * status indicates whether the organism is Alive or Dead.
     */
    private boolean status;

    public Organism(int eA, int tA, int dE, int s, String env) {
	energyAmount = eA;
	threshAmount = tA;
	dailyEnergy = dE;
	size = s;
	environment = env;
        status = ALIVE;

        energyLevel = energyAmount;
    }
    
    /**
     * Standard no parameter updateEnergyLevel() function.
     * This can be overidden if desired but shouldn't need 
     * to be for our purposes.
     */
    public boolean updateEnergyLevel() {
        
        //check status of organism  
        if(energyLevel < 0)
            return dead(); 

        try {
            return updateEnergyLevel(dailyEnergy, threshAmount);
        } catch(Exception e) {
            System.err.println(e.getMessage());
            System.err.println("Defective Organism!");
        }
        status = DEAD;
        return DEAD; //Organism dies if updateEnergy() fails.
    }

    /**
     * updateEnergyLevel(int amount, int threshold) is the skeleton code
     * that should be wrapped in a standard updateEnergyLevel function.
     * This allows a little more flexibility in case any organism needs
     * a special updateEnergyLevel function.
     *
     @param int amount
     @param int threshold
     @return boolean
     @throws Exception
    */
    protected boolean updateEnergyLevel(int amount, int threshold)
        throws Exception {
	if(amount < 0)
	    throw new Exception("Invalid Amount: " + amount);
	if(threshold < 0)
	    throw new Exception("Invalid Threshold: " + threshold);      
	
	//determine appropriate action
	if(energyLevel > threshold)
	    energyLevel -= amount;
	else
	    thresholdCase(amount); 
        
        if(energyLevel < 0) 
            return dead();
        else
            return ALIVE;
    }

    /* 
     * Default threshold case.  A normal organism exhibits this behaviour.
     * This will/should be overridden by more complex organisms.
     */
    protected void thresholdCase(int amount) {
	setEnergyLevel(getEnergyLevel() - amount);
    }

    /*
     * This method should be implemented by either Normal,
     * Conserving, and Accelerating subclasses.
     */
    // abstract void thresholdCase(int amount);
    
    /*
     * All organizms should have the following vital functions
     * necessary to survive in their respectie habitats.
     */
    abstract void grow();
    abstract void reproduce();
    /* 
     */

    /*
     * toString returns a nice string representation of an organism
     */
    public String toString() {
        String s = (status) ? "ALIVE" : "DEAD";
	return
	    "::    Organism    :: \n" +
	    "Species: " + getClass() + "\n" +
	    "Environment: " + getEnvironment() + "\n" +
	    "Current Energy Level: " + getEnergyLevel() + "\n" +
            "Status: " + s + "\n";	
    }
    
    /**
     * Simple function to add an amount to the size member.
     *
     @param int amount
     @return void
     */
    protected void addToSize(int amount) {
	size += amount;
    }

    private boolean dead() {
        energyLevel = 0;
        status = DEAD;
        return DEAD;
    }

    /*
     * get/set functions
     */
    public final int getEnergyLevel() {
	return energyLevel;
    }
    protected final void setEnergyLevel(int Energy) {
	energyLevel = Energy;
    }
    public final String getEnvironment() {
	return environment;
    }
    protected final void setEnvironment(String Env) {
	environment = Env;
    }
    public final int getEnergyAmount() {
	return energyAmount;
    }
    protected final void setEnergyAmount(int eAmount) {
	energyAmount = eAmount;
    }
    public final int getThresAmount() {
	return threshAmount;
    }
    protected final void setThresAmount(int tAmount) {
	threshAmount = tAmount;
    }
    public final int getDailyEnergy() {
	return dailyEnergy;
    }
    protected final void setDailyEnergy(int Energy) {
	dailyEnergy = Energy;
    }
    public final int getSize() {
	return size;
    }
    protected final void setSize(int s) {
	size = s;
    }
    public final boolean getStatus() {
	return status;
    }
    protected final void setStatus(boolean s) {
	status = s;
    }
}
