package it.unibs.ing.fp.esercizi_lezione.agenda;

import it.unibs.fp.mylib.MyMenu;

public class Agenda {
	public static int NUM_GIORNI_SETTIMANA = 7;
	private final static String INTESTAZIONE_MENU = "MENU PRINCIPALE DI GESTIONE AGENDA";
	private final static String [] VOCI_MENU ={"Gestione di una singola pagina", "Visualizzazione dell'intera agenda"};
	final private static String MESS_PAGINA = "Inserire il numero della pagina su cui operare ";
	private Pagina [] contenuto;

	public Agenda (int numeroGiorni, int primoGiorno)
	{
		contenuto = new Pagina[numeroGiorni];
		int giornoCorrente = primoGiorno;
		for (int i = 0; i < numeroGiorni; i++)
		{
			contenuto[i] = new Pagina(i+1, giornoCorrente);
			giornoCorrente = (giornoCorrente%NUM_GIORNI_SETTIMANA)+1;
		}
	}
	public void usaAgenda()
	{
		MyMenu menuAgenda = new MyMenu(INTESTAZIONE_MENU, VOCI_MENU);
		boolean finito = false;
		do {
			int scelta = menuAgenda.scegli();
			switch (scelta) {
			case 0: finito = true; break;
			case 1: gestionePagina(); break;
			case 2: visualizza();
			}
		}while(!finito);

	}
	public void visualizza()
	{
		System.out.println(toString());
	}

	public String toString ()
	{
		StringBuffer risultato = new StringBuffer();
		for (int i = 0; i < contenuto.length; i++)
			risultato.append(contenuto[i].toString() + MyUtil.ACAPO);
		return risultato.toString();
	}
	private void gestionePagina()
	{
		Pagina selezionata = scegliPagina();
		selezionata.usaPagina();
	}
	private Pagina scegliPagina()
	{
		int numeroScelto=MyUtil.leggiIntero(MESS_PAGINA,1,contenuto.length) - 1;
		return contenuto[numeroScelto];
	}
}
