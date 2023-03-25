package paquete;

public class DescuentoPorcentajeConTope extends DescuentoPorcentaje{

	//valor;
	private float tope;
	
	public DescuentoPorcentajeConTope(float tope) {
		super(0);
		this.tope = tope;
	}
	
	public float getTope() {
		return this.tope;
	}
	
	public void setTope(float nuevoValor) {
		this.tope = nuevoValor;
	}
	
	@Override
	public void setValorDesc(float valor) {
		if(valor>this.tope) {
			super.setValorDesc(0);
			System.out.println("no se puede poner ese valor porque superó el tope");
		}
		else {
			super.setValorDesc(valor);
		}
	}

//	public float getValorDesc() 
//	public void setValorDesc(float valor) 
//	public float valorFinal(float valorInicial)


}
