package it.unibs.ing.fp.esercizi_laboratorio.titoli;

import it.unibs.ing.fp.esercizi_laboratorio.mylib.*;

import java.io.Serializable;

public class Titolo implements Serializable
{
 private final static double MAXRIBASSO = -20.0/100.0;
 private final static double MAXRIALZO = +20.0/100.0;
 
 private final static String DESCRIZIONE = "%s: prezzo= %1.3f";

 private String nome;
 private double prezzo;
	
 public Titolo (String _nome, double _prezzo)
	{
	 nome = _nome;
	 prezzo = _prezzo;
	}
	
 public String toString ()
	{
	 return String.format(DESCRIZIONE, nome ,prezzo); 
	}
	
 public double getPrezzo()
	{
	 return prezzo;
	}
	
 public void variazGiornaliera()
	{
	 prezzo = prezzo + (prezzo * NumeriCasuali.estraiDouble(MAXRIBASSO, MAXRIALZO) );
	}

}

