package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;


public class StanzaTest {
	Stanza s1 =new Stanza("s1");
	Stanza s2 =new Stanza("s2");
	Stanza s3 =new Stanza(null);
	Attrezzo a1 =new Attrezzo("martello", 10);
	Attrezzo a2 =new Attrezzo("Cacciavite", 5);
	Attrezzo a3 =new Attrezzo("forbice", 3);

	@Before
	public void setUp() {
		System.out.println("Inizio Test");
	}


	@Test
	public void testStanza0() {
		s1.impostaStanzaAdiacente("est", s3);
		assertNull(null, s1.getStanzaAdiacente(null));
	}

	@Test 
	public void testStanza1() {
		s1.impostaStanzaAdiacente("nord", s2);
		assertEquals("Trovata la stanza adiacente", s2,  s1.getStanzaAdiacente ("nord"));
	}

	@Test
	public void testStanza2() {
		s1.impostaStanzaAdiacente("nord", s1);
		assertNotEquals("Le due stanze non sono adiacenti", s2, s1.getStanzaAdiacente("est"));
	}

	@Test
	public void testAttrezzoAggiunto1() {
		assertTrue(s1.addAttrezzo(a1));
	}

	@Test
	public void testStanzasenzaAttrezzoSpada2() {
		s1.addAttrezzo(a1);
		assertNotEquals(true, s1.hasAttrezzo("Spada"));
	}

	@Test
	public void testStanzaconAttrezzo3() {
		s1.addAttrezzo(a1);
		assertEquals(true, s1.hasAttrezzo("martello"));
	}

	@Test 
	public void testRemoveAttrezzo() {
		s1.addAttrezzo(a1);
		assertEquals(true, s1.removeAttrezzo(a1));
	}

	@Test 
	public void testNonRemoveAttrezzo2() {
		s1.addAttrezzo(a1);
		assertFalse( s2.removeAttrezzo(a1));
	}
	
	@Test
	public void testRemoveNullo() {
		assertFalse(s3.removeAttrezzo(a1));
	}

	@Test
	public void testGetAttrezzo() {
		assertNotEquals(a2, s3.getAttrezzo("martello"));
	}
	
	@Test
	public void testGetAttrezzoNullo() {
		assertEquals(null, s3.getAttrezzo(null));
	  }
	}
