package calculos;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

class CalculadoraTest {
	int n;
	
//	@BeforeAll
//	void setup() {
//		n = 7;
//	}
	
	@Before
	void  setup() {
		n = 5;
	}
	
	@Test
	void sumarTest() {
		n = n +3;
		assertEquals(Calculadora.sumar(1, 6), n);
	}
	
	@Test
	void restarTest() {
		assertEquals(Calculadora.restar(6, 1), n);
	}
	
	@Test
	void dividirTest() {
		assertEquals(Calculadora.dividir(4, 2), 2);
	}
	
	@Test
	void multiplicarTest() {
		assertEquals(Calculadora.multiplicar(4, 2), 8);
	}

}
