package it.unibs.ing.fp.lab.titoli;
import java.io.*;

import it.unibs.ing.fp.lab.mylib.*;


public class TitoliMain
{
  final private static String NOMEFILETITOLI = "archiviotitoli.dat";
  final private static String MSG_NO_CAST = "ATTENZIONE PROBLEMI CON IL CAST";
  final private static String MSG_OK_FILE = "CARICAMENTO DA FILE EFFETTUATO";
  final private static String MSG_NO_FILE = "NON POSSO CARICARE DA FILE: ESEGUO CREAZIONE DA ZERO";
  final private static String MSG_INTRO_PORTFOLIO = "SITUAZIONE PORTAFOGLIO";
  final private static String MSG_PROCEDI = "PROCEDERE CON LA SIMULAZIONE ?";
  final private static String MSG_SALVA = "SALVATAGGIO DATI";
  final private static String MSG_SALUTO = "GRAZIE PER AVER USATO IL NOSTRO PROGRAMMA";
  final private static String MSG_INTRO_GIORNO = "GIORNO N.%d NUOVA SITUAZIONE INVESTIMENTI";
  
  public static void main (String [] args)
	 {
	  File fTitoli = new File(NOMEFILETITOLI);
		  
	  Portafoglio patrimonio = null;
	  
	  ElencoTitoli listaTitoli = null;
	  
	  Contenitore container = null;
		
	  boolean caricamentoRiuscito = false;
		
	  if ( fTitoli.exists() )
		{
		 try 
		  {
			 container = (Contenitore)ServizioFile.caricaSingoloOggetto(fTitoli);
			 listaTitoli = container.getElencoTitoli();
			 patrimonio = container.getPortafoglio();
		   }
		  catch (ClassCastException e)
		   {
			 System.out.println(MSG_NO_CAST);
			}
		   finally
			{
		      if ( (patrimonio != null) && (listaTitoli != null) )
			    {
				 System.out.println(MSG_OK_FILE);
				 caricamentoRiuscito = true;
				 }
			  }
			
		 }
			
		 if (!caricamentoRiuscito)
		   {
			System.out.println(MSG_NO_FILE);
			listaTitoli = UtilitaTitoli.creaElencoTitoli();
			patrimonio = UtilitaTitoli.creaPatrimonio(listaTitoli);
		    }
			
		 System.out.println(MSG_INTRO_PORTFOLIO);
		 System.out.println(patrimonio);
			
		 int giorni = 0;
		 while (InputDati.yesOrNo(MSG_PROCEDI))
			{
			 giorni++;
			 listaTitoli.simulaVariazione();
			 System.out.println(String.format(MSG_INTRO_GIORNO, giorni));
		 	 System.out.println(patrimonio);
			}
			
			System.out.println(MSG_SALVA);
			container = new Contenitore(listaTitoli,patrimonio);
			ServizioFile.salvaSingoloOggetto(fTitoli, container);
			
		    System.out.println(MSG_SALUTO);
					
	 }

}




