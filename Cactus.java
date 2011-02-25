/*************************************************************************
* David Cowden  
* CSC 207.01
* Assignment 2: Life
* Cactus: A cactus organism.
************************************************************************/

public class Cactus extends Conserving {

    public Cactus() {
	super(10000000, 10000, 100, 1, DESERT);
    }
    
    public void grow() {
	addToSize(1);
	System.out.println("Cactus slowly growing.. ..");
    }

    public void reproduce() {
	System.out.println("Mating call signature: 4137");
    }

    public void prick() {
	System.out.println("PRICK!!");
    }

}
