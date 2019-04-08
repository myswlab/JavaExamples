package it.unibs.ing.fp.esercizi_lezione.agenda;

public class AgendaMain {
	private final static String cornice = "****************************************************";
	private final static String CHIEDI_NUM_PAGINE = "Inserire il numero di pagine dell'agenda da creare: ";
	private final static int MIN_PAGINE = 1;
	private final static int MAX_PAGINE = 400;
	private final static String CHIEDI_GIORNO = "Inserire il primo giorno dell'agenda da creare(1-LUN, ...,7-DOM): ";
	private final static String MESS_BENVENUTO = " BENVENUTO NELLA GESTIONE AGENDA - VERSIONE RIVEDUTA";
	private final static String MESS_USCITA = " GRAZIE PER AVER USATO L'AGENDA - ARRIVEDERCI";
	private static void benvenuto()
	{
		System.out.println(cornice);
		System.out.println(MESS_BENVENUTO);
		System.out.println(cornice);
	}
	private static void saluti()
	{
		System.out.println(cornice);
		System.out.println(MESS_USCITA);
		System.out.println(cornice);
	}

	private static Agenda creaAgenda()
	{
		int numPagine = MyUtil.leggiIntero(CHIEDI_NUM_PAGINE,MIN_PAGINE,MAX_PAGINE);
		int primoGiorno = MyUtil.leggiIntero(CHIEDI_GIORNO,1,Agenda.NUM_GIORNI_SETTIMANA);
		return new Agenda(numPagine, primoGiorno);
	}
	public static void main (String [] args) {
		benvenuto();
		Agenda miaAgenda = creaAgenda();
		miaAgenda.usaAgenda();
		saluti();							
	}

}
