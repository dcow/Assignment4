import tester.*;

public class Driver {
    
    public static void main(String[] args) {
	
	World Alagaesia = new World();  
        //Alagaesia is the name of the fantasy world from the Eragon book series
	
        /* Create a bunch of organisms.*/
	Organism[] orgos = new Organism[]{
	    new Cactus(), new CscMajor(),
	    new Mouse(), new Lizard(),
	    new Otter(), new Spider(),
	};
	
        /*Add each organism to the World*/
	for(int i = 0; i < orgos.length; i++) 
            {
                Alagaesia.addCreature(orgos[i]);
            }
        
        /*Advance the world and periodically print the status*/
	Alagaesia.update();
	System.out.println(Alagaesia.toString());
        Alagaesia.printCreatureList();
	
	Alagaesia.update(7);
	System.out.println(Alagaesia.toString());
        //Alagaesia.printCreatureList();
        
	Alagaesia.update(23);
	System.out.println(Alagaesia.toString());
        //Alagaesia.printCreatureList();
        
	Alagaesia.update(334);
	System.out.println(Alagaesia.toString());
        Alagaesia.printCreatureList();
        /*One year has been simulated (= */

        /* Unit Test Time!!!!! */
        
        testUpdate(new Tester());
        
    }

    public static void testUpdate(Tester t) {
        Lizard liz = new Lizard();
        t.checkExpect(liz.getEnergyLevel(), 1000, "Initial Energy Check");
        liz.updateEnergyLevel();
        t.checkExpect(liz.getEnergyLevel(), 990, "First Update Check");
        for(int i = 0; i < 89; i++)
            liz.updateEnergyLevel();
        t.checkExpect(liz.getEnergyLevel(), 100, "First Threshold Check");
        liz.updateEnergyLevel();
        t.checkExpect(liz.getEnergyLevel(), 95, "Threshold Condidtion Check");

        Tester.runReport(t, true, true);
    }

}

