package it.uniroma3.diadia.giocatore;

import static org.junit.Assert.*;

import it.uniroma3.diadia.attrezzi.*;
import org.junit.Test;
import org.junit.Before;

public class BorsaTest {
	Borsa b1=new Borsa();
	Borsa b2=new Borsa();
	Borsa b3=new Borsa();
	Attrezzo a1=new Attrezzo("Martello", 10);
	Attrezzo a2=new Attrezzo ("Spada", 5);
	
	
	@Before
	public void SetUp() {
		b1.addAttrezzo(a2);
		b2.addAttrezzo(a2);
		b3.addAttrezzo(a1);
	}

	@Test
	public void testAddAttrezzo() {
		assertTrue(b1.addAttrezzo(a2));
	}
		
	@Test
	public void testRimuoveAttrezzo() {
		assertEquals(a2, b1.removeAttrezzo("Spada"));
	}

	@Test
	public void testNonRimuoveAttrezzo() {
		assertEquals(null, b1.removeAttrezzo("Martello"));
	}

	@Test
	public void testHasattrezzo() {
		assertEquals(false, b2.hasAttrezzo("Martello"));
	}
	
	@Test
	public void testHasattrezzo2() {
		assertEquals(true, b2.hasAttrezzo("Spada"));
	}
	
	@Test
	public void testGetPeso() {
		assertEquals(10, b3.getPeso());
	}
	
	@Test
	public void testNoGetAttrezzo() {
		assertNotEquals(a2, b1.getAttrezzo("Martello"));
	}
	
	@Test
	public void testGetAttrezzo() {
		assertEquals(a1, b3.getAttrezzo("Martello"));
	}
}
