package it.unibs.ing.fp.esercizi_lezione.stream;

import java.io.*;
import java.util.*;
import it.unibs.ing.fp.esercizi_laboratorio.mylib.*;

public class CipollaTxtNumeri {

	private static void esistenza(File f) {

		if (f.exists())

			System.out.println("IL FILE ESISTE ED E' DI DIMENSIONE "

			+ f.length() + " BYTES");

		else

			System.out.println("IL FILE NON ESISTE");

	}

	public static void main(String[] args) throws IOException,
			FileNotFoundException {

		File f = new File("/tmp/fileNumeri.txt");

		esistenza(f);

		PrintWriter pw = new PrintWriter(new BufferedWriter(

		new FileWriter(f)));

		for (int i = 0; i < 5; i++)

			pw.println(InputDati.leggiIntero("INSERIRE UN NUMERO "));

		pw.close();

		esistenza(f);

		Scanner source = new Scanner(new FileReader(f));

		Vector<Integer> elenco = new Vector<Integer>();

		while (source.hasNextInt())

		{

			elenco.add(source.nextInt());

		}

		source.close();

		for (int letto : elenco)

			System.out.println(letto);

	} // main

}// class