package it.unibs.ing.fp.esercizi_lezione.array;
enum Directions{
	  EAST, 
	  WEST, 
	  NORTH, 
	  SOUTH
}
public class EnumDemo {
	public static void main(String[] args) {
    	for (Directions dir : Directions.values()) {
    	    System.out.println(dir);
    	}
    }
}
