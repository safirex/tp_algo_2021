package operateurs.mutations;

import Configurations.Config;
import java.util.BitSet;

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
		return swap();
		
	}
	
	public double getRandomValue(){
		return config.getRandom();
	}
        
        /**
         * set a randomly chosen gene right after the first one
         * @return 
         */
        public Individu insert(){
            int gene1 = (int)getRandomValue();
            int gene2 = (int)getRandomValue();
            
            BitSet tmpGene = individu.getAllele(gene1+1).getBitValue();
            
           
            individu.setBitAllele(gene1+1, 
                    individu.getAllele(gene2).getBitValue());
            
            
            
            for(int i= gene1;Math.abs(i)<gene1+gene2; i+=gene1-gene2){
                 
            }
            
            return individu;
        }
        
        /**
         * swap the gene value between 2 gene randomly chosen
         * @return 
         */
        public Individu swap(){
            int gene1 = (int)getRandomValue();
            int gene2 = (int)getRandomValue();
            BitSet tmpGene = individu.getAllele(gene1).getBitValue();
            
            individu.setBitAllele(gene1, 
                    individu.getAllele(gene2).getBitValue());
            
            individu.setBitAllele(gene2,tmpGene);
            
            return individu;
        }
        
        
        
        
        
}
