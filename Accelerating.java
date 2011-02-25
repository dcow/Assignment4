/*************************************************************************
* David Cowden  
* CSC 207.01
* Assignment 2: Life
* Accelerating: Rules for organism with an Accelerating energy consumption
* scheme.
************************************************************************/

public abstract class Accelerating extends Organism {

    public Accelerating(int eA, int tA, int dE, int s, String env) {
	super(eA, tA, dE, s, env);
    }

    protected void thresholdCase(int amount) {
	setEnergyLevel(getEnergyLevel() - (amount*2));
    }
}
