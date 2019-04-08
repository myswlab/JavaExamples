package it.unibs.ing.fp.esercizi_lezione.agenda;


public class AgendaV1 {
	final public static int NUM_GIORNI_SETTIMANA = 7;
	final private static String PAGINA_VUOTA = "";
	final private static String MESS_MODIFICA = "Inserire il numero della pagina da modificare ";
	final private static String MESS_VISUALIZZA = "Inserire il numero della pagina da visualizzare ";
	final private static String MESS_NUOVO_TESTO = "Inserire il nuovo testo della pagina numero ";
	private String [] testi;
	private int [] giorniDellaSettimana;

	public AgendaV1 (int numeroGiorni, int primoGiorno)
	{
		testi = new String[numeroGiorni];
		giorniDellaSettimana = new int[numeroGiorni];
		giorniDellaSettimana[0] = primoGiorno;
		testi[0] = PAGINA_VUOTA;
		for (int i = 1; i < numeroGiorni; i++)
		{
			testi[i] = PAGINA_VUOTA;
			giorniDellaSettimana[i] = (giorniDellaSettimana[i-1]%NUM_GIORNI_SETTIMANA)+1;
		}
	}
	public String toString ()
	{
		StringBuffer risultato = new StringBuffer();
		for (int i = 0; i < testi.length; i++)
			risultato.append(MyUtil.siglaGiorno(giorniDellaSettimana[i]) + " " + (i+1) + " " +
					testi[i] + "\n");
		return risultato.toString();
	}
	public void mostraPagina()
	{
		int numPagina = MyUtil.leggiIntero(MESS_VISUALIZZA,1,testi.length) - 1;
		System.out.println(MyUtil.siglaGiorno(giorniDellaSettimana[numPagina]) + " " +
				(numPagina+1) + " " + testi[numPagina]);
	}
	public void aggiornaPagina()
	{
		int numPagina = MyUtil.leggiIntero(MESS_MODIFICA,1,testi.length) - 1;
		testi[numPagina] = MyUtil.leggiString(MESS_NUOVO_TESTO + (numPagina+1));
	}
}
