package it.unibs.ing.fp.lab.traffico;

import it.unibs.ing.fp.lab.mylib.*;

public class Strada {

    final static double PROB_AUTO=0.1;
	final static double PROB_PEDONE=0.1;
	
	final static char SEPARATORE = '|';
	final static char ELEMENTOCORNICE = '-';
	final static char SPAZIO = ' ';
	final static int LARGHEZZACASELLA = 4;
	
	final static String MESSAGGIOCOLLISIONE = "ATTENZIONE! COLLISIONE IN POSIZIONE:";
	
	private int numRighe;
	private int numColonne;
	private Elemento[][] mappa; 
	
	public Strada (int dimensioneR, int dimensioneC) 
	{
	    numRighe = dimensioneR;
		numColonne = dimensioneC;
		
		mappa = new Elemento[dimensioneR][dimensioneC]; 
	}
	
	public void inizializza() {
		for ( int x = 0; x < mappa.length; x++ ) {
			for ( int y = 0; y < mappa[x].length; y++ ) {
				mappa[x][y] = oggettoCasuale();
			}			
		}
	}
	
	private Elemento oggettoCasuale() 
	{
		double casuale = Math.random();
		
		if ( casuale <  PROB_AUTO)
		{
			return new Auto();
		}
		else
		if ( casuale < (PROB_AUTO+PROB_PEDONE) )
		{
			return new Pedone(); 
		}
		else
		{
			return new Vuoto(); 
		}
	}
		
	public void evoluzione() 
	{
		Elemento[][] prossimaMappa = mappaVuota(mappa.length, mappa[0].length);
		
		for ( int x = 0; x < mappa.length; ++x ) 
		 {
			for ( int y = 0; y < mappa[x].length; ++y ) 
			{
			 Elemento esaminato = mappa[x][y];
			 Coordinate prossimaPosizione = esaminato.getProssimaPosizione(x,y);
			 if (prossimaPosizione.staDentro(mappa.length,mappa[x].length))
				{
	 			 Elemento altro = prossimaMappa[prossimaPosizione.getRiga()][prossimaPosizione.getColonna()];
				 if (esaminato.collisioneCon(altro))
					{
					 System.out.println(MESSAGGIOCOLLISIONE + prossimaPosizione.toString());
					}
			   if (esaminato.prevaleSu(altro))
				  {
				   piazzaElemento(esaminato, prossimaPosizione, prossimaMappa);
				  }
				} // if esterno
			 } // for y			
		 } // for x
		
		mappa = prossimaMappa;
	}


   

	public String toString() 
	{
		StringBuffer descrizione = new StringBuffer();
		String cornice = BelleStringhe.ripetiChar(ELEMENTOCORNICE,LARGHEZZACASELLA*(mappa[0].length+1));
		String rientro = BelleStringhe.ripetiChar(SPAZIO,LARGHEZZACASELLA);
		
		descrizione.append(rientro); // SPAZI INIZIALI SULLA RIGA DEI NUMERI COLONNA
		
		for (int i = 1; i <= mappa[0].length; i++) // RIGA CON I NUMERI DI COLONNA
		 descrizione.append(BelleStringhe.centrata(Integer.toString(i),LARGHEZZACASELLA));
			
		descrizione.append(BelleStringhe.rigaIsolata(cornice));
		
		for ( int x = 0; x < mappa.length; ++x ) 
		 {
			descrizione.append(BelleStringhe.centrata(Integer.toString(x+1),LARGHEZZACASELLA)); // NUMERO DI RIGA
			
			for ( int y = 0; y < mappa[x].length; ++y ) 
			 {
				descrizione.append(BelleStringhe.centrata(mappa[x][y].toString(),LARGHEZZACASELLA));
			 }
			
			descrizione.append(BelleStringhe.rigaIsolata(cornice));	 
		 }
		return descrizione.toString();
	}	
	
 public void piazzaElemento (Elemento daPiazzare, Coordinate dovePiazzarlo, Elemento[][] nuovaMappa  )
	{
	  nuovaMappa[dovePiazzarlo.getRiga()][dovePiazzarlo.getColonna()] = daPiazzare;
	}
 
 private Elemento [][] mappaVuota(int numRighe, int numColonne)
	{
	  Elemento [][] nuovaMappa = new Elemento[numRighe][numColonne];
		for ( int x = 0; x < nuovaMappa.length; ++x ) 
		{
			for ( int y = 0; y < nuovaMappa[x].length; ++y ) 
			{
			 nuovaMappa[x][y] = new Vuoto();
			}
		}
		return nuovaMappa;
  }

}
