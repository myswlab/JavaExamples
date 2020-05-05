package it.unibs.ing.fp.lab.cderrori;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class CdTest {
	private static final String TITOLO = "Anime salve";
	private static final String AUTORE = "Fabrizio De Andrè";

	@Test
	public void testToStringSenzaBrani() throws Exception {
		assertEquals("Titolo: Anime salve, Autore: Fabrizio De Andrè, Lista dei brani:", new Cd(TITOLO, AUTORE).toString().trim());
	}

	@Test
	public void testToStringConBrani() throws Exception {
		final Cd cd = new Cd(TITOLO, AUTORE);
		cd.aggiungiBrano(new Brano("Anime salve", 5, 52));
		cd.aggiungiBrano(new Brano("Le acciughe fanno il pallone", 4, 47));
		cd.aggiungiBrano(new Brano("Smisurata preghiera", 7, 8));
		assertEquals(
				"Titolo: Anime salve, Autore: Fabrizio De Andrè, Lista dei brani: Anime salve [05:52] Le acciughe fanno il pallone [04:47] Smisurata preghiera [07:08] ",
				cd.toString());
	}

	@Test
	public void testHaTitoloTrue() throws Exception {
		final Cd cd = new Cd(TITOLO, AUTORE);
		assertTrue(cd.haTitolo(TITOLO));
	}

	@Test
	public void testHaTitoloFalse() throws Exception {
		final Cd cd = new Cd(TITOLO, AUTORE);
		assertFalse(cd.haTitolo("La buona novella"));
	}

	@Test
	public void testEstrazioneCasualeBrano() throws Exception {
		final Cd cd = new Cd("_A Title_", "_An Author_");
		final int numeroBrani = 10;
		for (int i = 0; i < numeroBrani; i++) {
			cd.aggiungiBrano(new Brano("Brano " + i, i, i));
		}
		final int numeroEstrazioni = 100;
		Set<String> titoliBraniEstratti = new HashSet<String>();
		for (int i = 0; i < numeroEstrazioni; i++) {
			Brano b = cd.branoCasuale();
			titoliBraniEstratti.add(b.getTitolo());
		}
		assertTrue(titoliBraniEstratti.size() >= 7);
	}
}
