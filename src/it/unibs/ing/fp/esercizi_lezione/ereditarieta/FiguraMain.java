package it.unibs.ing.fp.esercizi_lezione.ereditarieta;

public class FiguraMain {

	public static void main(String[] args) {
		Figura [] elencoFigure = 
			{
				new Cerchio(1), 
				new Quadrato(2),
				new Rettangolo(3,4)
			};

		for (Figura figura : elencoFigure) 
		{
			System.out.println(figura.toString());
		}
	}
}


abstract class Figura 
{
	final protected static String MY_FORMAT=
			"Sono un %s Area=%1.3f Perimetro=%1.3f";
	private String nome;

	public abstract double area() ;
	public abstract double perimetro() ;

	public Figura(String _nome) 
	{
		nome = _nome;
	}

	public String toString () 
	{
		return String.format(MY_FORMAT, nome, area(),  
				perimetro());
	}

	protected void setNome(String myName) {
		nome=myName;
	}
}

class Rettangolo extends Figura 
{ 
	private final static String MY_NAME="rettangolo";
	private double lato1, lato2;

	public Rettangolo (double _lato1, double _lato2) 
	{
		super(MY_NAME);
		lato1 = _lato1;
		lato2 = _lato2;
	}
	public double area() 
	{
		return lato1 * lato2;
	}
	public double perimetro() 
	{
		return 2 * (lato1 + lato2);
	}
}

class Cerchio extends Figura 
{ 
	private final static String MY_NAME="cerchio";
	private double raggio;

	public Cerchio (double _raggio) 
	{
		super(MY_NAME);
		raggio = _raggio;
	}

	public double area() 
	{
		return raggio * raggio * Math.PI;
	}
	public double perimetro() 
	{
		return 2 * raggio * Math.PI;
	}
}

class Quadrato extends Rettangolo 
{
	private final static String MY_NAME="quadrato";

	public Quadrato (double lato) 
	{
		super(lato, lato);
		setNome(MY_NAME);
	}

}