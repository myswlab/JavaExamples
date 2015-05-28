package it.unibs.ing.fp.esercizi_lezione.metodi;

/**
 * Comments go here
 * 
 * @author iserina
 *
 */

public class VerificaArrotondamento

{

	public static void main(String[] args)

	{

		double input1 = MyUtil.leggiDouble("Primo numero:");
		double input2 = MyUtil.leggiDouble("Secondo numero:");
		double diff1 = input1 - checkRound(input1, input2);
		double diff2 = input2 - checkRound(input2, input1);

		System.out.println("Se divido e poi moltiplico " + input1 + " per "
				+ input2 + " la differenza e' " + diff1);

		System.out.println("Se divido e poi moltiplico " + input2 + " per "
				+ input1 + " la differenza e' " + diff2);

	}

	/**
	 * 
	 * @param num1 numerator
	 * @param num2 denominator
	 * @return return (num1/num2)*num2
	 */
	
	public static double checkRound(double num1, double num2)

	{

		num1 = (int) (num1 / num2);
		return num1 * num2;

	}

}
