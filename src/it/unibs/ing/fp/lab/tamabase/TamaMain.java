package it.unibs.fp.tamabase;

import it.unibs.fp.mylib.InputDati;
import it.unibs.fp.mylib.MyMenu;

public class TamaMain {

	private final static String SALUTO = "Benvenuti nel mondo dei Tamagotchi";

	private final static String RICHIESTA_NOME = "Inserisci il nome del tuo Tamagotchi:";
	private final static String RICHIESTA_SAZIETA = "Inserisci il valore iniziale della sazieta' del tuo Tamagotchi:";
	private final static String RICHIESTA_AFFETTO = "Inserisci il valore iniziale della soddisfazione affettiva del tuo Tamagotchi:";

	private final static String SCEGLI_BISCOTTI = "Dai biscotti al Tamagotchi";
	private final static String SCEGLI_CAREZZE = "Dai carezze al Tamagotchi";
	private final static String TITOLO = "Scegli un'opzione";
	private final static String [] SCELTA_AZIONE = {
			SCEGLI_BISCOTTI,
			SCEGLI_CAREZZE
	};

	private final static String RICHIESTA_BISCOTTI = "Inserire il numero di biscotti da dare al Tamagotchi:";
	private final static String RICHIESTA_CAREZZE = "Inserire il numero di carezze da dare al Tamagotchi:";

	private final static int MAX_BISCOTTI = 20;
	private final static int MAX_CAREZZE = 20;

	public static void main(String[] args) {

		System.out.println(SALUTO);
		
		int scelta = 0;
		Tamagotchi tamagotchi = creaTamagotchi();
		
		MyMenu menu = new MyMenu(TITOLO, SCELTA_AZIONE);
		do {
			scelta = menu.scegli();
			switch (scelta) {
			case 1:
				// aggiungi carezze
				int numBiscotti = InputDati.leggiIntero(RICHIESTA_BISCOTTI, 1, MAX_BISCOTTI);
				tamagotchi.daiBiscotti(numBiscotti);
				break;
			case 2:
				// aggiungi carezze
				int numCarezze = InputDati.leggiIntero(RICHIESTA_CAREZZE, 1, MAX_CAREZZE);
				tamagotchi.daiCarezze(numCarezze);
				break;
			default:
				break;
			}
			System.out.println(tamagotchi);

		} while (scelta != 0);

	}

	public static Tamagotchi creaTamagotchi() {
		String nome = InputDati.leggiStringaNonVuota(RICHIESTA_NOME);
		int affetto = InputDati.leggiIntero(RICHIESTA_AFFETTO, 0, Tamagotchi.MAX_AFFETTO);
		int sazieta = InputDati.leggiIntero(RICHIESTA_SAZIETA, 0, Tamagotchi.MAX_SAZIETA);
		return new Tamagotchi(nome, affetto, sazieta);
	}

}
