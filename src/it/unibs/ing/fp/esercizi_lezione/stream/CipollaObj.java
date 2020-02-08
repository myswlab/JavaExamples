package it.unibs.ing.fp.esercizi_lezione.stream;

import java.io.*;
import java.util.*;

import it.unibs.ing.fp.lab.mylib.*;

public class CipollaObj {

	private static void esistenza(File f) {

		if (f.exists())

			System.out.println("IL FILE ESISTE ED E' DI DIMENSIONE "

			+ f.length() + " BYTES");

		else

			System.out.println("IL FILE NON ESISTE");

	}

	public static void main(String[] args) throws IOException,
			FileNotFoundException, ClassNotFoundException {

		File f = new File("/tmp/obj.dat");

		esistenza(f);

		ObjectOutputStream archivio = new ObjectOutputStream(

		new BufferedOutputStream(

		new FileOutputStream(f)));

		int[] a = new int[20];

		for (int i = 0; i < a.length; i++)

			a[i] = i * 3;

		archivio.writeObject(a);

		archivio.close();

		esistenza(f);

		ObjectInputStream sorgente = new ObjectInputStream(

		new BufferedInputStream(

		new FileInputStream(f)));

		try
		{

			int [] aNew = (int[]) sorgente.readObject();

			for (int i = 0; i < aNew.length; i++)

				System.out.println(aNew[i]);

		}

		catch (ClassCastException exc)
		{
			System.out.println("Grave errore di tipo in lettura!");
		}

		finally {
			if (sorgente != null)
				sorgente.close();
		}

		
		ObjectInputStream sorgente2 = new ObjectInputStream(

				new BufferedInputStream(

				new FileInputStream(f)));

				try
				{

					double[] d = (double[]) sorgente2.readObject();

					for (int i = 0; i < d.length; i++)

						System.out.println(d[i]);

				}

				catch (ClassCastException exc)
				{
					System.out.println("Grave errore di tipo in lettura!");
				}

				finally {
					if (sorgente2 != null)
						sorgente2.close();
				}

		
	} // main

}// class 