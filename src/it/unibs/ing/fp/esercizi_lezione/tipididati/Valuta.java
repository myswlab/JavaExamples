package it.unibs.ing.fp.esercizi_lezione.tipididati;
public class Valuta
{
 private String nome;
 private double tassoRif;
 
 public Valuta(String _nome, double _tassoRif)
  {
    nome = _nome;
    tassoRif = _tassoRif;
  }
 
 public double tassoConversione (Valuta altraValuta)
  {
   return tassoRif/altraValuta.tassoRif;
  }

}