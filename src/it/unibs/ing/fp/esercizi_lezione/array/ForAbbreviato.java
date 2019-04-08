package it.unibs.ing.fp.esercizi_lezione.array;

public class ForAbbreviato {

	public static void stampaArrayDouble(double [] daStampare,int numInteri, int numDecimali)
	{
		String formato = "%"+numInteri+"."+numDecimali+"f%n";
		System.out.println("Stampa:");
		for (double elemento : daStampare)
		{
			System.out.printf(formato,elemento);
			elemento=6.66666;			
		}
	}
	
	public static void main(String[] args) {
	  // TODO Auto-generated method stub
		double [] daStampare= {1.1111, 2.2222, 3.3333, 4.4444, 5.5555};
		stampaArrayDouble(daStampare, 2, 3);

		double[] values = new double[10];
		for (int i = 0; i < values.length; i++)
			values[i] = i * i; 
		stampaArrayDouble(values, 2, 0);

	}

}
