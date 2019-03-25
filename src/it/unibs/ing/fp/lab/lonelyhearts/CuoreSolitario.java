package it.unibs.ing.fp.lab.lonelyhearts;

public class CuoreSolitario 
{
	private final static String DESCRIZIONE = "Nome: %s, eta': %d, sesso: %c";
	
	private final static int SOGLIA_ETA = 10;
	
	private String pseudonimo;
	private int eta;
	private char sesso;
	
	public CuoreSolitario (String pseudonimo, int eta, char sesso)
	 {
		this.pseudonimo = pseudonimo;
		this.eta = eta;
		this.sesso = sesso;
	 }
	
   public String toString()
    {
	 return pseudonimo;
    }
   
   public boolean affine(CuoreSolitario partner)
   {
	  int differenza = Math.abs(eta-partner.eta);
	  if (differenza <= SOGLIA_ETA && sesso != partner.sesso)
		return true;
	  else 
		return false;
   }
}
