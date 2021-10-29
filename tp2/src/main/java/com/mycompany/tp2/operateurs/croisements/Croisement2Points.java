package operateurs.croisements;


import Configurations.Config;

import variables.Individu;

public class Croisement2Points extends Croisement{

	Individu offspring1;
	Individu offspring2; 
	Config config;

	public Croisement2Points(Individu parent1, Individu parent2, double _xProbability, Config cfg) {
		super(parent1, parent2, _xProbability);

		// TODO
		//A completer
	}

	@Override
	public void doCross(Individu parent1, Individu parent2) {
            
            offspring1 = new Individu(parent1.getChromosome().getGenotype());
            offspring2 = new Individu(parent2.getChromosome().getGenotype());
            int count=0;
            while(count<2){
                double alea = config.getRandom();
                if (alea <= super.getXProbability()){
                    doCross(parent1, parent2);
                    count++;
                }
            }
            
            
            
            
		// TODO
		//A completer
	}

	public Individu getOffspring(int i){
		// TODO
		//A completer
		return null; //A corriger
	}

	public double getRandomValue(){
		return config.getRandom();
	}
}
