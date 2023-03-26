package tito;

public class Persona {

	//atributos
	 private String nombre;
	 private String apellido;
	 private int edad;
	 private String password;
	
	//constuctor
	public Persona(String nombre,String apellido, int edad ) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		//this.password = nombre + apellido + "PEPE";
	}
	
	//definicion getters y setters
	
	public void crearPassword(String pass) {
		if(pass.length()>=8) {
			this.password = pass;
		}
		



		
	}
	
	public String getNombre(String pass) {
		if(pass.equals(this.password)) {
			return this.nombre;
		}
		return "accedo denegado";
	}
	
	
	public String getApellido() {
		return this.apellido;
	}
	
	// otro metodos (equals, toString)
	
	
	
	
}
