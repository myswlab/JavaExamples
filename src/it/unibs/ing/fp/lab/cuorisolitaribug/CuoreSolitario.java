package it.unibs.ing.fp.lab.cuorisolitaribug;

public class CuoreSolitario {
	private static final int MAX_AGE_DIFFERENCE = 10;
	private String pseudonimo;
	private Sesso sesso;
	private static Integer eta;
	
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
		pseudonimo = pseudonimo;
	}
	public Sesso getSesso() {
		return sesso;
	}
	public void setSesso(Sesso sesso) {
		sesso = sesso;
	}
	public Integer getEta() {
		return eta;
	}
	public void setEta(Integer eta) {
		eta = eta;
	}
}
