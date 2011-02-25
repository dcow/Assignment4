/*************************************************************************
* David Cowden  
* CSC 207.01
* Assignment 2: Life
* Lizard: A lizard organism.
************************************************************************/

public class Lizard extends Conserving {

    public Lizard() {
	super(1000, 100, 10, 1, DESERT);
    }
    
    public void grow() {
	addToSize(1);
	System.out.println("Lizard growing.. ..");
    }

    public void reproduce() {
	System.out.println("Mating call signature: 1578");
    }

    public void detachTail() {
	System.out.println("Got ya!");
    }

}
