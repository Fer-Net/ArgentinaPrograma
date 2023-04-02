package escuelita;

public class Estudiante {

	private String nombre;
	private String legajo;
	private Estado estado;
	
	public Estudiante(String nombre, String legajo, escuela.Estado desaprobado) {
		this.nombre = nombre;
		this.legajo = legajo;
		this.estado = desaprobado;

	}
	
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	
	
	
}
