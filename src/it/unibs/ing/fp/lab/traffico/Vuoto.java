package it.unibs.ing.fp.lab.traffico;

class Vuoto extends Elemento
{
  final static String SPAZIO = " ";
  final static int RESISTENZAVUOTO = 0;

  public Vuoto ()
	 {
		 super(SPAZIO,RESISTENZAVUOTO,false);
	 }
		
	public Coordinate getProssimaPosizione (int posizioneAttualeX, int posizioneAttualeY)
	 {
		 return new Coordinate(posizioneAttualeX,posizioneAttualeY);
	 }


}

