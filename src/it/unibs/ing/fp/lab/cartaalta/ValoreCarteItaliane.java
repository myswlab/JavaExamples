package it.unibs.ing.fp.lab.cartaalta;

public enum ValoreCarteItaliane implements IValoreCarta {
	ASSO(13, "ASSO"),
	DUE(2, "DUE"),
	TRE(3, "TRE"),
	QUATTRO(4, "QUATTRO"),
	CINQUE(5, "CINQUE"),
	SEI(6, "SEI"),
	SETTE(7, "SETTE"),
	FANTE(8, "FANTE"),
	CAVALLO(9, "CAVALLO"),
	RE(10, "RE");
	
	private int valore;
	private String nome;
	
	ValoreCarteItaliane(int valore, String nome) {
		this.valore = valore;
		this.nome = nome;
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public int getValore() {
		return valore;
	}
}
