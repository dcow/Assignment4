/*************************************************************************
* David Cowden  
* CSC 207.01
* Assignment 2: Life
* World: A world for each organism to live in.
************************************************************************/

import java.util.ArrayList;

public class World {
    
    private ArrayList<Organism> creatures; //arrayList of creatures (organisms)
    private long worldEnergy; //total energy from all organisms
    private int deaths; //number of dead organisms
    private int days; //number of days passed

    /**
     * Standard constructor.
     */
    public World() {
	creatures = new ArrayList<Organism>();
	worldEnergy = 0;
	deaths = 0;
        days = 0;
    }

    /**
     * Perhaps you might want to place an organism in World at instantiation.
     */
    public World(Organism o) {
	this();
	addCreature(o);
	updateEnergy();
    }

    /**
     * addCreature adds a creature to the World.
     *
     @param Organism o
    */
    public void addCreature(Organism o) {
	creatures.add(o);
    }

    /*
     * updateEnergy() updates the worldEnergy total for the current day.
     */
    private void updateEnergy() {
	worldEnergy = 0;
	for(Organism o : creatures)
            if(o.getStatus() == Organism.ALIVE)
                worldEnergy += (long) o.getEnergyLevel();
    }
	
    /*
     * updateCreatures() runes updateEnergyLevel() for each organism.
     */
    private void updateCreatures() {
        deaths = 0;
	for(Organism o : creatures) {
	    if(o.updateEnergyLevel() == Organism.DEAD)
                deaths++;   
        }
    }
    
    /**
     * update() will advance the World ONE day.
     */
    public void update() {
	update(1);
    }

    /**
     * This version of update will advance the World a given number of days.
     *
     @param in daysToPass - Number of days to advance the World.
    */
    public void update(int daysToPass) {
        days += daysToPass;
	while(daysToPass-- > 0)
	    updateCreatures();
	updateEnergy();
    }

    /**
     * totalEnergy returns the sum of all the energy between all the organisms
     * in the world.
     *
     @return long - total energy in the World.
    */
    public long totalEnergy() {
	return worldEnergy;
    }

    /**
     * printCreatureList prints the toString() method of each creature in the
     * World.
     */
    public void printCreatureList() {
	System.out.println("::Creature List::\n");
	for(Organism o : creatures) 
	    System.out.println(o.toString());	
    }
    
    public String toString() {
	return "::==World Statistics==::\n" +
	    "Total Creatures: " + creatures.size() + "\n" +
	    "Total Living: " + (creatures.size() - deaths) + "\n" +
            "Total Days: " + days + "\n" +
	    "Total Energy: " + totalEnergy() + "\n" +
               "::====================::\n";
    }
    
	    
}
