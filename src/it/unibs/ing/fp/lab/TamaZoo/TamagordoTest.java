package it.unibs.ing.fp.lab.TamaZoo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TamagordoTest {
	@Test
	public void tamagordoShouldNotDieDueToTooManyCookies() throws Exception {
		Tamagotchi tama = new TamaGordo("gordo", 90);
		tama.riceviBiscotti(100);
		tama.riceviBiscotti(100);
		assertTrue(!tama.sonoTriste());
		assertTrue(!tama.sonoTriste());
	}

	@Test
	public void tamagordoDiesDueToHunger() throws Exception {
		Tamagotchi tama = new TamaGordo("gordo", 0);
		assertTrue(tama.sonoMorto());
	}
}
