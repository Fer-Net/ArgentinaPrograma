package TITO;

import java.io.*;
import java.util.*;

public class ChatProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";

        // Pedimos el nombre del usuario
        System.out.print("Ingrese su nombre: ");
        name = sc.nextLine();

        while (true) {
            // Pedimos la opción al usuario
            System.out.println("\nSeleccione una opción: ");
            System.out.println("1. Escribir mensaje");
            System.out.println("2. Leer mensajes");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            int option = sc.nextInt();

            if (option == 1) {
                // Escribir mensaje
                sc.nextLine(); // Limpiamos el buffer de entrada
                System.out.print("Escriba su mensaje: ");
                String message = sc.nextLine();
                try {
                    // Abrimos el archivo en modo de escritura y agregamos el mensaje
                    FileWriter writer = new FileWriter("chat.txt", true);
                    writer.write(name + ": " + message + "\n");
                    writer.close();
                    System.out.println("Mensaje enviado correctamente");
                } catch (IOException e) {
                    System.out.println("Error al enviar el mensaje");
                }
            } else if (option == 2) {
                // Leer mensajes
                try {
                    // Abrimos el archivo en modo de lectura y mostramos el contenido
                    FileReader reader = new FileReader("chat.txt");
                    BufferedReader bufferedReader = new BufferedReader(reader);
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        System.out.println(line);
                    }
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error al leer los mensajes");
                }
            } else if (option == 3) {
                // Salir del programa
                break;
            } else {
                // Opción inválida
                System.out.println("Opción inválida");
            }
        }

        System.out.println("Saliendo del programa...");
    }
}