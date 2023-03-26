package compras;

public class ValorCeroException extends Exception{
	
	private final float valorDeCarrito;

	public ValorCeroException(float valorDeCarrito) {
		this.valorDeCarrito = valorDeCarrito;
	}

	public float getValorDeCarrito() {
		return valorDeCarrito;
	}
	
	@Override
	public String getMessage() {
		return "el valor del carrito es cero, no se puede calcular un descuento";
	}

}
