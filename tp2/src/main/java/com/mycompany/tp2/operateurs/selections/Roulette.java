package operateurs.selections;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

import Configurations.Config;

import variables.Individu;
import variables.Population;


public class Roulette {

	private List<Individu> pop = new ArrayList();
	
	private Config config;
	
	public Roulette(List<Individu> _pop, Config cfg){
		this.pop = _pop;
		config = cfg;
	}
	
        /**
         * 
         * @return a randomly selected individual 
         */
	public Individu doSelect(){
            int randFit = (int) (Math.random()*sumFitness(pop));
            float addedFitness =0;
            for (Individu elem :pop ){
                addedFitness +=elem.getFitness();
                if(addedFitness>randFit){
                    //first selected individual
                    return elem;
                }
            }
            throw new UnknownError();
	}
	
	public double sumFitness(List<Individu> pop){
            float generationFitness=0;
            for (Individu elem :pop ){
                generationFitness+=elem.getFitness();
            }
            //calcul moyen de fitness de la generation
            generationFitness/=pop.size();
            return generationFitness; 
	}
}
