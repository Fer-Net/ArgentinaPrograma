package escuela;

public class Main {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante("Fer", Estado.APROBADO);
		
		if(e1.getEstado() == Estado.APROBADO) {
			System.out.println(true);
		}
		
		Estado estadoEstudiante = Estado.APROBADO;    // Instancia de un enum de la clase Estado
		estadoEstudiante.name();    // Devuelve un String con el nombre de la constante (APROBADO)
		estadoEstudiante.toString();    // Devuelve un String con el nombre de la constante (APROBADO)
		estadoEstudiante.ordinal();    // Devuelve un entero con la posición del enum según está declarada (0).
		estadoEstudiante.compareTo(Estado.APROBADO);    // Compara el enum con el parámetro según el orden en el que están declarados lo enum
		estadoEstudiante.values();    // Devuelve un array que contiene todos los enum
		
		
		System.out.println(estadoEstudiante.name());
		System.out.println(estadoEstudiante.toString());
		System.out.println(estadoEstudiante.ordinal());
		System.out.println(estadoEstudiante.compareTo(Estado.DESAPROBADO));
		System.out.println(Estado.values());



	}
	
	
}
