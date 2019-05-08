package it.unibs.ing.fp.lab.libro;

public class MainClass {
	
	public static void main(String args[]) {
		Libro libro = new Libro(10);
		Vocabolario vocabolario = new Vocabolario(30, 10);
		libro.pageMessage();
		System.out.println("---");
		
		vocabolario.pageMessage();
		System.out.println("---");
		
		vocabolario.definitionMessage();
		
		
	}

}
