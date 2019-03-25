package it.unibs.ing.fp.lab.traffico;

import it.unibs.ing.fp.lab.mylib.*;



public class TrafficoMain {

	final private static int NUMRIGHE_STRADA = 5;
	final private static int NUMCOLONNE_STRADA = 20;
	
	final private static String MSG_INIZIALE = "Strada inizializzata:";
	final private static String MSG_CONTINUA = "Proseguire la simulazione ?";
	
	
	public static void main(String[] args) 
   {
		
		Strada strada = new Strada(NUMRIGHE_STRADA,NUMCOLONNE_STRADA);
		
		strada.inizializza();

		System.out.println(MSG_INIZIALE);
		System.out.println(strada); 
		
			while ( InputDati.yesOrNo(MSG_CONTINUA) ) 
			{
				strada.evoluzione();
				System.out.println(strada);
			} 
		}

}

