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
	
	public Individu doSelect(){
		return pop.get((int)Math.random()*pop.size());
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
