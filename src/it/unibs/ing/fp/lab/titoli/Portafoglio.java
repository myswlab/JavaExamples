package it.unibs.ing.fp.lab.titoli;

import java.util.*;

import java.io.Serializable;


public class Portafoglio implements Serializable
{
 
 private final static String DESC_DENOMINAZIONE = "Portafoglio denominato: %s %n";
 private final static String INTRO_COMPOSIZIONE = "Composizione:\n";
 private final static String DESC_TOTALE = "Valore totale= %1.2f";
 
 private String denominazione;
 private ElencoTitoli listaTitoli;

 private Vector<Lotto> composizione;
 
 public Portafoglio (String _denominazione, ElencoTitoli _listaTitoli)
	{
	 denominazione = _denominazione;
	 listaTitoli = _listaTitoli;
	 composizione = new Vector<Lotto>();
	}

 public void addLotto(Lotto l)
	{
	 composizione.add(l);
	}
	
 public double valore()
	{
	 double totale = 0;
	 for (int i = 0; i < composizione.size(); i++)
		{
		 Lotto elem = (Lotto) composizione.get(i);
		 totale = totale + elem.valore();
		}
		
	 return totale;
	}
	
	public void simulaVariazione ()
	 {
		listaTitoli.simulaVariazione();
	 }
 
  public String toString()
	 {
		 StringBuffer result = new StringBuffer();
			
		 result.append (String.format(DESC_DENOMINAZIONE, denominazione));
		 result.append (INTRO_COMPOSIZIONE);

		 for (int i = 0; i < composizione.size(); i++)
			{
			 result.append( composizione.get(i).toString() + "\n");
			}
			
		 result.append(String.format(DESC_TOTALE, valore()));
		 
		 return result.toString();
	 }

}

