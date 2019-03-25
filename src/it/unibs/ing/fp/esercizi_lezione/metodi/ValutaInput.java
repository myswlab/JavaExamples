package it.unibs.ing.fp.esercizi_lezione.metodi;

import it.unibs.ing.fp.esercizi_lezione.tipididati.Valuta;

import java.util.*;


public class ValutaInput
{
 public static void main (String args [])
  {
   Scanner lettore = new Scanner(System.in);
   System.out.print("Inserire il nome della prima valuta:");
   String nome1 = lettore.next();
   System.out.print("Inserire valore in euro prima valuta:");
   double valore1 = lettore.nextDouble();
   System.out.print("Inserire il nome della seconda valuta:");
   String nome2 = lettore.next();
   System.out.print("Inserire valore in euro seconda valuta:"); 
   double valore2 = lettore.nextDouble();
   Valuta valuta1 = new Valuta(nome1,valore1);
   Valuta valuta2 = new Valuta(nome2,valore2);
   System.out.print("Risultato 1 = ");
   System.out.println(valuta1.tassoConversione(valuta2));
   System.out.print("Risultato 2 = ");
   System.out.println(valuta2.tassoConversione(valuta1));
   lettore.close();
   
 }
}
