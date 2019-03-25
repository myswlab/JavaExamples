package it.unibs.ing.fp.lab.lonelyheartsV2;

public enum Zodiaco 
{
 ARIETE, TORO, GEMELLI, CANCRO, LEONE, VERGINE, BILANCIA, SCORPIONE, SAGITTARIO, CAPRICORNO, ACQUARIO, PESCI;

 private final static String MESSAGGIO_NUMERO = "Digitare il numero corrispondente al segno come da elenco:";
 
 
 public static Zodiaco leggiSegno(String messaggio)
 {
	 
  	 System.out.println(messaggio);
	 
	 // QUESTA PARTE SARA' MIGLIORATA QUANDO AVREMO ULTERIORI NOZIONI SULLE STRUTTURE DATI E SUGLI enum
	 System.out.println("1-ARIETE");
	 System.out.println("2-TORO");
	 System.out.println("3-GEMELLI");
	 System.out.println("4-CANCRO");
	 System.out.println("5-LEONE");
	 System.out.println("6-VERGINE");
	 System.out.println("7-BILANCIA");
	 System.out.println("8-SCORPIONE");
	 System.out.println("9-SAGITTARIO");
	 System.out.println("10-CAPRICORNO");
	 System.out.println("11-ACQUARIO");
	 System.out.println("12-PESCI");
     int valoreLetto = InputDati.leggiIntero(MESSAGGIO_NUMERO, 1, 12);
     
     switch (valoreLetto)
     {
      case 1: return ARIETE;
      case 2: return TORO;
      case 3: return GEMELLI;
      case 4: return CANCRO;
      case 5: return LEONE;
      case 6: return VERGINE;
      case 7: return BILANCIA;
      case 8: return SCORPIONE;
      case 9: return SAGITTARIO;
      case 10: return CAPRICORNO;
      case 11: return ACQUARIO;
      case 12: return PESCI;
      default: return null;
     }
 }
 
}
