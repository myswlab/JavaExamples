package it.unibs.ing.fp.esercizi_lezione.stream;

import java.io.*;
import java.util.*;

import it.unibs.ing.fp.lab.mylib.*;

public class CipollaTxtStringhe
{

	private static void esistenza(File f) {

		if (f.exists())

			System.out.println("IL FILE ESISTE ED E' DI DIMENSIONE "

			+ f.length() + " BYTES");

		else

			System.out.println("IL FILE NON ESISTE");

	}

	public static void main(String[] args) throws IOException,
			FileNotFoundException
	{

		File f = new File("/tmp/cifileStringhe.txt");

		esistenza(f);

		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));

		String s = "";

		do {

			s = InputDati.leggiStringa("INSERIRE UNA STRINGA ");

			if (!s.equalsIgnoreCase("FINE"))

				pw.println(s);

		} while (!s.equalsIgnoreCase("FINE"));

		pw.close();

		esistenza(f);

		BufferedReader source = new BufferedReader(new FileReader(f));

		Vector<String> elenco = new Vector<String>();

		do {

			s = source.readLine();

			if (!(s == null))

				elenco.add(new String(s));

		} while (!(s == null));

		source.close();

		for (String letta : elenco)

			System.out.println(letta);

	} // main

}// class