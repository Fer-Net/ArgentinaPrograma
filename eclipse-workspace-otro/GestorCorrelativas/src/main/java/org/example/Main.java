package org.example;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;

import modelo.Alumno;
import modelo.ArchivoInscripciones;
import modelo.Inscripcion;
import modelo.LectorDeArchivos;
import modelo.Materia;


public class Main {
    public static void main(String[] args) {
    	//"C:\Users\Fer-Net\Desktop\JORGE\libreria\argentina-programa-java-ejemplo-archivos-main\LectorCSV\src\main\resources\inscripciones.csv"
        //ejecutar jar: java -jar GestorDeCorrelativas-1.0-SNAPSHOT.jar "C:\Users\Fer-Net\Desktop\Nueva carpeta (2)\argentina-programa-java-ejemplo-archivos-main\LectorCSV\src\main\resources\inscripciones.csv"

    	//En la variable args va a viajar la ruta del archivo que queremos que abra el programa
        if(args.length == 0){
            System.out.println("ERROR: No ingresaste ningún archivo como argumento!");
            System.exit(88);
        }

        LectorDeArchivos lectorDeArchivos = new LectorDeArchivos(args[0]);
        //        String ruta = "C:/Users/Fer-Net/Desktop/JORGE/libreria/argentina-programa-java-ejemplo-archivos-main/LectorCSV/src/main/resources/inscripciones.csv";
        //LectorDeArchivos lectorDeArchivos = new LectorDeArchivos(ruta);
        //Obtengo todas las líneas del archivo CSV
        lectorDeArchivos.parsearArchivo();
        
        Materia	programacionI = new Materia("Programacion I");
        Materia	programacionII = new Materia("Programacion II");
        Materia	programacionIII = new Materia("Programacion III");
        Materia	baseDeDatos = new Materia("Base de Datos");

        programacionII.agregarMateriaCorrelativa(programacionI);
        programacionIII.agregarMateriaCorrelativa(programacionII);
        baseDeDatos.agregarMateriaCorrelativa(programacionII);

        Collection<Materia> materias = new ArrayList<Materia>() ;
        materias.add(programacionI);
        materias.add(programacionII);
        materias.add(programacionIII);
        materias.add(baseDeDatos);

        Alumno alumnoJose = new Alumno("Jose Rodriguez", "FE1234");
        Alumno alumnoSosa = new Alumno("Vanesa Sosa", "FE1234");
        Alumno alumnoPerez = new Alumno("Lucia Perez", "FE1234");

        alumnoSosa.agregarMateriaAprobada(programacionI);
        alumnoSosa.agregarMateriaAprobada(programacionII);
        alumnoPerez.agregarMateriaAprobada(programacionI);

        Collection<Alumno> alumnos = new ArrayList<Alumno>() ;
        alumnos.add(alumnoJose);
        alumnos.add(alumnoSosa);
        alumnos.add(alumnoPerez);
        
        //Genero una lista con todos los distintos servicios que hay en el archivo CSV
        ArrayList<Inscripcion> inscripciones = lectorDeArchivos.listarInscripciones(materias,alumnos);

        for (Inscripcion inscripcion : inscripciones) {inscripcion.aprobada();
        	System.out.println(inscripcion.getAlumno().getNombre() + " " + inscripcion.getMateria().getNombre() + " " + inscripcion.getFecha() + " " + inscripcion.aprobada());
        }

    }

}