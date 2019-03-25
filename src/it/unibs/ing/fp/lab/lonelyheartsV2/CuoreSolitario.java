package it.unibs.ing.fp.lab.lonelyheartsV2;

public class CuoreSolitario 
{
	private final static String DESCRIZIONE = "Nome: %s, eta': %d, sesso: %c";
	
	private final static int SOGLIA_ETA = 10;
	
	private String pseudonimo;
	private int eta;
	private char sesso;
	private Zodiaco segno;
	private Zodiaco segnoPreferito;
	
	public CuoreSolitario (String pseudonimo, int eta, char sesso, Zodiaco segno, Zodiaco segnoPreferito)
	 {
		this.pseudonimo = pseudonimo;
		this.eta = eta;
		this.sesso = sesso;
		this.segno = segno;
		this.segnoPreferito = segnoPreferito;
	 }
	
   public String toString()
    {
	 return pseudonimo;
    }
  
   public boolean affineZodiaco(CuoreSolitario partner)
   {
	return (this.segno == partner.segnoPreferito && this.segnoPreferito == partner.segno);
   }
   
   public boolean affine(CuoreSolitario partner)
   {
	  int differenza = Math.abs(eta-partner.eta);
	  if (differenza <= SOGLIA_ETA && sesso != partner.sesso  && affineZodiaco(partner))
		return true;
	  else 
		return false;
   }
}
