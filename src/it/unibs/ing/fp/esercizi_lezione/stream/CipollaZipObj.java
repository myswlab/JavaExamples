package it.unibs.ing.fp.esercizi_lezione.stream;

import java.io.*;
import java.util.zip.*;

public class CipollaZipObj {
	private static void esistenza(File f) {

		if (f.exists())

			System.out.println("IL FILE ESISTE ED E' DI DIMENSIONE "

			+ f.length() + " BYTES");

		else

			System.out.println("IL FILE NON ESISTE");

	}

	public static void main(String[] args) throws IOException,
			FileNotFoundException, ClassNotFoundException {

		File f = new File("/tmp/obj.zip");

		esistenza(f);

		ZipOutputStream zipOut = new ZipOutputStream(

		new BufferedOutputStream(

		new FileOutputStream(f)));

		zipOut.putNextEntry(new ZipEntry("/tmp/file.dat"));

		ObjectOutputStream archivio = new ObjectOutputStream(zipOut);

		int[] a = new int[20000];

		for (int i = 0; i < a.length; i++)

			a[i] = i * 2;

		archivio.writeObject(a);

		archivio.close();

		esistenza(f);

		ZipInputStream zipIn = new ZipInputStream(

		new BufferedInputStream(

		new FileInputStream(f)));

		zipIn.getNextEntry();

		ObjectInputStream sorgente = new ObjectInputStream(zipIn);

		try {

			a = (int[]) sorgente.readObject();

			for (int i = 0; i < a.length; i += 1000)

				System.out.println(a[i]);

		}

		catch (ClassCastException exc) {
			System.out.println("Grave errore di tipo in lettura!");
		}

		finally {
			if (sorgente != null)
				sorgente.close();
		}

	} // main

}// class 