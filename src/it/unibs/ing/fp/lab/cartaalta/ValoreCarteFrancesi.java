package it.unibs.ing.fp.lab.cartaalta;


public enum ValoreCarteFrancesi implements IValoreCarta {
	ASSO(14, "ASSO"),
	DUE(2, "DUE"),
	TRE(3, "TRE"),
	QUATTRO(4, "QUATTRO"),
	CINQUE(5, "CINQUE"),
	SEI(6, "SEI"),
	SETTE(7, "SETTE"),
	OTTO(8, "OTTO"),
	NOVE(9, "NOVE"),
	DIECI(10, "DIECI"),
	JACK(11, "JACK"),
	DONNA(12, "DONNA"),
	RE(13, "RE");
	private int valore;
	private String nome;
	
	ValoreCarteFrancesi(int valore, String nome) {
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
