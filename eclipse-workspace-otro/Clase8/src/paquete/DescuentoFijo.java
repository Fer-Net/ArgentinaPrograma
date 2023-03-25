package paquete;

public class DescuentoFijo extends Descuento {

	//valor;

	public DescuentoFijo(float valor) {
		super(valor);
	}

	@Override
	public float valorFinal(float valorInicial) {
		return valorInicial - super.getValorDesc();
	}
	

}
