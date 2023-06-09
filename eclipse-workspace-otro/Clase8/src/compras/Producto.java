package compras;

import java.util.Objects;

public class Producto {
	//atributos de la clase
	private String nombre;
	private String codigo;
	private float precio;
	private boolean stock;
	
	//crear el costructor
	public Producto( String nombre, String codigo, float precio) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}
	
	//getters y setter	
	
	
	

	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	//otros metodos
	
	public float costoFinal() throws NoHayStockException{
		if( this.getStock() == false) {
			throw new NoHayStockException(this);
		}
		return this.precio;
	}
	
	

	public void setStock(boolean b) {
		this.stock = b;
	}

	public boolean getStock() {
		return this.stock;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, nombre, precio, stock);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(codigo, other.codigo) ;
	}
	
	
	

}
