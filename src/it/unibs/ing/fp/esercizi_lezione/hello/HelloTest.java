package it.unibs.ing.fp.esercizi_lezione.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {
	@Test
	public void testSayHello() throws Exception {
		final String result = new Hello().sayHello();
		assertEquals("Hello, World!", result);
	}

	@Test
	public void testSayHelloTo() throws Exception {
		final String result = new Hello().sayHelloTo("boys");
		assertEquals("Hello, boys!", result);
	}

	@Test
	public void testSayHelloWitchCustomMessage() throws Exception {
		final String result = new Hello("Hi").sayHelloTo("boys");
		assertEquals("Hi, boys!", result);
	}
}
