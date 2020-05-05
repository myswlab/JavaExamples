package it.unibs.ing.fp.lab.cd;

import static org.junit.Assert.*;

import org.junit.Test;

public class BranoTest {
	private static final String TITOLO = "Il pescatore";
	private static final int MM = 4;
	private static final int SS = 46;

	@Test
	public void testToString() throws Exception {
		assertEquals("Il pescatore [04:46] ", new Brano(TITOLO, MM, SS).toString());
	}
}
