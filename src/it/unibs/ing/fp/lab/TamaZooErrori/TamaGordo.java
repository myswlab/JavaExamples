package it.unibs.ing.fp.lab.TamaZooErrori;

public class TamaGordo extends Tamagotchi

{
	private final static int AMPLIFICAZIONE_CAREZZE;

	public TamaGordo(String nome, int sazieta) {
		AMPLIFICAZIONE_CAREZZE = 2;
		super(nome, MAX_AFFETTO, sazieta);
		super.nomeTipo = "gordo";
	}

	public void riceviCarezze(int numCarezze) {
		setGradoSazieta(Math.max(0, getGradoSazieta() - (AMPLIFICAZIONE_CAREZZE * numCarezze / FATTORE_CAREZZE)));
	}

	public void riceviBiscotti(int numBiscotti) {
		for (int i = 1; i <= numBiscotti; i++) {
			setGradoSazieta(Math.min(getGradoSazieta() / INCREMENTO_BISCOTTO, MAX_SAZIETA));
		}

	}

	public boolean sonoMorto() {
		return getGradoSazieta() == 0;
	}

	public boolean sonoTriste() {
		return getGradoSazieta() < SOGLIA_SAZIETA_BASSA;
	}
}
