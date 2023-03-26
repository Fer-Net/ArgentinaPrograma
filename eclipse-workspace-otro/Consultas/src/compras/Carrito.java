package compras;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

public class Carrito {
	

	private LocalDateTime fechaCompra;
	ArrayList<Producto> productos;

	
	public Carrito(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
		productos = new ArrayList<Producto>();
	}

	public void agregarProducto(Producto p) {
		if(!existeProducto(p.getCodigo())) {
			productos.add(p);
		}
	}
	
	public int eliminarProducto(String codigo) {
		for (int i = 0; i < productos.size(); i++) {
			if(productos.get(i).getCodigo().equals(codigo)) {
				productos.remove(i);
				return -1;
			}
		}
		return 0;
	}
	public boolean existeProducto(String codigo) {
		for(Producto p : this.productos) {
			if(p.getCodigo().equals(codigo)) {
				return true;
			}
		}
		return false;
	}
	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	
	public float costoFinal(Descuento desc) throws ValorCeroException, TotalNegativoException{ //polimorfismo
		float total = 0 ;
		for(Producto p : productos) {
			total = total + p.costoFinal();
		}
		if(total==0) {
			throw new ValorCeroException(total);
		}
		
		total = desc.valorFinal(total);
		
		if(total<0) {
			throw new TotalNegativoException(total);
		}
		return total;
	}

}
