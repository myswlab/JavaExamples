package it.unibs.ing.fp.esercizi_lezione.array;

public class ArgomentiMetodi {

	static int sommatoria(int... addendi) {
		int totale = 0;
		for (int i = 0; i < addendi.length; i++)
			totale = totale + addendi[i];
		return totale;
	}

	public static void main(String[] args) {
		
		int tot = sommatoria (1, 5, 8);
		System.out.println(tot);
		tot = sommatoria (1, 5, 8, 10);
		System.out.println(tot);

	}

}
