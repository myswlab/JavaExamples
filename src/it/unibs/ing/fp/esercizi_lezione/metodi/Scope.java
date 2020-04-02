package it.unibs.ing.fp.esercizi_lezione.metodi;

public class Scope {

	public static void metodoMio (double w)
	  {
	     String nome; int k = 1;
		/* visibili: nome, k, w */
			while (k > 0)
			 {
			   double q; String s = "dentro";
			   k--;
			   /* visibili: nome, k, w, q, s */
			 }
			  /* visibili: nome, k, w  - q,s eliminate */
	     double z;
	     w=k;
		 /* visibili: nome, k, w, z */
	  }
		/* nome, k, w, z  eliminate*/

	
	public static void main(String[] args) {
		double val=5.0;
		metodoMio(val);
		System.out.println("val="+val);
	}

}
