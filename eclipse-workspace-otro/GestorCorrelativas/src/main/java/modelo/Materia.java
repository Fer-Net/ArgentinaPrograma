package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Materia {
	
	private String nombre;
	private List<Materia> correlativas;
	
	public boolean puedeCursar(Alumno alumno) {
		boolean correlativasAprobadas = true;
		for (Materia correlativa : correlativas) {
			if(!alumno.aproboMateria(correlativa)) {
				correlativasAprobadas = false;
			}
		}
		return correlativasAprobadas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Materia(String nombre) {
		this.nombre = nombre;
		this.correlativas = new ArrayList<>();
	}
	
	public void agregarMateriaCorrelativa(Materia materia) {
		this.correlativas.add(materia);
	}
	
	public void eliminarMateriaCorrelativa(Materia materia) {
		this.correlativas.remove(materia);
	}

	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", correlativas=" + correlativas + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(correlativas, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Materia other = (Materia) obj;
		return Objects.equals(correlativas, other.correlativas) && Objects.equals(nombre, other.nombre);
	}

	
}
