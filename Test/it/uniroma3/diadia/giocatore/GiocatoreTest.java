package it.uniroma3.diadia.giocatore;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class GiocatoreTest {
	Giocatore g1 = new Giocatore();
	Giocatore g2 = new Giocatore();
	Giocatore g3=new Giocatore();
	
	@Before
	public void setUp() {
		g1.setCfu(20);
		g3.setCfu(0);
	}
	
	@Test
	public void testgetCfuIniziali() {
		assertEquals("I cfu iniziali coincidono", 20, g1.getCfu());	
	}
	
	@Test
	public void testBorsa () {
		assertNotNull(g1.getCfu());
	}
	
	@Test
	public void testCfuDiversi() {
		assertNotEquals("Non si hanno gli stessi Cfu", 5, g2.getCfu());
	}
	
	@Test 
	public void testCfuzero() {
		assertEquals("I cfu sono Zero", 0, g3.getCfu());
	}
}
