package it.unibs.ing.fp.esercizi_lezione.array;

import java.util.Arrays;

public class CopiaArray3 {

	public static void main(String[] args) {
		int[] cinquina = { 23, 44, 33, 12, 67 };
		int[] trascritti = Arrays.copyOf(cinquina, cinquina.length*2);

		for (int i = 0; i < cinquina.length; i++) {
			cinquina[i] = i * 2;
		}
		
		System.out.println("cinquina:");
		for (int elemento : cinquina)
		{
			System.out.printf("%d\t",elemento);
		}
		System.out.println("\ntrascritti:");
		for (int elemento : trascritti)
		{
			System.out.printf("%d\t",elemento);
		}

	}

}
