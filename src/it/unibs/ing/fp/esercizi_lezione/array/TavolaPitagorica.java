package it.unibs.ing.fp.esercizi_lezione.array;

public class TavolaPitagorica {
	static final int NUMRIGHE = 10;
	public static void main(String[] args) {

		int numColonne=10;

		int[][] tavolaPitagorica=new int[NUMRIGHE][numColonne];
	
		for(int i = 0;i<tavolaPitagorica.length;i++)
			for(int j = 0;j<tavolaPitagorica[0].length;j++)
				tavolaPitagorica[i][j]=(i+1)*(j+1);
		
		System.out.println("Tavola Pitagorica:");
		for(int i = 0;i<tavolaPitagorica.length;i++) {
			for(int j = 0;j<tavolaPitagorica[0].length;j++)
				System.out.printf("%d\t",tavolaPitagorica[i][j]);
			System.out.println();
		}
	}
}
