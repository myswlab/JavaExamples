package it.unibs.ing.fp.lab.traffico;

class Pedone extends Elemento
{
  final static String SIMBOLOPEDONE = "*";
  final static int VELOCITAVERTICALE = 1;
  final static int RESISTENZAPEDONE = 2;


  public Pedone ()
	 {
		 super(SIMBOLOPEDONE,RESISTENZAPEDONE,true);
	 }
		
  public Coordinate getProssimaPosizione (int rigaAttuale, int colonnaAttuale)
	 {
		 return new Coordinate(rigaAttuale + VELOCITAVERTICALE,colonnaAttuale);
	 }


}

