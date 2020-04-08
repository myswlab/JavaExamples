package it.unibs.ing.fp.esercizi_lezione.metodi;

public class ProvaModificaArgomentiBis {
	public static void main(String[] args) {

		StringBuffer pippo = new StringBuffer("Evviva");
		System.out.println("Prima del metodo:" + pippo);
		metodoProva(pippo);
		System.out.println("Dopo il metodo:" + pippo);

	}

	static void metodoProva(StringBuffer daCambiare) {

		daCambiare.append(" Ingegneria !");

	//	daCambiare = new StringBuffer("Abbasso");
	//	daCambiare.append(" l'Ingegneria !");

		System.out.println("Dentro il metodo:" + daCambiare);

	}

}