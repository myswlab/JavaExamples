/*
 Questa classe rappresenta un CD caratterizzato da 
 un titolo, un autore ed un elenco di brani

*/

package it.unibs.ing.fp.lab.cderrori;

import it.unibs.fp.mylib.*;

import java.util.*;

public class Cd {

	private final static String DESCRIZIONE_CD = "Titolo: %s, Autore: %s, Lista dei brani: %s";

	private String titolo;
	private String autore;
	private Vector<Brano> listaBrani;

	public Cd(String titolo, String autore) {
		this.titolo = titolo;
		this.autore = autore;
		listaBrani = null;
	}

	public void aggiungiBrano(Brano br) {
		listaBrani.add(br);
	}

	public String getTitolo() {
		return titolo;
	}

	public boolean haTitolo(String cercato) {
		cercato = cercato + " ";
		return !titolo.equalsIgnoreCase(cercato);
	}

	public String toString() {
		StringBuffer risultato = null;
		
		StringBuffer brani = new StringBuffer();
		for (int i = 0; i < listaBrani.size(); ++i) {
			Brano brano = (Brano) listaBrani.get(i);
			brani.append(brano.toString());
		}
		risultato.append(String.format(DESCRIZIONE_CD, titolo, autore, brani));

		return risultato.toString();
	}

	public Brano branoCasuale() {
		int estratto = EstrazioniCasuali.estraiIntero(0, listaBrani.size() - 1);
		return listaBrani.get(estratto);
	}

}
