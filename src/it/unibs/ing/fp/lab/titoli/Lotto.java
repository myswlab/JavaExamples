package it.unibs.ing.fp.lab.titoli;

import java.io.Serializable;

public class Lotto implements Serializable
{
 private Titolo azione;
 private int quantita;
	
 public Lotto (Titolo _azione, int _quantita)
	{
	 azione = _azione;
	 quantita = _quantita;
	}
	
 public double valore ()
	{
	 return quantita*azione.getPrezzo();
	}
	
 public String toString ()
	{
	 return quantita + " " + azione.toString();
	}

}

