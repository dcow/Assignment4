/*************************************************************************
* David Cowden  
* CSC 207.01
* Assignment 2: Life
* Spider:  A spider organism
************************************************************************/

public class Spider extends Accelerating {

    public Spider() {
	super(500, 60, 10, 1, FOREST);;
    }
    
    public void grow() {
	addToSize(1);
	System.out.println("Spider growing.. ..");
    }

    public void reproduce() {
	System.out.println("Mating call signature: 8008");
    }
    
    public void spinWeb() {
	System.out.println("Spin: % --> # --> @ --> *");
    }

}
