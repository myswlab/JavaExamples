package it.unibs.ing.fp.esercizi_lezione.tipididati;
public class ValutaDriver
{
 public static void main (String args [])
  {
   Valuta sterlina = new Valuta("Sterlina",1.40);
   Valuta dollaro = new Valuta("Dollaro",0.67);
   Valuta franco = new Valuta("Franco Svizzero",0.60);
   System.out.print("Risultato atteso 1 = 2.08, valore ottenuto = ");
   System.out.println(sterlina.tassoConversione(dollaro));
   System.out.print("Risultato atteso 2 = 0.47, valore ottenuto = ");
   System.out.println(dollaro.tassoConversione(sterlina));
   System.out.print("Risultato atteso 3 = 1.11, valore ottenuto = ");
   System.out.println(dollaro.tassoConversione(franco));
  }
}