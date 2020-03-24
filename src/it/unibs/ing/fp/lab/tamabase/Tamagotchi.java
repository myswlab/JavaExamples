package it.unibs.ing.fp.lab.tamabase;

public class Tamagotchi {

	public final static int MAX_AFFETTO = 100;
	public final static int MAX_SAZIETA = 100;

	public final static int SOGLIA_AFFETTO_BASSA = 30;
	public final static int SOGLIA_SAZIETA_BASSA = 30;

	public final static int SOGLIA_AFFETTO_ALTA = 80;
	public final static int SOGLIA_SAZIETA_ALTA = 80;

	public final static int DIMINUZIONE_SAZIETA = 5;
	public final static int DIMINUZIONE_AFFETTO = 5;

	private final static String DESCRIZIONE = "Sono %s%nIl mio grado di sazieta' e' %d%nIl mio grado di soddisfazione affettiva e' %d%n";
	private final static String MESSAGGIO_TRISTE = "Attenzione sono infelice!";
	private final static String MESSAGGIO_FELICE = "Sono felice!";

	private String nome;
	private int soddisfazione;
	private int sazieta;

	public Tamagotchi(String nome, int soddisfazione, int sazieta) {
		this.nome = nome;
		this.soddisfazione = soddisfazione;
		this.sazieta = sazieta;
	}

	public void daiCarezze(int carezze) {
		soddisfazione = Math.min(MAX_AFFETTO, soddisfazione + carezze);
		sazieta = Math.max(0, sazieta - DIMINUZIONE_SAZIETA);
	}

	public void daiBiscotti(int biscotti) {
		sazieta = Math.min(MAX_SAZIETA, sazieta + biscotti);
		soddisfazione = Math.max(0, soddisfazione - DIMINUZIONE_AFFETTO);
	}

	public boolean isTriste() {
		return soddisfazione < SOGLIA_AFFETTO_BASSA || sazieta < SOGLIA_SAZIETA_BASSA;
	}

	public boolean isFelice() {
		return soddisfazione > SOGLIA_AFFETTO_ALTA && sazieta > SOGLIA_SAZIETA_ALTA;
	}

	public String toString() {
		StringBuffer descrizione = new StringBuffer();
		descrizione.append("Nome = " + nome);
		descrizione.append("\nSazieta = " + sazieta);
		descrizione.append("\nSoddisfazione = " + soddisfazione);
		if(isTriste()) {
			descrizione.append("Sono triste");
		}
		if(isFelice()) {
			descrizione.append("Sono felice");
		}
		return descrizione.toString();
	}

}
