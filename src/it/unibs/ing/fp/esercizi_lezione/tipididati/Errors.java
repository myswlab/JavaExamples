package it.unibs.ing.fp.esercizi_lezione.tipididati;

public class Errors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=1_000_000;
		System.out.print("n*n is	: ");
		System.out.println(n*n); // Overflow
	
		double balance=13.75;
		int dollars=(int)balance; // Assignment error
		
		int s1=3;
		int s2=5;
		int s3=6;
		double average= (s1+s2+s3)/3; // Error
		System.out.print("Your average score is: ");
		System.out.println(average);
		
	}

}
