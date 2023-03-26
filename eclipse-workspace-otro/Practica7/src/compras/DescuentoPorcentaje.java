package compras;

public class DescuentoPorcentaje extends Descuento{
	//valor;

	public DescuentoPorcentaje(float valor) {
		super(valor);
	}

	@Override
	public float valorFinal(float valorInicial) {
		return valorInicial - (valorInicial * super.getValorDesc());
	}
	

}
