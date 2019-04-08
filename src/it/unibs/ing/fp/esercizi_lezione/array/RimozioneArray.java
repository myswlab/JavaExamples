package it.unibs.ing.fp.esercizi_lezione.array;

public class RimozioneArray {

	public static void main(String[] args) {
		int[] cinquina = { 23, 44, 33, 12, 67 };
		int cinquinaSize=cinquina.length;
		int pos=2;
		
		cinquina[pos]=cinquina[cinquinaSize-1];
		cinquinaSize--;

		System.out.println("Stampa:");
		for(int i=0; i< cinquinaSize; i++)
			System.out.printf("%d\t",cinquina[i]);
	}

}
