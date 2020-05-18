package it.unibs.ing.fp.lab.cartaalta;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PartitaTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = IllegalArgumentException.class)
	public void creditoNegativo() {
		new Partita("Player", -1, null);
	}
	
	@Test
	public void estraiFranceseTest() {
		Partita p = new Partita("Player", 15, TipoMazzo.FRANCESE);
		Carta c = p.estraiCarta();
		assertNotNull(c);
	}
	
	@Test
	public void scommessaVinta() {
		Partita p = new Partita("Player", 15);
		Carta cUtente = new Carta("PICCHE", ValoreCarteFrancesi.ASSO);
		Carta cPC = new Carta("PICCHE", ValoreCarteFrancesi.DUE);
		p.scommetti(15, cUtente, cPC);
		assertEquals(p.getCredito(), 30);
	}
	
	@Test
	public void scommessaPersa() {
		Partita p = new Partita("Player", 15);
		Carta cUtente = new Carta("PICCHE", ValoreCarteFrancesi.DUE);
		Carta cPC = new Carta("PICCHE", ValoreCarteFrancesi.ASSO);
		p.scommetti(15, cUtente, cPC);
		assertEquals(p.getCredito(), 0);
	}
	
	
	@Test
	public void partitaPattaNonFinita() {
		Partita p = new Partita("Player", 15);
		Carta cUtente = new Carta("PICCHE", ValoreCarteFrancesi.ASSO);
		Carta cPC = new Carta("PICCHE", ValoreCarteFrancesi.ASSO);
		p.scommetti(15, cUtente, cPC);
		assertFalse(p.isFinita());
	}
}
