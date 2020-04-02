package it.unibs.ing.fp.lab.cuorisolitari;

public class CuoreSolitario {
	private static final int MAX_AGE_DIFFERENCE = 10;
	private String pseudonimo;
	private Genere sesso;
	private Integer eta;
	
	public boolean isAffineWith(CuoreSolitario cuoreSolitario) {
		if(this.sesso.equals(cuoreSolitario.getSesso()))
			return false;
		int diff = Math.abs(this.eta-cuoreSolitario.getEta());
		if(diff>=MAX_AGE_DIFFERENCE)
			return false;
		return true;
	}
	
	public String toString() {
		return this.pseudonimo;
	}
	
	public String getPseudonimo() {
		return pseudonimo;
	}
	public void setPseudonimo(String pseudonimo) {
		this.pseudonimo = pseudonimo;
	}
	public Genere getSesso() {
		return sesso;
	}
	public void setSesso(Genere sesso) {
		this.sesso = sesso;
	}
	public Integer getEta() {
		return eta;
	}
	public void setEta(Integer eta) {
		this.eta = eta;
	}
}
