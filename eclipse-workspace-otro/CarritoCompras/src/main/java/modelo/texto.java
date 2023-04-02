package modelo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class texto {
	public static void main(String[] args) {

		String archEnt = "Texto.txt"; //Archivo de entrada
		
		List<String> lineas = null; //Las líneas que se van a leer
		
		try {

		lineas= Files.readAllLines(Paths.get(archEnt));

		for (int i = 0; i < lineas.size(); i++) {

		System.out.println(lineas.get(i));

		}

		}

		catch (IOException e) {

		System.out.println("La operación falló con el archivo de entrada");

		};

		}

}
