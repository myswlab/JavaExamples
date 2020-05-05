/*
 Questa classe rappresenta un archivio CD costituito da un 
 Vector di istanze della classe CD e fornisce i metodi per la sua 
 gestione
*/

package it.unibs.ing.fp.lab.cd;

import it.unibs.fp.mylib.*;

import java.util.*;



public class ArchivioCd {

	private final static String RANDOM_PLAY = "Il brano selezionato è:";

	private final static String MESS_ARCHIVIO_VUOTO = "Attenzione l'archivio non contiene alcun CD!";

	private final static String INTESTAZIONE_CD = "%n CD n° %d DELLA COLLEZIONE%n";

	private List<Cd> listaCD;

	public ArchivioCd() {
		listaCD = new ArrayList<Cd>();
	}

	/**
	 * 
	 * @param titRichiesto
	 * @return null se CD non è trovato
	 */
	public Cd trovaCD(String titRichiesto) {
		Cd elemento = null;

		for (int i = 0; i < listaCD.size(); i++) {
			elemento = listaCD.get(i);
			if (elemento.haTitolo(titRichiesto))
				return elemento;
		}
		return null;
	}

	public void eliminaCd(Cd cd) {
		listaCD.remove(cd);
	}
	
	public void eliminaCd(String titolo) {
		Cd cd = trovaCD(titolo);
		if (cd != null)
			this.eliminaCd(cd);
	}

	public void selezioneCasuale() {
		if (listaCD.size() == 0)
			System.out.println(MESS_ARCHIVIO_VUOTO);
		else {
			int numeroCD = listaCD.size();
			int estratto = EstrazioniCasuali.estraiIntero(0, numeroCD - 1);
			Cd selCD = listaCD.get(estratto);
			Brano selBrano = selCD.branoCasuale();
			System.out.print(RANDOM_PLAY);
			System.out.println(selBrano.toString());
		}
	}

	public String toString() {
		if (listaCD.size() == 0)
			return MESS_ARCHIVIO_VUOTO;
		else {
			StringBuffer risultato = new StringBuffer();
			for (int i = 0; i < listaCD.size(); i++) {
				risultato.append(String.format(INTESTAZIONE_CD, i + 1));
				Cd elemento = listaCD.get(i);
				risultato.append(elemento.toString());
			}
			return risultato.toString();
		}
	}

	public void aggiungiCd(Cd disco) {
		listaCD.add(disco);
	}

	public int getNumeroCd() {
		return listaCD.size();
	}

	public boolean contiene(String titolo) {
		return trovaCD(titolo) != null;
	}

}
