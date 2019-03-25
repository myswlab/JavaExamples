package it.unibs.ing.fp.lab.mylib;

import java.util.Scanner;

public class Servizio {
	
	private final static String ERRORE_FORMATO = "Attenzione: il dato inserito non e' nel formato corretto";
	
	private static Scanner scanner = creaScanner();
	
	public static Scanner creaScanner(){
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		return scanner;
	}
	
	public static double leggiDouble(String testo){
		System.out.println(testo);
		boolean finito = false;
		double risultato = 0.0;
		do {
			if(scanner.hasNextDouble()){
				risultato = scanner.nextDouble();
				finito = true;
			} else {
			   System.out.println(ERRORE_FORMATO);
		       scanner.next();
			}
		} while(!finito);
		
		return risultato;
		
	}
	
	public static int leggiIntero(String testo){
		System.out.println(testo);
		boolean finito = false;
		int risultato = 0;
		do {
			if(scanner.hasNextInt()){
				risultato = scanner.nextInt();
				finito = true;
			} else {
				System.out.println(ERRORE_FORMATO);
			    scanner.next();
			}
		} while(!finito);
		
		return risultato;
	}
	
	public static String leggiStringa(String testo){
		System.out.println(testo);
		return scanner.next();
	}
	
}
