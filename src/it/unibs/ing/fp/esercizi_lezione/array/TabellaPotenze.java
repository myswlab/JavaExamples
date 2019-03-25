package it.unibs.ing.fp.esercizi_lezione.array;


public class TabellaPotenze {

	public static void main(String[] args)

	{

		System.out.println("Programma per la stampa di una tabella di potenze");

		int maxBase = MyUtil.leggiInteroPositivo("Inserire il valore massimo per la base:");

		int maxExp = MyUtil.leggiInteroPositivo("Inserire il valore massimo per l’esponente:");

		for (int x = 1; x <= maxBase; x++)

		{

			for (int y = 1; y <= maxExp; y++)

			{
				int potenza = (int) Math.pow(x, y);

				System.out.print(potenza + " ");

			}

			System.out.println();

		} // for

	} // main

} // class
