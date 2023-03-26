package compras;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Carrito {
	
    ArrayList<Producto> productos;
	private LocalDateTime fechaCompra;

	
	public Carrito (LocalDateTime fechaCompra) {
		productos = new ArrayList<Producto>();
		this.fechaCompra = fechaCompra;
	}

	public void agregarProducto(Producto p) { //agregar productos a lista
		if(!existeProducto(p))
			productos.add(p);
	}
	
	
	public boolean existeProducto(Producto p) {
		for (int i = 0; i < productos.size(); i++) {
			if(productos.get(i).getCodigo() == p.getCodigo()) {
				return true;
			}
		}
		return false;
		
		
	}
	
	public Producto obtenerProducto(int i) {
		return productos.get(i);
	}
	
	public Producto obtenerProducto(String codigo) {
		for (int i = 0; i < productos.size(); i++) {
			if(productos.get(i).getCodigo().equals(codigo)) {
				return productos.get(i);
			}
		}
		return null;
	}
	
	
	
	//obtener productos de la lista

	
	

	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	

	public float costoFinal(Descuento desc) throws NoHayStockException { //polimorfismo
		
		float total = 0;
		for (Producto p : this.productos) {
			total = total + p.costoFinal();
		}
		return total;
	}

}
