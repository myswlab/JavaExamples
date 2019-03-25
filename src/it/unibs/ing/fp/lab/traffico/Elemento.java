package it.unibs.ing.fp.lab.traffico;

public abstract class Elemento
{
  
    private String descrizione;
	private int resistenza;
	private boolean solido;


	public Elemento (String d, int r, boolean s)
	 {
		 descrizione = d;
		 resistenza = r;
		 solido = s;		
	 }


	public boolean prevaleSu (Elemento altro)
	 {
		 return this.resistenza > altro.resistenza;
	 }

  public boolean collisioneCon (Elemento altro)
	 {
		 return this.solido && altro.solido;
	 }


	public String toString()
	 {
		 return descrizione;
	 }


	public abstract Coordinate getProssimaPosizione (int posizioneAttualeX, int posizioneAttualeY);

}
