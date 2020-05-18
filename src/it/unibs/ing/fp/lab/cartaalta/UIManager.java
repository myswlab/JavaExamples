package it.unibs.ing.fp.lab.cartaalta;
import it.unibs.fp.mylib.InputDati;
import it.unibs.fp.mylib.MyMenu;

public class UIManager {
	public final static String [] NOMI_ESISTENTI = {"ITALIANE", "FRANCESI"};
	public final static String INTESTA_TIPI = "SELEZIONE DEL TIPO DI CARTE DA USARE";
	public final static String MESS_INIZIO = "INIZIO PARTITA";	
	public final static String DOMANDA_TIPI = "Selezionare il tipo di carte da usare";
	public final static String DOMANDA_NOME = "Inserisci il tuo nome:";
	public final static String DOMANDA_PATRIMONIO = ", con quanti euro vuoi giocare ?";
	public final static String ERRORE_SELEZ = "Attenzione selezione non valida";
	
	private final static String MESS_CARTA_UT = "Hai pescato: ";
	private final static String MESS_GIOCATA = "Quanti euro vuoi scommettere ? ";
	private final static String MESS_CARTA_PC = "Il computer ha pescato: ";
	private final static String MESS_VINTO = " hai vinto !";
	private final static String MESS_PERSO = " hai perso !";
	private final static String MESS_PARI = "Carte pari: procediamo ad un'altra estrazione dallo stesso mazzo";
	private final static String DOMANDA_CONTINUA = "Vuoi continuare a giocare ?";
	private final static String MSG_SENZA_SOLDI = "Hai esaurito il credito e la partita è terminata";
	
	public static void avviaGUI() {
		System.out.println("BENVENUTO AL GIOCO DELLA CARTA PIU' ALTA");
		MyMenu mainMenu = new MyMenu (INTESTA_TIPI,NOMI_ESISTENTI);
		
		 boolean fine = false;
		 do
			{
			 int selezione = mainMenu.scegli();
			 switch (selezione)
				{
				 case 1: 
					play(TipoMazzo.ITALIANO);
				 break;
				 
				 case 2: 
					play(TipoMazzo.FRANCESE);
				 break;
					
				 case 0:
					fine = true;
				 break;
					
				 default:
					System.out.println(ERRORE_SELEZ);
				 
				}
			 
			}while (!fine);
		 
		 System.out.println("Grazie per aver giocato! Bye bye");
	}
		
	private static void play(TipoMazzo tipo)
	 {
		System.out.println(MESS_INIZIO);
		String nomeUtente = InputDati.leggiStringaNonVuota(DOMANDA_NOME);
		int soldiIniziali = InputDati.leggiInteroConMinimo(nomeUtente + DOMANDA_PATRIMONIO, 1);
		
		Partita partita = new Partita(nomeUtente, soldiIniziali, tipo);
		boolean continua = true;
		do {
		 Carta cartaUtente = partita.estraiCarta();
		 System.out.println(MESS_CARTA_UT + cartaUtente.toString());
		 int somma = InputDati.leggiIntero(MESS_GIOCATA,1,partita.getCredito());
		 Carta cartaPC = partita.estraiCarta();
		 System.out.println(MESS_CARTA_PC + cartaPC.toString());
		 EsitoScommessa esito = partita.scommetti(somma, cartaUtente, cartaPC);
		 stampaEsito(partita, esito, somma);
		 if (partita.isFinita()) {
			 System.out.println(MSG_SENZA_SOLDI);
			 break;
		 }
		 continua = InputDati.yesOrNo(DOMANDA_CONTINUA);
		} while(continua);
	 }
	
	private static void stampaEsito(Partita partita, EsitoScommessa esito, int scommessa) {
		String msg = "";
		switch(esito) {
			case VINTA:
				System.out.println(partita.getNomeGiocatore() + MESS_VINTO);
				msg = "incrementato di " + scommessa;
				break;
				
			case PERSA:
				System.out.println(partita.getNomeGiocatore() + MESS_PERSO);
				msg = "decrementato di " + scommessa;
				break;
				
			default:
				System.out.println(MESS_PARI);
				msg = "invariato";
				break;
		}
		System.out.println("Il tuo saldo e\' " + msg + " e vale " + partita.getCredito());
	}
}
