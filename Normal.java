/*************************************************************************
* David Cowden  
* CSC 207.01
* Assignment 2: Life
* Normal: Rules for an organism with normal energy consumption.
************************************************************************/

public abstract class Normal extends Organism {

    public Normal(int eA, int tA, int dE, int s, String env) {
	super(eA, tA, dE, s, env);
    }

    /* 
     * Default threshold case.  A normal organism exhibits this behaviour.
     * This will/should be overridden by more complex organisms.
     */
    protected void thresholdCase(int amount) {
	setEnergyLevel(getEnergyLevel() - amount);
    }


}
