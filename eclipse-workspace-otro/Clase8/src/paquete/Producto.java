package paquete;

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

	
	public float costoFinal() throws NoHayStockException {
		if (!this.hayStock()) {
			throw new NoHayStockException(this);
		}
		return this.getPrecio();
	}

	public float getPrecio() {
		return precio;
	}

	private boolean hayStock() {
		return false;
	}

	public boolean isStock() {
		return stock;
	}

	public void setStock(boolean stock) {
		this.stock = stock;
	}
	
	
}
