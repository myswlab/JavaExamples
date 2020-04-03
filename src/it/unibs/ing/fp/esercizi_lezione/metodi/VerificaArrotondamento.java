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

		if(diff1==diff2)
			System.out.println("Differenze uguali");
		//checkRound2();
				
		//checkRound3();

		//checkRound4();
	}

	/**
	 * 
	 * @param num1 numerator
	 * @param num2 denominator
	 * @return return (num1/num2)*num2
	 */
	
	public static double checkRound(double num1, double num2)
	{
		
		num1 = (num1 / num2);
		return num1 * num2;
		
	}
	
	public static void checkRound2()
	{
		double a = 0.7;
		double b = 0.9; 
		double x = a + 0.1; 
		double y = b - 0.1; 
		System.out.println("checkRound2");
		System.out.println("x = " + x); 
		System.out.println("y = " + y ); 
		System.out.println(x == y); 
	}

	public static void checkRound3()
	{
	  double a = 1.0; 
      double b = 0.10; 
      double x = 9 * b; 
      a = a - (x); 

      System.out.println("checkRound3");	
      // Value of a is expected as 0.1 
      System.out.println("a = " + a); 
	}

	public static void checkRound4()
	{
		double d = 0;
		for (int i = 1; i <= 10; i++) 
			d += 0.1;
	

		System.out.println("checkRound4");
		System.out.println(d);
	}
}
