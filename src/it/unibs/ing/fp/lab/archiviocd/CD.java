/*
 Questa classe rappresenta un CD caratterizzato da 
 un titolo, un autore ed un elenco di brani

*/

package it.unibs.ing.fp.lab.archiviocd;
import it.unibs.ing.fp.lab.mylib.*;

import java.util.*;

public class CD 
{

  private final static String DESCRIZIONE_CD = "Titolo : %s%nAutore : %s%nLista dei brani :%n";
  
  private String titolo;
  private String autore;
  private Vector <Brano> listaBrani;


  public CD (String titolo, String autore)
  {
	 this.titolo = titolo;
	 this.autore = autore;
	 listaBrani = new Vector<Brano>();
  }

	
  public void aggiungiNuovoBrano(Brano br) 
  {
     listaBrani.add(br);
  }

  public String getTitolo()
  {
	return titolo;
  }
  
  public boolean matchTitolo (String cercato)
  {
	return titolo.equalsIgnoreCase(cercato);
  }

  public String toString() 
  {
    StringBuffer risultato = new StringBuffer();
		
    risultato.append(String.format(DESCRIZIONE_CD,titolo,autore));

    for ( int i = 0; i < listaBrani.size(); ++i ) 
		 {
			Brano brano = (Brano)listaBrani.get(i);
			risultato.append (brano.toString());
		 }

    return risultato.toString();
   }


  public Brano branoRandom()
  {
    int estratto = EstrazioniCasuali.estraiIntero(0, listaBrani.size()-1);
    return listaBrani.get(estratto);
  }

}
