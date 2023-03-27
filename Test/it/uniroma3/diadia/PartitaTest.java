package it.uniroma3.diadia;

import static org.junit.Assert.*;
import it.uniroma3.diadia.ambienti.*;
import org.junit.Before;
import org.junit.Test;

public class PartitaTest {
	Labirinto l1=new Labirinto();
	Partita p1=new Partita();
	Partita p2=new Partita();
	Partita p3=new Partita();
	Partita p4=new Partita();
	Partita p5=new Partita();
	Partita p6=new Partita();
	Partita p7=new Partita();
	Partita p8=new Partita();
	Partita p9=new Partita();
	
	@Before
	public void setUp() {
			 
		this.p2.getGiocatore().setCfu(0); //Finita0 vinta0 cfu0
		
		this.p3.setFinita();        //Finita1 vinta0 cfu0
		this.p3.getGiocatore().setCfu(0);
		
		this.p4.getGiocatore().setCfu(1);//Finita0 vinta0 cfu1
		
		this.p5.setStanzaCorrente(this.l1.getStanzaVincente());//Finita0 vinta1 cfu0
		this.p5.getGiocatore().setCfu(0);
		
		this.p6.setStanzaCorrente(this.l1.getStanzaVincente());//Finita0 vinta1 cfu1
		
		this.p7.getGiocatore().setCfu(1);//Finita1 vinta0 cfu1
		this.p7.setFinita();
		
		this.p8.setStanzaCorrente(this.l1.getStanzaVincente());//Finita1 vinta1 cfu0
		this.p8.setFinita();
		this.p8.getGiocatore().setCfu(0);
		
		this.p9.setStanzaCorrente(this.l1.getStanzaVincente());//Finita1 vinta1 cfu1
		this.p9.setFinita();
		this.p9.getGiocatore().setCfu(1);
		
	}
	
	@Test
	public void testVinta() {
		assertEquals(false, p1.vinta());
	}

	
	@Test
	public void testFinita0Vinta0Cfu0() {
		assertEquals(true, p2.isFinita());
	}
	
	@Test
	public void testFinita1Vinta0Cfu0() {
		assertEquals(true, p3.isFinita());

	}
	
	@Test
	public void testFinita0Vinta0Cfu1() {
		assertEquals(false, p4.isFinita());
	}
	
	@Test
	public void testFinita0Vinta1Cfu0() {
		assertEquals(true, p5.isFinita());
	}
	
	@Test
	public void testFinita0Vinta1Cfu1() {
		assertEquals(false, p6.isFinita());
	}
	
	@Test
	public void testFinita1Vinta0Cfu1() {
		assertEquals(true, p7.isFinita());

	}
	
	@Test
	public void testFinita1Vinta1Cfu0() {
		assertEquals(true, p8.isFinita());

	}
	
	@Test
	public void testFinita1Vinta1Cfu1() {
		assertEquals(true, p9.isFinita());

	}
}
