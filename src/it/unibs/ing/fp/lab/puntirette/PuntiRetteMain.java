package it.unibs.ing.fp.lab.puntirette;
import it.unibs.ing.fp.lab.mylib.*;
import java.io.*;

/*
 Questa classe riceve in ingresso le coordinate di due punti e 
 ne calcola la distanza. 
 Quindi se i punti sono distinti:
	- visualizza l'equazione della retta congiungente
	- richiede le coordinate di un terzo punto e verifica se
 	  appartiene alla stessa retta
 */

public class PuntiRetteMain
{

 public static Punto creaPunto(String descrizionePunto) throws IOException
	{
	 double x = InputDati.leggiDouble(descrizionePunto + ": inserisci la coordinata x ");
 	 double y = InputDati.leggiDouble(descrizionePunto + ": inserisci la coordinata y ");
     return new Punto(x ,y);
	}

 public static void main (String args []) throws IOException
	{
	 Punto p1 = creaPunto("primo punto");
	 Punto p2 = creaPunto("secondo punto");
		
	 double distanza = p1.distanzaDa(p2);	
		
	 System.out.println("La distanza tra i due punti e': " + distanza);
	
	 if (p1.equals(p2))
		System.out.println("I due punti coincidono ! Impossibile calcolare la retta");
	 else
		{
	 		Retta r = new Retta(p1, p2);
		
	 		System.out.println(r.toString());
		
		  Punto p3  = creaPunto("terzo punto");
		
		  boolean allineato = r.appartiene(p3);
			
			System.out.print("Il punto ");
			if (!allineato)
			 	System.out.print("non ");
			System.out.println("appartiene alla retta"); 
			
	   } // else

  } // main

} // class

