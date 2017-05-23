package it.polimi.ingsw.GC_00;
import static org.junit.Assert.*;

import org.junit.Test;

public class FattorialeTest {

	@Test
	public void testFattorialeZero() {
		assertEquals(1, Fattoriale.fattoriale(0));
	}
	
	@Test
	public void testFattorialeUno() {
		assertEquals(1, Fattoriale.fattoriale(1));
	}
	
	@Test
	public void testFattorialeQuattro() {
		assertEquals(24, Fattoriale.fattoriale(4));
	}
}
