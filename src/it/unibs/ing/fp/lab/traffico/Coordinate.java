package it.unibs.ing.fp.lab.traffico;

class Coordinate
{

 private int riga;
 private int colonna;
 
	
 public Coordinate (int r, int c)
	{
	  riga=r;
	  colonna=c;
	}
	
 public int getRiga ()
	{
	 return riga;
	}
	
 public int getColonna ()
	{
	 return colonna;
	}

 public boolean staDentro (int maxRiga, int maxColonna)
	{
	 return (riga < maxRiga) && (colonna < maxColonna);
	}

 public String toString()
	{
	 return "RIGA:" + (riga+1) + ";COLONNA:" + (colonna+1);
	}

}

