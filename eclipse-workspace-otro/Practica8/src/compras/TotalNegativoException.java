package compras;

public class TotalNegativoException extends Exception{
	
	private final float valorDeCarrito;

	public TotalNegativoException(float valorDeCarrito) {
		this.valorDeCarrito = valorDeCarrito;
	}

	public float getValorDeCarrito() {
		return valorDeCarrito;
	}
	
	@Override
	public String getMessage() {
		return "el resultado de la operacion es negativa: " +valorDeCarrito ;
	}

}
