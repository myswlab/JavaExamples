package it.unibs.ing.fp.esercizi_laboratorio.titoli;
import java.io.Serializable;

public class Contenitore implements Serializable{
	
	private ElencoTitoli elencoTitoli;
	private Portafoglio portafoglio;
	
	public Contenitore (ElencoTitoli _elencoTitoli, Portafoglio _portafoglio)
	{
		elencoTitoli=_elencoTitoli;
		portafoglio = _portafoglio;
		
	}
	
	public ElencoTitoli getElencoTitoli()
	{
		return elencoTitoli;
	}
	
	public Portafoglio getPortafoglio()
	{
		return portafoglio;
	}
}
