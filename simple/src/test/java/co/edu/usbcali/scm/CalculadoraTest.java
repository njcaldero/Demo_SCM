package co.edu.usbcali.scm;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSUMA() {
		Calculadora c = new CalculadoraImpl();
		
		c.sumar(4, 4);
		assertTrue(c.getResultado()==8);
	}

	@Test
	public void testRESTA() {
		Calculadora c = new CalculadoraImpl();
		
		c.restar(4, 4);
		assertTrue(c.getResultado()==0);
	}
	
}
