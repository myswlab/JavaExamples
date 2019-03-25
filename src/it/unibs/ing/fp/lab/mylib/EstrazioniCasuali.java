package it.unibs.ing.fp.lab.mylib;
import java.util.*;

public class EstrazioniCasuali 
{	
	private static Random rand = new Random();	
	
	public static int estraiIntero(int min, int max)
	{
	 int range = max + 1 - min;
	 int casual = rand.nextInt(range);
	 return casual + min;
	}
	
}
