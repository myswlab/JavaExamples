package it.unibs.ing.fp.lab.TamaZooErrori;

import it.unibs.ing.fp.lab.mylib.*;

public class GestoreTamaZoo {

	private final static String MSG_BENVENUTO = "BENVENUTO NELLA GESTIONE DEI TAMAGOTCHI";
	private final static String MSG_SALUTI = "TORNA PRESTO NEL MONDO DEI TAMAGOTCHI";
	private final static String MSG_ESTINTI = "PURTROPPO NON CI SONO TAMAGOTCHI SOPRAVVISSUTI - IL PROGRAMMA TERMINA";

	private final static String MSG_NO_OP = "Operazione non riconosciuta.";

	private final static String RICHIESTA_NUMERO = "QUANTI TAMAGOTCHI VUOI CREARE?";
	private final static String PREMESSA_INSERIMENTO = "INSERIMENTO DEL NOME DEL TAMAGOCTHI NUMERO ";

	private final static String RICHIESTA_NOME = "Inserisci il nome del tuo Tamagotchi:";

	private final static String MSG_BISCOTTI = "Verranno somministrati %d biscotti a ciascun Tamagotchi%n%n";
	private final static String MSG_CAREZZE = "Verranno somministrate %d carezze a ciascun Tamagotchi%n%n";

	private final static int NUMERO_SPECIE = 3;
	private final static int MODELLO_BASE = 1;
	private final static int TAMATRISTE = 2;
	private final static int TAMAGORDO = 3;

	private final static String[] MAIN_MENU_ITEMS = { "Dai biscotti", "Dai carezze" };
	private final static String MAIN_QUESTION = "Scegli l'operazione da eseguire";

	private final static int MIN_BISCOTTI = 1;
	private final static int MAX_BISCOTTI = 8;

	private final static int MIN_CAREZZE = 1;
	private final static int MAX_CAREZZE = 10;

	private static TamaZoo mioZoo = new TamaZoo();

	private static void benvenuto() {
		System.out.println(MSG_BENVENUTO);
		System.out.println();
	}

	private static void saluti() {
		System.out.println(MSG_SALUTI);
		System.out.println();
	}

	public static void main(String[] args) {
		benvenuto();
		int numeroTamagotchi = InputDati.leggiInteroPositivo(RICHIESTA_NUMERO);

		for (int i = 1; i <= numeroTamagotchi; i++) {
			System.out.println(PREMESSA_INSERIMENTO + i);
			Tamagotchi nuovo = creaTamagotchi();
			mioZoo.inserisci(nuovo);
		}

		MyMenu principale = new MyMenu(MAIN_QUESTION, MAIN_MENU_ITEMS);

		boolean fine = false;

		do {
			int voceSelezionata = principale.scegli();

			switch (voceSelezionata) {
			case 1:
			case 2:
				int numBiscotti = NumeriCasuali.estraiIntero(MIN_BISCOTTI, MAX_BISCOTTI);
				System.out.printf(MSG_BISCOTTI, numBiscotti);
				mioZoo.daiBiscotti(numBiscotti);
				break;
			case 3:
				int numCarezze = NumeriCasuali.estraiIntero(MIN_CAREZZE, MAX_CAREZZE);
				System.out.printf(MSG_CAREZZE, numCarezze);
				mioZoo.daiCarezze(numCarezze);
				break;
			case 0:
				fine = true;
				saluti();
				break;
			default:
				System.out.println(MSG_NO_OP);
				break;
			}// switch

			if (!mioZoo.ciSonoVivi()) {
				fine = true;
				System.out.println(MSG_ESTINTI);
			}

		} while (!fine);

	}

	public static Tamagotchi creaTamagotchi() {
		String nome = InputDati.leggiStringaNonVuota(RICHIESTA_NOME);
		int specie = NumeriCasuali.estraiIntero(1, NUMERO_SPECIE);
		Tamagotchi nuovo = null;
		int affetto, sazieta;

		switch (specie) {
		case MODELLO_BASE:
			affetto = NumeriCasuali.estraiIntero(0, Tamagotchi.MAX_AFFETTO);
			sazieta = NumeriCasuali.estraiIntero(0, Tamagotchi.MAX_SAZIETA);
			nuovo = new Tamagotchi(nome, affetto, sazieta);
			break;
		case TAMATRISTE:
			sazieta = NumeriCasuali.estraiIntero(0, Tamagotchi.MAX_SAZIETA);
			nuovo = new TamaTriste(nome, sazieta);
			break;
		case TAMAGORDO:
			sazieta = NumeriCasuali.estraiIntero(0, Tamagotchi.MAX_SAZIETA);
			nuovo = null;
			break;
		}
		return nuovo;
	}

}
