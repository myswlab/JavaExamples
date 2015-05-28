/*
 Questa classe rappresenta un brano musicale caratterizzato da 
 titolo e durata
*/

package it.unibs.ing.fp.esercizi_laboratorio.archiviocd;


public class Brano 
 
 {
 
	private final static int SECONDI_PER_MINUTO = 60;
	private final static String DESCRIZIONE_BRANO = "%s%nDurata=%d min, %d sec%n";
	
	private String titolo;
    private int durataTotaleSecondi;
    private int minuti;
	private int secondi;

  public Brano (String titolo, int durataTotaleSecondi)
	 {
		this.titolo=titolo;
		this.durataTotaleSecondi = durataTotaleSecondi;
		minuti = durataTotaleSecondi/SECONDI_PER_MINUTO;
		secondi = durataTotaleSecondi%SECONDI_PER_MINUTO;
	 }
 
  public Brano (String titolo, int minuti, int secondi)
	 {
		this.titolo=titolo;
		this.minuti = minuti;
		this.secondi = secondi;
		durataTotaleSecondi = minuti*SECONDI_PER_MINUTO + secondi;
	 }

  public String toString() 
	 {
		return String.format(DESCRIZIONE_BRANO, titolo, minuti ,secondi);
	 }
  
}
