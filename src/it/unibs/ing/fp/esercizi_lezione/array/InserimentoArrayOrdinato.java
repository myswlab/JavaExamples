package it.unibs.ing.fp.esercizi_lezione.array;

public class InserimentoArrayOrdinato {

	public static void main(String[] args) {
		int[] cinquina = { 12, 23, 33, 44, 67 };

		int cinquinaSize = cinquina.length;
		int pos = 2;

		for (int i = pos; i < cinquinaSize - 1; i++) {
			cinquina[i] = cinquina[i + 1];
		}
		cinquinaSize--;

		System.out.println("Stampa:");
		for (int i = 0; i < cinquinaSize; i++)
			System.out.printf("%d\t",cinquina[i]);


		int newElement=33;
		if (cinquinaSize < cinquina.length) {
			pos=cinquinaSize;
			for (; pos > 0 && cinquina[pos - 1]>newElement; pos--) {
				cinquina[pos] = cinquina[pos - 1];
			}
			cinquina[pos] = newElement;
			cinquinaSize++;
		}


		System.out.println("\n\nStampa:");
		for (int i = 0; i < cinquinaSize; i++)
			System.out.printf("%d\t",cinquina[i]);
	}

}
