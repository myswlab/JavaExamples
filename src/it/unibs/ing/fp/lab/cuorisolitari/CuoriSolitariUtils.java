package it.unibs.ing.fp.lab.cuorisolitari;

import it.unibs.fp.mylib.InputDati;

public class CuoriSolitariUtils {
	
	static CuoreSolitario leggiCuoresolitario() {
		CuoreSolitario cs = new CuoreSolitario();
		
		leggiPseudonimo(cs);
		leggiSesso(cs);
		leggiEta(cs);
		
		return cs;
	}

	private static void leggiPseudonimo(CuoreSolitario cs) {
		String pseudonimo = null;
		
		do {
			pseudonimo = InputDati.leggiStringaNonVuota("Pseudonimo: ");
			if(pseudonimo==null || pseudonimo.isEmpty()) {
				System.out.println("ERRORE: lo pseudonimo è obbligatorio");
			}
		} while(pseudonimo==null || pseudonimo.isEmpty()) ;
		
		cs.setPseudonimo(pseudonimo);
	}

	private static void leggiEta(CuoreSolitario cs) {
		Integer eta = 0;
		do {
			eta = InputDati.leggiIntero("Età: ");
			if(eta < 18) {
				System.out.println("ERRORE: servizio disponibile solo per maggioreni");
			}
		} while(eta<18) ;
		cs.setEta(eta);
	}

	private static void leggiSesso(CuoreSolitario cs) {
		String sessoString;
		Genere sesso = null;
		
		do {
			sessoString = InputDati.leggiStringaNonVuota("Sesso (M|F):");
			if("M".equalsIgnoreCase(sessoString)) {
				sesso = Genere.M;
			} else if("F".equalsIgnoreCase(sessoString)) {
				sesso = Genere.F;
			} else {
				System.out.println("ERRORE: inserire M oppure F");
			}
		} while(sesso == null);
		
		cs.setSesso(sesso);
	}
	
}
