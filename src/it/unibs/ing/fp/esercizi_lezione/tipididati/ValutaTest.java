package it.unibs.ing.fp.esercizi_lezione.tipididati;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;


public class ValutaTest {

	Valuta sterlina = new Valuta("Sterlina",1.40);
	Valuta dollaro = new Valuta("Dollaro",0.67);
	Valuta franco = new Valuta("Franco Svizzero",0.60);
	double delta=0.01;


	@Test
	public void testTassoConversioneSterlinaDollaro() {
		
		assertEquals(2.089, sterlina.tassoConversione(dollaro), delta);		
	
	}

	@Test
	public void testTassoConversioneDollaroSterlina() {
		
		assertEquals(0.478, dollaro.tassoConversione(sterlina), delta);		
	
	}


	@Test
	public void testTassoConversioneDollaroFranco() {
		
		assertEquals(1.116, dollaro.tassoConversione(franco), delta);		
	
	}
	
	
	
}
