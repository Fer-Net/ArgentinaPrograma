package modelo;

import java.util.ArrayList;

public class Alumno {
	
	private String nombre;
	private String legajo;
	private ArrayList<Materia> materiaAprobadas;
	
	public Alumno(String nombre, String legajo) {
		this.nombre = nombre;
		this.legajo = legajo;
		this.materiaAprobadas = new ArrayList<>();
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
	
	public void agregarMateriaAprobada(Materia materia) {
		this.materiaAprobadas.add(materia);
	}
	
	public void eliminarMateriaAprobada(Materia materia) {
		this.materiaAprobadas.remove(materia);
	}
	
	public boolean aproboMateria(Materia materia) {
//		System.out.println("nombre" + this.nombre);
//		System.out.println("materia" +  materia);
//		System.out.println("materiaAprobadas" +this.materiaAprobadas);
//		System.out.println("contiene" + this.materiaAprobadas.contains(materia));
		return this.materiaAprobadas.contains(materia);
		
	}

	
}
