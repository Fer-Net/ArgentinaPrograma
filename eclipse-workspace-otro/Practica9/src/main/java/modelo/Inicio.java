package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {
	
	public static void main(String[] args) {
		System.out.println();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<>();

        // loop para agregar varias personas
        while (true) {
            System.out.println("Ingrese el nombre de la persona: ");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el apellido de la persona: ");
            String apellido = scanner.nextLine();

            System.out.println("Ingrese la fecha de nacimiento de la persona (dd/mm/aaaa): ");
            String fechaNacimiento = scanner.nextLine();

            Persona persona = new Persona();
            persona.setNombre(nombre);
            persona.setApellido(apellido);
            persona.setFechaNacimiento(fechaNacimiento);
            
            
            
            personas.add(persona);

            System.out.println("¿Desea agregar otra persona? (s/n)");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("n")) {
                break;
            }
        }

        // listar todas las personas
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Apellido: " + persona.getApellido());
            System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
            System.out.println("-----------------------");
        }
    }

}
