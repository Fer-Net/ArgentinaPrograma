package compras;

public class DescuentoFijo extends Descuento {

	//valor;

	public DescuentoFijo(float valor) {
		super(valor);
	}

	@Override
	public float valorFinal(float valorInicial) throws ValorCeroException , TotalNegativoException{
		return valorInicial - super.getValorDesc();
	}
	

}
