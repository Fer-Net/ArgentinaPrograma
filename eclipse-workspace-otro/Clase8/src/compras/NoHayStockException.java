package compras;

public class NoHayStockException extends Exception{
	
	private final Producto producto;
	
	public NoHayStockException(Producto producto) {
		this.producto = producto;
	}
	
	public Producto getProducto() {
		return this.producto;
	}

}
