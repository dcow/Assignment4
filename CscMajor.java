/*************************************************************************
* David Cowden  
* CSC 207.01
* Assignment 2: Life
* CscMajor: A comp sci major organism.
************************************************************************/

public class CscMajor extends Normal {

    public CscMajor() {
	super(1000000, 0, 120, 10, WETLAND);
	//WETLAND seemed to resemble Seatle..
    }
    
    public void grow() {
	addToSize(10);
	System.out.println("Mmmm energy drinks and Ramen.. ..");
    }

    public void reproduce() {
	System.out.println("Mating call signature: null");
    }

    public void program() {
	addToSize(20);
	System.out.println(".. Now I just need to break out EMACS and " +
			   "modify that PERL script ..");
    }

}
