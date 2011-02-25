/*************************************************************************
* David Cowden  
* CSC 207.01
* Assignment 2: Life
* Conserving: A definition for an organism which uses Conserving energy
* consumption rules.
************************************************************************/

public abstract class Conserving extends Organism {

    public Conserving(int eA, int tA, int dE, int s, String env) {
	super(eA, tA, dE, s, env);
    }

    protected void thresholdCase(int amount)  {
	setEnergyLevel(getEnergyLevel() - (amount/2));
    }

}
