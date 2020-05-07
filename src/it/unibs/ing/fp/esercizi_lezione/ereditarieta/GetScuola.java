package it.unibs.ing.fp.esercizi_lezione.ereditarieta;

public class GetScuola {
	public static void main (String [] args) 
	{
		Componente[] lista=
			{
				new Componente("Carlo", "Verdi"),
				new Componente("Mario", "Rossi"), 
				new Ingegnere("Mario", "Rossetti"),
				new Titolato("Giuseppe", "Bianchi", "Prof."),
				new Titolato("Maria", "Celeste", "Dr.ssa")
			};

		Commissione consiglioClasse=new Commissione(lista);
		consiglioClasse.stampaLista();

		double esborso = consiglioClasse.costoRiunione(); 
		System.out.println("Esborso Totale: " +esborso );

	}
}

class Commissione 
{
	private Componente [] elenco;
	public Commissione(Componente[] lista) {
		elenco=lista;
	}

	public void stampaLista () 
	{
		for (Componente membro : elenco)
			System.out.println(membro.toString());
	}

	public double costoRiunione ()
	{
		double totale = 0;
		for (Componente membro : elenco)
			totale = totale + membro.compenso();
		return totale;
	}
}


class Componente 
{
	private String nome;
	private String cognome;

	public Componente (String _nome, String _cognome) 
	{
		nome = _nome;
		cognome = _cognome ;
	}

	public String toString( ) 
	{
		return nome + " " + cognome; 
	}

	public double compenso()
	{
		return 0;
	}
}

class Titolato extends Componente
{
	final protected static double GETTONE = 50;
	private String titolo;

	public Titolato(String nome,String cognome,String _titolo)
	{
		super(nome, cognome);
		titolo = _titolo;
	}

	public String toString() 
	{
		return titolo + " " + super.toString();
	}

	public double compenso()
	{
		return GETTONE;
	}
}
class Ingegnere extends Titolato 
{
	final private static String MIO_TITOLO = "Dr.Ing.";

	public Ingegnere(String nome, String cognome) 
	{
		super(nome, cognome, MIO_TITOLO);
	}

	public double compenso()
	{
		return GETTONE*2;
	}

}
