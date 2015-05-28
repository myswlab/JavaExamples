package it.unibs.ing.fp.esercizi_lezione.tipididati;


public enum Stagione 
{
 PRIMAVERA(92,23),
 ESTATE   (94,18),
 AUTUNNO  (89,24),
 INVERNO  (90,17);

 private int durata; 
 private int giorniPioggia; 

 Stagione(int _durata, int _giorniPioggia) 
  {
   durata = _durata;
   giorniPioggia = _giorniPioggia;
  }

 public double percPioggia()
  {
   return (double)giorniPioggia/(double)durata;
  }
}
