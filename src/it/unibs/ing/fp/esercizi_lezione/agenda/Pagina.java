package it.unibs.ing.fp.esercizi_lezione.agenda;

import it.unibs.fp.mylib.MyMenu;

public class Pagina {
	final private static String PAGINA_VUOTA = "";
	final private static String MESS_NUOVO_TESTO = "Inserire il nuovo testo della pagina numero ";
	private final static String INTESTAZIONE_MENU = "MENU GESTIONE PAGINA ";
	private final static String [] VOCI_MENU = {"Visualizzazione pagina", "Modifica pagina"};
	private String testo;
	private int numero;
	private int giornoDellaSettimana;

	public Pagina (int _numero, int _giornoDellaSettimana)
	{
		testo = PAGINA_VUOTA;
		numero = _numero;
		giornoDellaSettimana = _giornoDellaSettimana;
	}

	public String toString()
	{
		return MyUtil.siglaGiorno(giornoDellaSettimana) + " " + numero + ": " +
				testo;
	}

	public void usaPagina()
	{
		MyMenu menuPagina = new MyMenu(INTESTAZIONE_MENU + numero, VOCI_MENU);
		boolean finito = false;
		do
		{
			int scelta = menuPagina.scegli();
			switch (scelta)
			{
			case 0: finito = true; break;

			case 1: visualizza(); break;
			case 2: modificaTesto(); break;
			}
		}while(!finito);

	}
	
	public void visualizza()
	{
		System.out.println(toString());
	}
	
	public void modificaTesto()
	{
		testo = MyUtil.leggiString(MESS_NUOVO_TESTO + numero+": ");
	}

}
