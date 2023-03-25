package compras;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;

public class Inicio {
	
	public static void main(String[] args) {
		
		
		
		//ACA LEO EL ARCHIVO DE TEXTO Y CREO OBJETOS------------------
		String archivoEntrada = "src/main/resources/compras.txt";
		
		
		try {
			List<String> lista = Files.readAllLines(Paths.get(archivoEntrada));
			String[] datosProducto1 = lista.get(1).split(" "); //"40 jabón 123f".split(" ") == [40 ,jabón ,123f]
			String[] datosProducto2 = lista.get(2).split(" ");
			String[] datosProducto3 = lista.get(3).split(" ");
						
			Producto producto1 = new Producto(datosProducto1[1], datosProducto1[2],Float.parseFloat(datosProducto1[0]));
			Producto producto2 = new Producto(datosProducto2[1], datosProducto2[2],Float.parseFloat(datosProducto2[0]));
			Producto producto3 = new Producto(datosProducto3[1], datosProducto3[2],Float.parseFloat(datosProducto3[0]));
			
			
			
			//ACA CREO EL CARRITO-----------------
			
			Carrito carrito = new Carrito(producto1,producto2,producto3, LocalDateTime.parse("2023-01-13T11:12:00"));
			
			Persona persona1 = new Persona("fer", "torres", LocalDateTime.parse("1980-03-13T11:12:00"), carrito );
			
			Carrito miCarrito = persona1.getCarrito();

			Descuento desFijo = new DescuentoFijo(3990);
			Descuento desPorcentaje = new DescuentoPorcentaje(0.50F);
			Descuento desPorcentajeConTope = new DescuentoPorcentajeConTope(0.30F);
			desPorcentajeConTope.setValorDesc(0.20f);
			
			
			producto1.setStock(false);
			producto2.setStock(true);
			producto3.setStock(true);
			
			
			
			//ACA COMPARO LOS PRECIOS CON..
			try{
				float resultado = miCarrito.costoFinal(desPorcentajeConTope);
				System.out.println("El costo final es: " + resultado);
			}
			catch (NoHayStockException e){
				System.out.println("no se puede calcular el precio total porque no hay stock de algún producto");
				System.out.println( "el producto que no tiene stock es: "  +  e.getProducto().getNombre()    );
			}

			System.out.println("Fin");
			
			
			
			
			
			
			
			
			
			
		}catch(IOException e) {
			System.out.println("hubo un error en la operacion" + e);
		}
		
	}

}