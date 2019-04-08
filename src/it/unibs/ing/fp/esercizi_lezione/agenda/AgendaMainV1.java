package it.unibs.ing.fp.esercizi_lezione.agenda;

public class AgendaMainV1 {
	private final static String cornice="*************************************************";
	private final static String CHIEDI_NUM_PAGINE = "Inserire il numero di pagine dell'agenda da creare: ";
	private final static int MIN_PAGINE = 1;
	private final static int MAX_PAGINE = 400;
	private final static String CHIEDI_GIORNO = "Inserire il primo giorno dell'agenda da creare(1-LUN, ...,7-DOM): ";
	private final static String MESS_BENVENUTO = " BENVENUTO NELLA GESTIONE AGENDA - VERSIONE ZERO";
	private final static String MESS_USCITA= " GRAZIE PER AVER USATO L'AGENDA - ARRIVEDERCI ";
	private final static String INTESTAZIONE_MENU= "MENU OPERAZIONI DISPONIBILI";
	private final static String SCELTA1 = "1 - Per modificare il testo di una pagina";
	private final static String SCELTA2 = "2 - Per visualizzare il testo di una pagina";
	private final static String SCELTA3 = "3 - Per visualizzare il testo dell'intera agenda";
	private final static String SCELTA4 = "0 - Per uscire";
	private final static int NUM_SCELTE = 4;
	private final static String MESS_SCELTA = "Inserire l'operazione desiderata: ";
	private static void benvenuto(){
		System.out.println(cornice);
		System.out.println(MESS_BENVENUTO);
		System.out.println(cornice);
	}
	private static void saluti(){
		System.out.println(cornice);
		System.out.println(MESS_USCITA);
		System.out.println(cornice);
	}
	private static AgendaV1 creaAgenda()
	{
		int numPagine = MyUtil.leggiIntero(CHIEDI_NUM_PAGINE,
				MIN_PAGINE,MAX_PAGINE);
		int primoGiorno = MyUtil.leggiIntero(CHIEDI_GIORNO, 1,
				AgendaV1.NUM_GIORNI_SETTIMANA);
		return new AgendaV1(numPagine, primoGiorno);
	}
	public static void main(String[] args) {
		benvenuto();
		AgendaV1 miaAgenda = creaAgenda();
		boolean finito = false;
		do
		{System.out.println(INTESTAZIONE_MENU);
		System.out.println(SCELTA1);
		System.out.println(SCELTA2);
		System.out.println(SCELTA3);
		System.out.println(SCELTA4);
		int scelta=MyUtil.leggiIntero(MESS_SCELTA,0,NUM_SCELTE-1);
		switch (scelta)
		{
		case 0: finito = true; break;
		case 1: miaAgenda.aggiornaPagina(); break;
		case 2: miaAgenda.mostraPagina(); break;
		case 3: System.out.println(miaAgenda.toString());
		}} while(!finito);
		saluti();


	}
}

