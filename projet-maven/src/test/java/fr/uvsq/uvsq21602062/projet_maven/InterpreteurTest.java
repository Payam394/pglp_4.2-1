package fr.uvsq.uvsq21602062.projet_maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class InterpreteurTest {

	@Test
	public void testAjouterUndo() {
		Interpreteur i = new Interpreteur();
		assertTrue(i.ajouter("undo") == 1);
	}
	
	@Test
	public void testAjouterQuit() {
		Interpreteur i = new Interpreteur();
		assertTrue(i.ajouter("quit") == 1);
	}
	
	@Test
	public void testAjouterAutre() {
		Interpreteur i = new Interpreteur();
		assertTrue(i.ajouter("autre") == 0);
	}

}