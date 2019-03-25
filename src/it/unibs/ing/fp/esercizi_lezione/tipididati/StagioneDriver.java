package it.unibs.ing.fp.esercizi_lezione.tipididati;
public class StagioneDriver
{
 public static void main (String args [])
  {
    System.out.print("Percentuale pioggia primavera = ");
    System.out.println(Stagione.PRIMAVERA.percPioggia());
    System.out.print("Percentuale pioggia estate = ");
    System.out.println(Stagione.ESTATE.percPioggia());
    System.out.print("Percentuale pioggia autunno = ");
    System.out.println(Stagione.AUTUNNO.percPioggia());
    System.out.print("Percentuale pioggia inverno = ");
    System.out.println(Stagione.INVERNO.percPioggia());
  }
}