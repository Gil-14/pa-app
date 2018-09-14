package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import pa.app.AppTest;

class CalcTest {

	Calc c = new Calc();
	private static final Logger logger = Logger.getLogger( AppTest.class.getName() );
	
	@Test
	void testSomar() {
		int soma = c.somar(1, 2);
		assertTrue(soma == 3);
		logger.info("test Somar: 1+2=3");
	}

	@Test
	void testSubtrair() {
		int subtrair = c.subtrair(5, 1);
		assertTrue(subtrair == 4);
		logger.info("test Subtrair: 5-1=4");
	}

	@Test
	void testMultiplicar() {
		int multplicar = c.multiplicar(2, 8);
		assertTrue(multplicar == 16);
		logger.info("test Multiplicar: 2*8=16");
	}

	@Test
	void testDividir() {
		int dividir = c.dividir(20, 2);
		assertTrue(dividir == 10);
		logger.info("test Dividir: 20/2=10");
	}

}
