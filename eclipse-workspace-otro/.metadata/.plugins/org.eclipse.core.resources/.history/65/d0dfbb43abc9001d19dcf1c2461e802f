package tito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
class CalculadoraTest {
	int n;
	
//	@BeforeAll
//	void setup() {
//		n = 7;
//	}
	
	@BeforeEach
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
