package compras;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Inicio {
	
	public static void main(String[] args) {
		
		String archivoEntrada = "compras.txt"; //en la raiz del proyecto
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
		
		
		
		Persona persona1 = new Persona("fer", "torres", LocalDateTime.parse("1980-03-13T11:12:00"), carrito );
		Carrito miCarrito = persona1.getCarrito();

		Descuento desFijo = new DescuentoFijo(3990);
		Descuento desPorcentaje = new DescuentoPorcentaje(0.50F);
		Descuento desPorcentajeConTope = new DescuentoPorcentajeConTope(0.30F);
		
		desPorcentajeConTope.setValorDesc(0.20f);
		
		
		double resultado;
		try {
			resultado = miCarrito.costoFinal(desFijo);
			System.out.println("El costo final es: " + resultado);
			
		} catch (ValorCeroException | TotalNegativoException e) {
			System.out.println(e);
		}
	}
}	
