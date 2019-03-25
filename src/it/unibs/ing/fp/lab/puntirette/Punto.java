package it.unibs.ing.fp.lab.puntirette;
/*
// header - edit "Data/yourJavaHeader" to customize
// contents - edit "EventHandlers/Java file/onCreate" to customize
//
*/
public class Punto
{	

  private final static int NUMDIMENSIONI = 2;

  private double [] coordinate;
	
	public Punto (double x, double y)
	 {
		 coordinate = new double[NUMDIMENSIONI];
		 coordinate[0] = x;
		 coordinate[1] = y;
	 }
		
	public double getX()
	 {
		 return coordinate[0];
	 }
		
	public double getY()
	 {
		 return coordinate[1];
	 }
 	
	public void setX(double x)
	 {
		 coordinate[0] = x;
	 }
		
	public void setY(double y)
	 {
		 coordinate[1] = y;
	 }
		
	public String toString()
	 {
		 return "X=" + coordinate[0] + "; Y=" + coordinate[1];
	 }
		
	public boolean equals (Punto altro)
	 {
		 return (distanzaDa(altro) == 0);
	 }
		
	public double distanzaDa (Punto altro)
	 {
		 double sommaQuadrati = 0;
		 for (int i = 0; i < NUMDIMENSIONI; i++)
			{
			 sommaQuadrati = sommaQuadrati + Math.pow( (coordinate[i] - altro.coordinate[i]) ,2);
			}
		
		 return Math.sqrt(sommaQuadrati);
			
	 }
}

