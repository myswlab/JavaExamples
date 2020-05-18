package it.unibs.ing.fp.lab.cartaalta;



import java.util.ArrayList;

import it.unibs.fp.mylib.EstrazioniCasuali;

public abstract class Mazzo {
	private ArrayList<Carta> listaCarte = new ArrayList<Carta>();
	

	
	public Mazzo(TipoMazzo tipo) {
		listaCarte = costruisciMazzo(tipo.getSemi(), tipo.getValori());
	}
	
	public ArrayList<Carta> getListaCarte() {
		return listaCarte;
	}

	public void setListaCarte(ArrayList<Carta> listaCarte) {
		this.listaCarte = listaCarte;
	}

	private ArrayList<Carta> costruisciMazzo(String[] semi, IValoreCarta[] valori){
		ArrayList<Carta> result = new ArrayList<Carta>();
		for (String seme: semi) {
			for (IValoreCarta valore: valori) {
				Carta carta = new Carta(seme, valore);
				result.add(carta);
			}
		}
		return result;
	}
	
	public Carta estrai() {
		int estratto = EstrazioniCasuali.estraiIntero(0, listaCarte.size()-1);
		return listaCarte.get(estratto);
	}
}
