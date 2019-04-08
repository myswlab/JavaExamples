package it.unibs.ing.fp.esercizi_lezione.array;


public class RimozioneArrayOrdinato {

	public static void main(String[] args) {
		int[] cinquina = { 12, 23, 33, 44, 67 };

		int cinquinaSize = cinquina.length;
		int pos = 2;

//		cinquina[pos]=cinquina[cinquinaSize-1];
//		cinquinaSize--;

		for (int i = pos; i < cinquinaSize - 1; i++) {
			cinquina[i] = cinquina[i + 1];
		}
		cinquinaSize--;
		
		System.out.println("Stampa:");
		for (int i = 0; i < cinquinaSize; i++)
			System.out.printf("%d\t",cinquina[i]);
	}

}
