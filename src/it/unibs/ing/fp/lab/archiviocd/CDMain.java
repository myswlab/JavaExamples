/*
 Questa classe contiene il metodo principale ed un metodo
 ausiliario per la gestione di un archivio CD
*/

package it.unibs.ing.fp.lab.archiviocd;
import it.unibs.ing.fp.lab.mylib.*;

public class CDMain {

  final private static String BENVENUTO = "\nProgramma per la gestione dell'Archivio CD\n\n";
  final private static String MESS_USCITA = "Vuoi veramente uscire ?";
  final private static String MESS_FINALE = "Fine programma";
  final private static String TITOLO = "Elenco Funzionalita'";
  
  final private static String ERRORE_FUNZIONE = "La funzione non rientra tra quelle disponibili !";
  final private static String MESS_ALTRA_OPZIONE = "Selezionare un'altra opzione.";
  
  final private static String [] VOCIMENU = {"Inserisci nuovo CD","Rimuovi CD dall'archivio","Visualizza CD", "Visualizza intera collezione", "Selezione casuale"};

  public static void main(String[] args) 
  {
	boolean fineProgramma = false;

	System.out.println(BENVENUTO);

	ArchivioCD mieiDischi = new ArchivioCD();
		
	MyMenu menuMain = new MyMenu (TITOLO, VOCIMENU);

	do 
	{
	  int selezione = menuMain.scegli();

	  fineProgramma = eseguiFunzioneScelta(selezione, mieiDischi);

	} while (!fineProgramma);

	System.out.println(MESS_FINALE);

  }

		
  private static boolean eseguiFunzioneScelta(int numFunzione, ArchivioCD archivio) 
  {
 
	switch (numFunzione) 
	{

	case 0: // Esci
	  return InputDati.yesOrNo(MESS_USCITA);
	//break; // ! Superfluo e non solo ... (non compila)

	case 1: // Inserisci
	  archivio.inserisciNuovoCD();
	break;

	case 2: // Rimuovi
	  archivio.rimuoviCD();
	break;

	case 3: // Visualizza
	  archivio.visualizzaCD();
	break;

	case 4: // Visualizzazione completa
	  System.out.println(archivio.toString());
	break;
				
	case 5: // Selezione Casuale
	  archivio.selezioneCasuale();
	break;

	default: // Se i controlli nella classe Menu sono corretti, questo non viene mai eseguito !
	  System.out.println(ERRORE_FUNZIONE);
	  System.out.println(MESS_ALTRA_OPZIONE);
	break;
	}

	return false;

  }


}
