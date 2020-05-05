/*
 Questa classe contiene il metodo principale ed un metodo
 ausiliario per la gestione di un archivio CD
*/

package it.unibs.ing.fp.lab.cderrori;

import it.unibs.fp.mylib.*;

public class CdMain {

	private final static String MESS_TITOLO = "Inserisci il titolo del CD da inserire > ";
	private final static String MESS_AUTORE = "Inserisci l'autore del CD > ";
	private final static String MESS_TITOLO_BRANO = "Inserisci il titolo del brano > ";
	private final static String INTESTA_BRANO = "Brano n.";
	private final static String MESS_DURATA_BRANO = "Inserisci la durata del brano in secondi > ";
	private final static String MESS_BRANI = "Inserimento dei brani del CD ";
	private final static String MESS_ALTRO_BRANO = "Vuoi inserire un altro brano?";
	private final static String MESS_CERCACD = "Inserisci il titolo del CD > ";
	private final static String MESS_NON_TROVATO = "CD richiesto non trovato";

	private final static String MESS_RIMOZIONE = " : confermi la rimozione di questo CD ?";

	private final static String MESS_DOPPIONE = "Attenzione: non si puo' inserire un titolo gia' esistente!";
	private final static int DURATA_MINIMA = 1;

	final private static String BENVENUTO = "\nProgramma per la gestione dell'Archivio CD\n\n";
	final private static String MESS_USCITA = "Vuoi veramente uscire ?";
	final private static String MESS_FINALE = "Fine programma";
	final private static String TITOLO = "Elenco Funzionalita'";

	final private static String ERRORE_FUNZIONE = "La funzione non rientra tra quelle disponibili !";
	final private static String MESS_ALTRA_OPZIONE = "Selezionare un'altra opzione.";

	final private static String[] VOCIMENU = { "Inserisci nuovo CD", "Rimuovi CD dall'archivio", "Visualizza CD",
			"Visualizza intera collezione", "Selezione casuale" };

	public static void main(String[] args) {
		boolean fineProgramma = false;
		System.out.println(BENVENUTO);
		ArchivioCd mieiDischi = new ArchivioCd();
		MyMenu menuMain = new MyMenu(TITOLO, VOCIMENU);
		do {
			int selezione = menuMain.scegli();
			fineProgramma = eseguiFunzioneScelta(selezione, mieiDischi);
		} while (!fineProgramma);
		System.out.println(MESS_FINALE);
	}

	public static Cd trovaCD(ArchivioCd archivioCD) {
		String titCD = InputDati.leggiStringaNonVuota(MESS_CERCACD);
		return archivioCD.trovaCD(titCD);
	}

	public static void inserisciNuovoCD(ArchivioCd archivioCD) {
		String titolo = InputDati.leggiStringaNonVuota(MESS_TITOLO);
		if (archivioCD.trovaCD(titolo) != null)
			System.out.println(MESS_DOPPIONE);
		else {
			String autore = InputDati.leggiStringaNonVuota(MESS_AUTORE);
			Cd disco = new Cd(titolo, autore);
			System.out.println(MESS_BRANI + titolo);
			int count = 1;
			do {
				System.out.println(INTESTA_BRANO + count);
				String titBrano = InputDati.leggiStringaNonVuota(MESS_TITOLO_BRANO);
				int durata = InputDati.leggiInteroConMinimo(MESS_DURATA_BRANO, DURATA_MINIMA);
				Brano b = new Brano(titBrano, durata);
				disco.aggiungiBrano(b);
				count++;
			} while (InputDati.yesOrNo(MESS_ALTRO_BRANO));

			archivioCD.aggiungiCd(disco);
		} // else
	}

	private static boolean eseguiFunzioneScelta(int numFunzione, ArchivioCd archivio) {

		switch (numFunzione) {

		case 0: // Esci
			return InputDati.yesOrNo(MESS_USCITA);
		// break; // ! Superfluo e non solo ... (non compila)

		case 1: // Inserisci
			inserisciNuovoCD(archivio);
			break;

		case 2: // Rimuovi
			rimuoviCD(archivio);
			break;

		case 3: // Visualizza
			visualizzaCD(archivio);
			break;

		case 4: // Visualizzazione completa
			System.out.println(archivio.toString());
			break;

		case 5: // Selezione Casuale
			archivio.selezioneCasuale();
			break;

		default: // Se i controlli nella classe Menu sono corretti, questo non
					// viene mai eseguito !
			System.out.println(ERRORE_FUNZIONE);
			System.out.println(MESS_ALTRA_OPZIONE);
			break;
		}

		return false;

	}

	public static void visualizzaCD(ArchivioCd archivioCD) {
		Cd elemento = trovaCD(archivioCD);
		if (elemento != null) {
			System.out.println(elemento.toString());
		} else {
			System.out.println(MESS_NON_TROVATO);
		}
	}

	public static void rimuoviCD(ArchivioCd archivioCD) {
		Cd elemento = trovaCD(archivioCD);
		if (elemento != null) {
			boolean procedi = InputDati.yesOrNo(elemento.getTitolo() + MESS_RIMOZIONE);
			if (procedi) {
				archivioCD.eliminaCd(elemento);

			}
		} else
			System.out.println(MESS_NON_TROVATO);
	}

}
