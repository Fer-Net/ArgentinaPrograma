package compras;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCarrito {

	private Persona persona;
	private Carrito carrito;
	
	void setup(String ruta) {
		String archivoEntrada = ruta; //en la raiz del proyecto
		List<String> lista = new ArrayList<String>();
		Carrito carrito = new Carrito(LocalDateTime.parse("2023-01-13T11:12:00"));
		persona = new Persona("fer", "torres", LocalDateTime.parse("1980-03-13T11:12:00"), carrito );
		this.carrito = persona.getCarrito();
		try {
				lista = Files.readAllLines(Paths.get(archivoEntrada));
				lista.remove(0);//la primera linea es la descripción no la necesito //lista = { "5000 jabón 2000" ,  "660 esponja 4000"  ,  1000 chocolates2 6000  ,  4000 chocolates3 7000    }	
				for(String linea : lista) { //linea -> "5000 jabón 2000" -> "660 esponja 4000" ->  1000 chocolates2 6000
					String[] datosDeProducto = linea.split(" "); //datosProducto -> [5000 ,jabón ,2000] -> 
					Producto p = new Producto(datosDeProducto[1], datosDeProducto[2],Float.parseFloat(datosDeProducto[0]));
					this.carrito.agregarProducto(p);
				}
			}catch(IOException e) {
				System.out.println("hubo un error en la operacion" + e);
			}
	}
	
	@Test 
	void testaValorCeroExcetion(){
		setup("comprasTotalCero.txt");
		Descuento desFijo = new DescuentoFijo(3000);
		Assertions.assertThrows(ValorCeroException.class , () ->  {this.carrito.costoFinal(desFijo) ;} );
	}
	
	@Test 
	void TotalNegativoException(){
		setup("comprasResultadoNegativo.txt");
		Descuento desFijo = new DescuentoFijo(3000);
		Assertions.assertThrows(TotalNegativoException.class , () ->  {this.carrito.costoFinal(desFijo) ;} );
	}
}
