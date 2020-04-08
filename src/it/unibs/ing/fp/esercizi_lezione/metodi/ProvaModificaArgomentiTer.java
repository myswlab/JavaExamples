package it.unibs.ing.fp.esercizi_lezione.metodi;

public class ProvaModificaArgomentiTer {
	public static void main(String[] args) {

		String pippo = new String("Evviva l'Ingegneria !");
		System.out.println("Prima del metodo:" + pippo);
		metodoProva(pippo);
		System.out.println("Dopo il metodo:" + pippo);
		metodoProva2();
	}

	static void metodoProva(String daCambiare) {

		daCambiare = new String("Abbasso l'Ingegneria !");

		System.out.println("Dentro il metodo:" + daCambiare);

	}
	

	static void metodoProva2() {
		String s = "ciao";
		String t = "Bella " + "ciao";
		String q = t.toUpperCase();
		String w = t.toUpperCase() + s.toUpperCase();
		System.out.println(w);
	}

}