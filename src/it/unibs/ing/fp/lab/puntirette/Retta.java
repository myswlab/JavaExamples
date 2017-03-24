
package it.unibs.ing.fp.lab.puntirette;
import it.unibs.ing.fp.lab.mylib.*;
/*
// header - edit "Data/yourJavaHeader" to customize
// contents - edit "EventHandlers/Java file/onCreate" to customize
//
*/
public class Retta
{
    private boolean verticale;
	private double coeffAng;
	private double offset;
	
	
	public Retta ( Punto p1, Punto p2)
	 {
	   verticale = (p1.getX() == p2.getX());
		
	 		if (verticale) 
				offset = p1.getX();
	 		else
				{
		 			coeffAng = (p2.getY() - p1.getY())/(p2.getX() - p1.getX());
		 			offset = p2.getY() - coeffAng*p2.getX();
				}
	 }
	
	public String toString()
	 {
		 StringBuffer res = new StringBuffer();
		 res.append("L'equazione e':");
	   if (verticale)
			res.append("x=" + Formattazione.formattaDoubleConSegno(offset,false));
	  else
		 {
		  if (coeffAng == 0) 
			 res.append("y=" + Formattazione.formattaDoubleConSegno(offset,false));
		  else
			 res.append("y="+ Formattazione.formattaDoubleConSegno(coeffAng,false) + "x" + Formattazione.formattaDoubleConSegno(offset,true));
     } // primo else
		
		return res.toString();
		 
	 }
		
	public boolean appartiene(Punto p)
	 {
	  if (!verticale)
		 return ( p.getY() == (coeffAng*p.getX() + offset));
	  else
		 return (offset == p.getX());
	 }
  	
}

