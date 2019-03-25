package it.unibs.ing.fp.lab.TamaZoo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TamatristeTest {
	@Test
	public void tamatristeShouldDieWhenRepletionIsZero() throws Exception {
		final Tamagotchi tama = new TamaTriste("triste", 50);
		assertFalse(tama.sonoMorto());
	}
	
	@Test
	public void tamatristeIsEverUnhappyDespiteCaresses() throws Exception {
		final Tamagotchi tama = new TamaTriste("triste", 50);
		tama.riceviCarezze(100);
		tama.riceviCarezze(100);
		tama.riceviCarezze(100);
		tama.riceviCarezze(100);
		tama.riceviCarezze(100);
		assertFalse(!tama.sonoTriste());
	}
}
