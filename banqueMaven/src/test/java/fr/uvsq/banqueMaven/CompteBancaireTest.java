package fr.uvsq.banqueMaven;

import org.junit.Test;

import junit.framework.TestCase;

public class CompteBancaireTest extends TestCase {

	@Test
	public void testNotNull() throws ExceptionDecouvert {
		CompteBancaire cpte = new CompteBancaire(1);
		assertNotNull(cpte);
		System.out.println("gggggggggggggggg");
		
	}
	
	@Test
	public void testSolde() throws ExceptionDecouvert {
		CompteBancaire cpte = new CompteBancaire(3);
		int solde1 = cpte.getsolde();
		assertEquals(3,solde1);
		System.out.println("gggggggggggggggg");
	}
	
	
	

	
}
