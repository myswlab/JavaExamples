package it.unibs.ing.fp.lab.cartaalta;


public enum TipoMazzo {
	ITALIANO("ITALIANO", new String[]{"SPADE", "BASTONI", "COPPE", "DENARI"}, ValoreCarteItaliane.values()),
	FRANCESE("FRANCESE", new String[] {"CUORI", "QUADRI", "PICCHE", "FIORI"}, ValoreCarteFrancesi.values());
	
	private String name;
	private String[] semi;
	private IValoreCarta[] valori;
	
	TipoMazzo(String name, String[] semi, IValoreCarta[] valori){
		this.name = name;
		this.valori = valori;
		this.semi = semi;
	}
	
	public String getName() {
		return name;
	}

	public String[] getSemi() {
		return semi;
	}
	
	public IValoreCarta[] getValori() {
		return valori;
	}
	
}
