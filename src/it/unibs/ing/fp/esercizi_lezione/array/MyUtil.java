package it.unibs.ing.fp.esercizi_lezione.array;
import java.util.*;

public class MyUtil {

	private static Scanner lettore = creaScanner();
	private final static String ERRORE_FORMATO = "Attenzione: il dato inserito non e' nel formato corretto";

	private final static String ERRORE_POSITIVO = "Attenzione: e' richiesto un valore maggiore di 0";

	private static Scanner creaScanner() {

		Scanner creato = new Scanner(System.in);
		creato.useDelimiter(System.getProperty("line.separator"));
		return creato;

	}

	public static int leggiIntero(String messaggio)

	{

		boolean finito = false;
		int valoreLetto = 0;
		do {

			System.out.print(messaggio);
			if (lettore.hasNextInt())

			{

				valoreLetto = lettore.nextInt();
				finito = true;

			} else {

				System.out.println(ERRORE_FORMATO);

				String daButtare = lettore.next();

			}
		} while (!finito);
		return valoreLetto;

	}

	public static int leggiInteroPositivo(String messaggio) {

		boolean finito = false;
		int valoreLetto = 0;
		do {

			valoreLetto = leggiIntero(messaggio);
			if (valoreLetto > 0)

				finito = true;

			else

				System.out.println(ERRORE_POSITIVO);
		} while (!finito);
		return valoreLetto;

	}

}
