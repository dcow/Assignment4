/*************************************************************************
* David Cowden  
* CSC 207.01
* Assignment 2: Life
* Otter: An otter organism.
************************************************************************/

public class Otter extends Normal {

    public Otter() {
	super(100000, 0, 80, 1, WETLAND);
    }
    
    public void grow() {
	addToSize(3);
	System.out.println("Otter growing.. ..");
    }

    public void reproduce() {
	System.out.println("Mating call signature: 9153");
    }

    public void swim() {
	System.out.println("Just keep swimming.. ");
    }

}
