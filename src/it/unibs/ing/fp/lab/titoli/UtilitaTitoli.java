package it.unibs.ing.fp.lab.titoli;

import it.unibs.ing.fp.lab.mylib.*;

class UtilitaTitoli
{

 private final static String MSG_NOME_TITOLO = "INSERIRE LA DENOMINAZIONE DEL NUOVO TITOLO DA CREARE:";
 private final static String MSG_PREZZO_TITOLO = "INSERIRE IL PREZZO INIZIALE DEL TITOLO %s:";
 private final static String MSG_NUMERO_AZIONI = "INSERIRE IL NUMERO DI AZIONI ACQUISTATE DEL TITOLO %s:";
 private final static String MSG_ALTRO_TITOLO = "INSERIRE UN ALTRO TITOLO IN ELENCO ?";
 private final static String MSG_NOME_PORTFOLIO = "INSERIRE LA DENOMINAZIONE DEL PORTAFOGLIO CONSIDERATO:";
 
 public static Titolo creaTitolo()
	{
	 String nome = InputDati.leggiStringaNonVuota(MSG_NOME_TITOLO);
	 double prezzo = InputDati.leggiDoubleConMinimo(String.format(MSG_PREZZO_TITOLO,nome), 0); // Impongo prezzo >= 0
	 return new Titolo(nome, prezzo);
	}

 public static Portafoglio creaPortafoglio(String nome, ElencoTitoli listino)
	{
	 Portafoglio p = new Portafoglio(nome, listino);
	 for (int i = 0; i < listino.numTitoli(); i++)
		{
		 Titolo t = listino.getTitolo(i);
		 int dimLotto = InputDati.leggiInteroConMinimo(String.format(MSG_NUMERO_AZIONI, t.toString()), 1); // Impongo numero di azioni >= 1
		 p.addLotto(new Lotto (t, dimLotto) );
		}
	 return p;
	}

 public static ElencoTitoli creaElencoTitoli()
	{
	 ElencoTitoli nuovoElenco = new ElencoTitoli();
	 do
		{
		 Titolo nuovoTitolo = creaTitolo();
		 nuovoElenco.addTitolo(nuovoTitolo);
		} while (InputDati.yesOrNo(MSG_ALTRO_TITOLO));
		
	 return nuovoElenco;
	}
 
 public static Portafoglio creaPatrimonio(ElencoTitoli lista)
	{
	 String nome = InputDati.leggiStringaNonVuota(MSG_NOME_PORTFOLIO);
		
	 return creaPortafoglio(nome, lista);
		
	 
	}
}

