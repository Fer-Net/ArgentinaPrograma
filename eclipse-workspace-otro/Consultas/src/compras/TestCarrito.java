package compras;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCarrito {
	
	private Persona persona;
	private Carrito carrito;
	
	
	void setup(String archivo) {
		String archivoEntrada = archivo; //en la raiz del proyecto
		List<String> lista = new ArrayList<String>();
		Carrito carrito = new Carrito(LocalDateTime.parse("2023-01-13T11:12:00"));
		try {
			lista = Files.readAllLines(Paths.get(archivoEntrada));
			lista.remove(0);
			for (String linea : lista) {
				String[] datosProducto = linea.split(" ");
				Producto p = new Producto(datosProducto[1], datosProducto[2],Float.parseFloat(datosProducto[0]));
				carrito.agregarProducto(p);
			}
			
		}catch(IOException e) {
			System.out.println("hubo un error en la operacion" + e);
		}
		
		this.persona = new Persona("fer", "torres", LocalDateTime.parse("1980-03-13T11:12:00"), carrito );
		this.carrito = this.persona.getCarrito();

		

		
	}
	
	
	@Test
	void testValorCeroException() {
		setup("comprasCero.txt");
		Descuento desFijo = new DescuentoFijo(3990);
		Assertions.assertThrows(ValorCeroException.class, () -> {this.carrito.costoFinal(desFijo);});
	}
	
	@Test
	void testTotalNegativoException() {
		setup("compras.txt");
		Descuento desFijo = new DescuentoFijo(1000);
		Assertions.assertThrows(TotalNegativoException.class, () -> {this.carrito.costoFinal(desFijo);});
	}
	
//	@Test
//	void testCostoFinalDescuentoFijo() {
//
//		Carrito miCarrito = new Carrito(producto1,producto2,producto3, LocalDateTime.parse("2023-01-13T11:12:00"));
//		Descuento desFijo = new DescuentoFijo(2000);
//
//		float valorFinal = miCarrito.costoFinal(desFijo);
//		assertEquals(valorFinal, 4000);
//
//	}
//	
//	@Test
//	void testCostoFinalDescuentoPorcentaje() {
//		Producto producto1 = new Producto("arroz", "34F23",4000);
//		Producto producto2 = new Producto("atun", "34234",4000);
//		Producto producto3 = new Producto("sal", "34S23",2000);
//		Carrito miCarrito = new Carrito(producto1,producto2,producto3, LocalDateTime.parse("2023-01-13T11:12:00"));
//		Descuento desFijo = new DescuentoPorcentaje(0.50F);
//
//		float valorFinal = miCarrito.costoFinal(desFijo);
//		assertEquals(valorFinal, 5000);
//	}
//
//	@Test
//	void testCostoFinalDescuentoPorcentajeConTOpe() {
//		Producto producto1 = new Producto("arroz", "34F23",4000);
//		Producto producto2 = new Producto("atun", "34234",4000);
//		Producto producto3 = new Producto("sal", "34S23",2000);
//		Carrito miCarrito = new Carrito(producto1,producto2,producto3, LocalDateTime.parse("2023-01-13T11:12:00"));
//		Descuento desPorcentaje = new DescuentoPorcentajeConTope(0.50F);
//		desPorcentaje.setValorDesc(0.20F);
//		float valorFinal = miCarrito.costoFinal(desPorcentaje);
//		assertEquals(valorFinal, 8000);
//		
//	}
}
