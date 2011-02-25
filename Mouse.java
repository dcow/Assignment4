/*************************************************************************
* David Cowden  
* CSC 207.01
* Assignment 2: Life
* Mouse: A mouse organism.
************************************************************************/

public class Mouse extends Accelerating {

    public Mouse() {
	super(10000, 600, 20, 1, FOREST);
    }
    
    public void grow() {
	addToSize(1);
	System.out.println("Mouse growing.. ..");
    }

    public void reproduce() {
	System.out.println("Mating call signature: 1337");
    }

    public void gnaw(String material) {
	System.out.println("Gnawing on: " + material);
    }

}
