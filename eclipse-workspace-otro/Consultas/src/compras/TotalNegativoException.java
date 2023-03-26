package compras;

public class TotalNegativoException extends Exception {
	
	private final float valorDeCarrito;
	
	public TotalNegativoException(float valorDeCarrito) {
		this.valorDeCarrito = valorDeCarrito;
	}
	
	public float getValorDeCarrito() {
		return this.valorDeCarrito;
	}
	
	@Override
	public String getMessage() {
		return "El valor del carrito es negativo";
	}

}
