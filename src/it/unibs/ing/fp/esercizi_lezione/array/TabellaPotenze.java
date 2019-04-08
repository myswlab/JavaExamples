package it.unibs.ing.fp.esercizi_lezione.array;

import it.unibs.fp.mylib.*;

public class TabellaPotenze {

	public static void main(String[] args)

	{

		System.out.println("Programma per la stampa di una tabella di potenze");

		int maxBase = InputDati.leggiInteroPositivo("Inserire il valore massimo per la base:");

		int maxExp = InputDati.leggiInteroPositivo("Inserire il valore massimo per l’esponente:");

		int [][] potenze=new int[maxBase][maxExp];
		for (int x = 0; x < maxBase; x++)
		{
			for (int y = 0; y < maxExp; y++)
			{
				int potenza = (int) Math.pow(x+1, y+1);
				potenze[x][y]=potenza;
			}
		} // for

		
		System.out.println("Tabella:");
		for (int x = 0; x < maxBase; x++)
		{
			for (int y = 0; y < maxExp; y++)
			{
				System.out.printf("%d\t",potenze[x][y]);
			}
			System.out.println();

		} // for

	} // main

} // class
