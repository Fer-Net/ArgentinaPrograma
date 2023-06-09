package compras;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class TestCarrito {

	@Test
	void testCostoFinalDescuentoFijo() {
		Producto producto1 = new Producto("arroz", "34F23",2000);
		Producto producto2 = new Producto("atun", "34234",2000);
		Producto producto3 = new Producto("sal", "34S23",2000);
		Carrito miCarrito = new Carrito(producto1,producto2,producto3, LocalDateTime.parse("2023-01-13T11:12:00"));
		Descuento desFijo = new DescuentoFijo(2000);

		float valorFinal = miCarrito.costoFinal(desFijo);
		assertEquals(valorFinal, 4000);

	}
	
	@Test
	void testCostoFinalDescuentoPorcentaje() {
		Producto producto1 = new Producto("arroz", "34F23",4000);
		Producto producto2 = new Producto("atun", "34234",4000);
		Producto producto3 = new Producto("sal", "34S23",2000);
		Carrito miCarrito = new Carrito(producto1,producto2,producto3, LocalDateTime.parse("2023-01-13T11:12:00"));
		Descuento desFijo = new DescuentoPorcentaje(0.50F);

		float valorFinal = miCarrito.costoFinal(desFijo);
		assertEquals(valorFinal, 5000);
	}

	@Test
	void testCostoFinalDescuentoPorcentajeConTOpe() {
		Producto producto1 = new Producto("arroz", "34F23",4000);
		Producto producto2 = new Producto("atun", "34234",4000);
		Producto producto3 = new Producto("sal", "34S23",2000);
		Carrito miCarrito = new Carrito(producto1,producto2,producto3, LocalDateTime.parse("2023-01-13T11:12:00"));
		Descuento desPorcentaje = new DescuentoPorcentajeConTope(0.50F);
		desPorcentaje.setValorDesc(0.20F);
		float valorFinal = miCarrito.costoFinal(desPorcentaje);
		assertEquals(valorFinal, 8000);
		
	}
}
