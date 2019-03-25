package it.unibs.ing.fp.lab.lonelyheartsV2;

public class Stranamore 
{
  private final static String SALUTO_INIZIALE = "Benvenuto nel programma per cuori solitari!!";

  private final static String INTRO_INSERIMENTO = "Inserimento dati di un nuovo cuore solitario";
  private final static String MESSAGGIO_PSEUDONIMO = "Inserisci il tuo pseudonimo:";
  private final static String MESSAGGIO_ETA = "Inserisci la tua eta':";
  private final static String MESSAGGIO_SESSO= "Inserisci F se sei femmina o M se sei maschio";
  
  private final static String MESSAGGIO_SEGNO = "Inserisci il tuo segno zodiacale:";
  private final static String MESSAGGIO_SEGNO_PREFERITO = "Inserisci il segno zodiacale che vuoi incontrare:";
  

  private final static String MESSAGGIO_AFFINE= "%s e' potenzialmente affine a %s";
  private final static String MESSAGGIO_NON_AFFINE= "%s non e' potenzialmente affine a %s";
  
  private final static String RISPOSTE_AMMISSIBILI ="MF";
  
  private final static int MIN_ETA = 18;
  private final static int MAX_ETA = 120;
	
	
  public static void main(String[] args) 
   {
	 benvenuto();
	 CuoreSolitario partner1 = creaNuovoIscritto();
	 CuoreSolitario partner2 = creaNuovoIscritto();
	 if (partner1.affine(partner2))
	  System.out.printf(MESSAGGIO_AFFINE, partner1.toString(), partner2.toString());
	 else
	  System.out.printf(MESSAGGIO_NON_AFFINE, partner1.toString(), partner2.toString());
	}

  private static void benvenuto()
   {
	 System.out.println(SALUTO_INIZIALE);
	 System.out.println();
   }
  
  private static CuoreSolitario creaNuovoIscritto()
  {
	  System.out.println(INTRO_INSERIMENTO);
	  String pseudonimo = InputDati.leggiStringaNonVuota(MESSAGGIO_PSEUDONIMO);
	  int eta = InputDati.leggiIntero(MESSAGGIO_ETA,MIN_ETA,MAX_ETA);
	  char sesso = InputDati.leggiUpperChar(MESSAGGIO_SESSO,RISPOSTE_AMMISSIBILI);
	  Zodiaco segno = Zodiaco.leggiSegno(MESSAGGIO_SEGNO);
	  Zodiaco segnoPreferito = Zodiaco.leggiSegno(MESSAGGIO_SEGNO_PREFERITO);
	  return new CuoreSolitario(pseudonimo,eta,sesso,segno,segnoPreferito);
  }
  
}
