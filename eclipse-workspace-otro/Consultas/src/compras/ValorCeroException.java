package compras;

public class ValorCeroException extends Exception {
	
	private final float valorDeCarrito;
	
	public ValorCeroException(float valorDeCarrito) {
		this.valorDeCarrito = valorDeCarrito;
	}
	
	public float getValorDeCarrito() {
		return this.valorDeCarrito;
	}
	
	@Override
	public String getMessage() {
		return "El valor del carrito es cero, no se puedo calcular un descuento";
	}

}
