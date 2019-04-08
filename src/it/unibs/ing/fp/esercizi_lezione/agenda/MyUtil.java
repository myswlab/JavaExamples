package it.unibs.ing.fp.esercizi_lezione.agenda;

import java.util.*;

public class MyUtil
{
	private static final String ERRORE_FORMATO= "Attenzione, formato inaspettato"; 
	private static Scanner lettore = new Scanner(System.in);
	public static String ACAPO="\n";

	public static int leggiIntero (String messaggio)
	{
	     boolean finito=false;
	        int valoreLetto=0;
	        do {
	        System.out.print(messaggio);
	                if (lettore.hasNextInt()){
	                valoreLetto=lettore.nextInt();
	                String s=lettore.nextLine();
	                finito=true;
	                }
	                else
	                {
	                System.out.println(ERRORE_FORMATO);
	                String daButtare= lettore.next();               
	                }
	        } while (!finito);
	        return valoreLetto;


	}


	public static int leggiIntero (String messaggio, int min, int max)
	{
		int num;
		do {
			num=leggiIntero(messaggio);
		}
		while(num<min && num>max);

		return num;
	}
	public static double leggiDouble(String messaggio) {

		System.out.print(messaggio); 
		return lettore.nextDouble();
	}

	public static char siglaGiorno(int numeroGiorno){
		char sigla='x';
		numeroGiorno--;
		switch (numeroGiorno) {
		case 0: sigla='l';break;
		case 1: sigla='m';break;
		case 2: sigla= 'm';break;
		case 3: sigla= 'g';break;
		case 4: sigla= 'v';break;
		case 5: sigla= 's';break;
		case 6: sigla= 'd'; break;
		default: System.out.println("Error"); break;
		}
		return sigla;
	}

	public static String leggiString(String messaggio){
		boolean finito=false;
		String valoreLetto="";
		do {
			System.out.print(messaggio+" ");
			if (lettore.hasNextLine()){
				valoreLetto=lettore.nextLine();
				finito=true;
			}
			else
			{
				System.out.println(ERRORE_FORMATO);
				String daButtare= lettore.next();               
			}
		} while (!finito && valoreLetto.length()>0);
		return valoreLetto;
	}

}