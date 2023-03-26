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
		Persona persona1 = new Persona("fer", "torres", LocalDateTime.parse("1980-03-13T11:12:00"), carrito );
		Carrito miCarrito = persona1.getCarrito();

		try {
				lista = Files.readAllLines(Paths.get(archivoEntrada));
				lista.remove(0);//la primera linea es la descripción no la necesito //lista = { "5000 jabón 2000" ,  "660 esponja 4000"  ,  1000 chocolates2 6000  ,  4000 chocolates3 7000    }	
				for(String linea : lista) { //linea -> "5000 jabón 2000" -> "660 esponja 4000" ->  1000 chocolates2 6000
					String[] datosDeProducto = linea.split(" "); //datosProducto -> [5000 ,jabón ,2000] -> 
					Producto p = new Producto(datosDeProducto[1], datosDeProducto[2],Float.parseFloat(datosDeProducto[0]));
					miCarrito.agregarProducto(p);
				}
			}catch(IOException e) {
				System.out.println("hubo un error en la operacion" + e);
			}

			Descuento desFijo = new DescuentoFijo(10000);
			Descuento desPorcentaje = new DescuentoPorcentaje(0.50F);
			Descuento desPorcentajeConTope = new DescuentoPorcentajeConTope(0.30F);	
			desPorcentajeConTope.setValorDesc(0.20f);
			try {
				double resultado = miCarrito.costoFinal(desFijo);			
				System.out.println("El costo final es: " + resultado);
			}catch(ValorCeroException | TotalNegativoException e) {
				System.out.println(e);
			}
				
	}

}
