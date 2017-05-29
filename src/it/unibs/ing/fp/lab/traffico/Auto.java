package it.unibs.ing.fp.lab.traffico;

class Auto extends Elemento
{
  final static String SIMBOLOAUTO = ">";
  final static int VELOCITAORIZZONTALE = 2;
  final static int RESISTENZAAUTO = 1;


  public Auto ()
	 {
		 super(SIMBOLOAUTO,RESISTENZAAUTO,true);
	 }
		
	public Coordinate getProssimaPosizione (int rigaAttuale, int colonnaAttuale)
	 {
		 return new Coordinate(rigaAttuale, colonnaAttuale + VELOCITAORIZZONTALE);
	 }


}

