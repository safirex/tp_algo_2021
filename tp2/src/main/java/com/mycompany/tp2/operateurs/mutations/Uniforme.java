package operateurs.mutations;

import Configurations.Config;

import variables.Individu;


public class Uniforme {

	private Individu individu;
	private double probability;
	private Config config;
	

	public Uniforme (Individu individu, double probability, Config cfg){
		this.individu = individu;
		this.probability = probability;
		config = cfg;
	}
	
	public Individu doMutate(){

		// TODO
		//A completer
		return individu;
		
	}
	
	public double getRandomValue(){
		return config.getRandom();
	}
}
