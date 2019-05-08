package it.unibs.ing.fp.lab.libro;

public class Vocabolario extends Libro {
	
	
	private static final String DEFINITION_MESSAGE = "Il numero di definioni è ";
	private static final String DEFINITION_PER_PAGE_MESSAGE = "il numero medio di definizioni per pagina è %.2f";
	protected int numDefinizioni;
	
	Vocabolario(int pagine, int definizioni) {
		super(pagine);
		this.numDefinizioni = definizioni;
				
	}
	
	public void definitionMessage() {
		pageMessage();
		numberOfDefinitionMessage();
		averageDefinitionPerPageMessage();
		
	}
	
	
	private void numberOfDefinitionMessage() {
		System.out.println(DEFINITION_MESSAGE + numDefinizioni);
	}
	
	
	private void averageDefinitionPerPageMessage() {
		double avg = (double) numDefinizioni / (double) numPagine;
		System.out.println(String.format(DEFINITION_PER_PAGE_MESSAGE, avg));
		
		
	}
	

}
