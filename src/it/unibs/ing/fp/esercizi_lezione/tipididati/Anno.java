package it.unibs.ing.fp.esercizi_lezione.tipididati;
public class Anno
{
 private final static int INIZIO_CICLO = 9;
 private final static int DURATA_CICLO = 28;

 private int numAnno; // si intende dopo Cristo
  
 public Anno(int _numAnno)
  {
    numAnno=_numAnno;
  }
 
 public boolean bisesto()
  {
   return (((numAnno%4) == 0) && ((numAnno%100) != 0))
           				|| ((numAnno%400) == 0);
  }

 public int numCiclo()
  {
	   return 1 + ((numAnno + INIZIO_CICLO)/DURATA_CICLO);   
  }
}