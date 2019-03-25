package it.unibs.ing.fp.lab.TamaZoo;

import java.util.*;

public class TamaZoo 
{
  private Vector<Tamagotchi> creature;
  
  public TamaZoo ()
  {
	  creature = new Vector<Tamagotchi>();
  }
  
  public void inserisci (Tamagotchi daInserire)
  {
	  creature.add(daInserire);	  
  }
  
  public boolean ciSonoVivi ()
  {
	  for (Tamagotchi elemento : creature)
	  {
		  if (! elemento.sonoMorto())
			  return true;
	  }
	  return false;
  }
  
  public void daiBiscotti (int quantiBiscotti)
  {
	  for (Tamagotchi elemento : creature)
	  {
		  if (! elemento.sonoMorto())
		  {
		   elemento.riceviBiscotti(quantiBiscotti);
		   System.out.println(elemento.toString());
		   System.out.println();
		  }
		  
	  }
  }
  
  public void daiCarezze (int quanteCarezze)
  {
	  for (Tamagotchi elemento : creature)
	  {
		  if (! elemento.sonoMorto())
	  	  {
		   elemento.riceviCarezze(quanteCarezze);
		   System.out.println(elemento.toString());
		   System.out.println();
	  	  }
		  
	  }
  }
  
    
}
