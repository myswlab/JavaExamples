package it.unibs.ing.fp.lab.cartaalta;

import java.util.ArrayList;

public class Partita
{
	private int credito;
	private String nomeGiocatore;
	private Mazzo mazzo;
  
	public Partita(String player, int soldi, TipoMazzo tipo)
	 {
		checkCredito(soldi);
		this.nomeGiocatore = player;
		this.credito = soldi;
		this.mazzo = tipo == TipoMazzo.ITALIANO ? new MazzoItaliano(): new MazzoFrancese();
	 }
	
	public Partita(String player, int soldi) {
		checkCredito(soldi);
		this.nomeGiocatore = player;
		this.credito = soldi;
		this.mazzo = new MazzoItaliano();
	}
	
	private void checkCredito(int credito) {
		if (credito <= 0) {
			throw new IllegalArgumentException("Il saldo iniziale deve essere positivo");
		}
	}
	
	public Carta estraiCarta() {
		return this.mazzo.estrai();
	}
	
	/***
	 * 
	 * @param somma importo della scommessa
	 * @param utente carta estratta dall'utente
	 * @return esito della scommessa
	 */
	public EsitoScommessa scommetti(int somma, Carta cartaUtente, Carta cartaPC) {
		int differenza = cartaUtente.compareTo(cartaPC);
		EsitoScommessa esito = calcolaEsito(differenza);
		aggiornaSaldoCredito(esito, somma);
		return esito;
	}
	
	private EsitoScommessa calcolaEsito(int differenza) {
		if (differenza > 0) {
			return EsitoScommessa.VINTA;
		} else if (differenza == 0) {
			return EsitoScommessa.PATTA;
		}
		return EsitoScommessa.PERSA;
	}
	
	private void aggiornaSaldoCredito(EsitoScommessa esito, int somma) {
		switch(esito) {
			case VINTA:
				this.credito = this.credito + somma;
				break;
				
			case PERSA:
				this.credito = this.credito - somma;
				break;
				
			default:
				break;
		}
	}
	
	public void setCarte(ArrayList<Carta> carte) {
		this.mazzo.setListaCarte(carte);
	}
	
	public String getNomeGiocatore() {
		return nomeGiocatore;
	}
	
	
	public int getCredito() {
		return this.credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	public boolean isFinita() {
		return this.credito <= 0;
	}
}

