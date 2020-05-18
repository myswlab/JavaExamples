package it.unibs.ing.fp.lab.cartaalta;

public class Carta {
	IValoreCarta valoreCarta;
	String seme;
	
	public Carta(String seme, IValoreCarta valore) {
		this.seme = seme;
		this.valoreCarta = valore;
	}
	
	public int getValore() {
		return valoreCarta.getValore();
	}
	
	public int compareTo (Carta altra){
		return this.getValore() - altra.getValore();
	}

	@Override
	public String toString() {
		return "[" + this.seme + "]: " + this.valoreCarta.getNome() + " (" + getValore() + ")";
	}
}
