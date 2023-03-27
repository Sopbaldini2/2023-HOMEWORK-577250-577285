package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LabirintoTest {
	Labirinto l1=new Labirinto();
	Stanza s1=new Stanza("atrio");
	Stanza s2=new Stanza("Biblioteca");


	@Before
	public void SetUp() {
	s1=this.l1.getStanzaVincente();
	s2=this.l1.getStanzaCorrente();
	}
	
	
	@Test
	public void testGetvincente() {
		assertEquals(s1, l1.getStanzaVincente());
	}
	
	@Test 
	public void testGetnoVincente() {
		assertNotEquals(s2, l1.getStanzaVincente());
	}
		
	@Test
	public void testGetStnzacorrente() {
		assertEquals(s2, l1.getStanzaCorrente());
	}
	
	@Test
	public void testGetNonStnzacorrente() {
		assertNotEquals(s1, l1.getStanzaCorrente());
	}
}
