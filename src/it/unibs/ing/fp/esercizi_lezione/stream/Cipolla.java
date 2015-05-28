package it.unibs.ing.fp.esercizi_lezione.stream;

import java.io.*;

import java.util.*;

import it.unibs.ing.fp.esercizi_laboratorio.mylib.*;

public class Cipolla
{

	private static void esistenza(File f)
	{

		if (f.exists())

			System.out.println("IL FILE ESISTE ED E' DI DIMENSIONE "

			+ f.length() + " BYTES");

		else

			System.out.println("IL FILE NON ESISTE");

	}

	public static void main(String[] args) throws IOException,
			FileNotFoundException
	{

		File f = new File("/tmp/prova.dat");

		esistenza(f);

		FileOutputStream s = new FileOutputStream(f);

		BufferedOutputStream b = new BufferedOutputStream(s);

		DataOutputStream d = new DataOutputStream(b);

		for (int i = 0; i < 5; i++)

			d.writeInt(InputDati.leggiIntero("Inserire un intero "));

		d.close();

		esistenza(f);

		DataInputStream c = new DataInputStream(new BufferedInputStream(
				new FileInputStream(f)));

		Vector<Integer> letture = new Vector<Integer>();

		boolean finito = false;

		while (!finito)

		{

			try {
				letture.add(c.readInt());
			}

			catch (EOFException e)

			{
				finito = true;
			}

		}

		for (int i : letture)

			System.out.println(i);

	} // main
}// class 