/*
 Questa classe rappresenta un archivio CD costituito da un 
 Vector di istanze della classe CD e fornisce i metodi per la sua 
 gestione
*/

package it.unibs.ing.fp.lab.archiviocd;
import it.unibs.ing.fp.lab.mylib.*;

import java.util.Vector;

public class ArchivioCD {


  private final static String MESS_TITOLO = "Inserisci il titolo del CD da inserire > ";
  private final static String MESS_AUTORE = "Inserisci l'autore del CD > ";
  private final static String MESS_TITOLO_BRANO = "Inserisci il titolo del brano > ";
  private final static String INTESTA_BRANO = "Brano n.";
  private final static String MESS_DURATA_BRANO = "Inserisci la durata del brano in secondi > ";
  private final static String MESS_BRANI = "Inserimento dei brani del CD ";
  private final static String MESS_ALTRO_BRANO = "Vuoi inserire un altro brano?";
  
  private final static String MESS_CERCACD = "Inserisci il titolo del CD > ";
  private final static String MESS_RIMOZIONE = " : confermi la rimozione di questo CD ?";
  private final static String MESS_NON_TROVATO = "CD richiesto non trovato";
  private final static String RANDOM_PLAY = "Il brano selezionato e':";
  private final static String MESS_DOPPIONE = "Attenzione: non si puo' inserire un titolo gia' esistente!";
	
  private final static String MESS_ARCHIVIO_VUOTO = "Attenzione l'archivio non contiene alcun CD!";
  
  private final static String INTESTAZIONE_CD = "%n CD n� %d DELLA COLLEZIONE%n";
  
  private final static int DURATA_MINIMA = 1;

	private Vector<CD> listaCD;

	public ArchivioCD() 
	{
		listaCD = new Vector<CD>(); 
	}



	public void inserisciNuovoCD() 
	{
		
   	    String titolo = InputDati.leggiStringaNonVuota(MESS_TITOLO);
		
		if ( trovaCD(titolo) != null)
		 System.out.println(MESS_DOPPIONE);
		else
		{
		
		 String autore = InputDati.leggiStringaNonVuota(MESS_AUTORE);

		 CD disco = new CD(titolo, autore);

		 System.out.println(MESS_BRANI + titolo); 
		 int count = 1;
		 
		 do 
		  {
			System.out.println(INTESTA_BRANO + count);
			String titBrano = InputDati.leggiStringaNonVuota(MESS_TITOLO_BRANO);
			int durata = InputDati.leggiInteroConMinimo(MESS_DURATA_BRANO,DURATA_MINIMA);
			Brano b = new Brano(titBrano, durata);
			disco.aggiungiNuovoBrano(b);
		    count++;
		  }  while ( InputDati.yesOrNo(MESS_ALTRO_BRANO) );

		listaCD.add(disco);
	 } // else
	}


	public CD trovaCD() 
	 {
		String titCD = InputDati.leggiStringaNonVuota(MESS_CERCACD) ;
		
		return trovaCD(titCD);
	 }
		
		
	public CD trovaCD(String titRichiesto) 
	 {
	   CD elemento = null;

	   for ( int i = 0; i < listaCD.size(); i++ ) 
		 {
			elemento = listaCD.get(i);
			if ( elemento.matchTitolo(titRichiesto) ) 
				return elemento;
		 }
		return null;
	  }

	public void rimuoviCD() 
	{
		CD elemento = trovaCD();

		if ( elemento != null ) 
		 {
			boolean procedi = InputDati.yesOrNo(elemento.getTitolo() + MESS_RIMOZIONE);
			if (procedi)
				listaCD.remove(elemento);
		 } 
		 else 
			System.out.println(MESS_NON_TROVATO);
	}

	public void visualizzaCD() {

		CD elemento = trovaCD();

		if ( elemento != null ) {
			System.out.println(elemento.toString());
		} else {
			System.out.println(MESS_NON_TROVATO);
		}

	}

	public void selezioneCasuale() 
	{
		if (listaCD.size() == 0)
		 System.out.println(MESS_ARCHIVIO_VUOTO);
		else
		{
		 int numeroCD = listaCD.size();
		 int estratto = EstrazioniCasuali.estraiIntero(0, numeroCD-1);

		 CD selCD = listaCD.get(estratto);
		
		 Brano selBrano = selCD.branoRandom();
		
		 System.out.print(RANDOM_PLAY);
		 System.out.println(selBrano.toString());
		}
		

	}
	
	public String toString()
	{
		
     if (listaCD.size() == 0)
	   return MESS_ARCHIVIO_VUOTO; 
     else
     {
	  StringBuffer risultato = new StringBuffer();
	  for (int i=0; i < listaCD.size(); i++)
	   {
		 risultato.append(String.format(INTESTAZIONE_CD, i+1));
		 CD elemento = listaCD.get(i);
		 risultato.append(elemento.toString()); 
	   } 
	  return risultato.toString();
     }
	}

}
