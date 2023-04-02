package modelo;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;

public class LectorDeArchivos {
	
    String rutaArchivoInscripciones;
    List<ArchivoInscripciones> lineasArchivoInscripciones;
    
    public LectorDeArchivos(String rutaInscripciones) {    	
        this.rutaArchivoInscripciones = rutaInscripciones;
        this.lineasArchivoInscripciones = new ArrayList<>();        
    }

    @SuppressWarnings("unchecked")
	public void parsearArchivo() {
        List<ArchivoInscripciones> listaDeInscripciones = null;
        try {
            // En esta primera línea definimos el archivos que va a ingresar
        	listaDeInscripciones = new CsvToBeanBuilder(new FileReader(this.rutaArchivoInscripciones))
                    // con esta configuración podemos skipear la primera línea de nuestro archivo CSV
                    .withSkipLines(1)
                    // con esta configuración podemos elegir cual es el caracter que vamos a usar para delimitar
                    .withSeparator(';')
                    // Es necesario definir el tipo de dato que va a generar el objeto que estamos queriendo parsear a partir del CSV
                    .withType(ArchivoInscripciones.class)
                    .build()
                    .parse();

        } catch (IOException e) {
        e.printStackTrace();
    }
        this.lineasArchivoInscripciones = listaDeInscripciones;
    }
    

    public ArrayList<Inscripcion> listarInscripciones(Collection<Materia> materias , Collection<Alumno> alumnos){
        boolean InscripcionYaCargada = false;
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();

            for (ArchivoInscripciones lineaarchivoInscripciones : this.lineasArchivoInscripciones) {
            	InscripcionYaCargada = false;
            	Alumno alumnoNuevo = null;
            	Materia materiaNueva = null;
            	for (Alumno alumno : alumnos) {
            		if(alumno.getNombre().equals(lineaarchivoInscripciones.getNombreAlumno())) {
            			alumnoNuevo = alumno;
            		}
            	}
            	
            	for (Materia materia : materias) {
            		if(materia.getNombre().equals(lineaarchivoInscripciones.getMateria())) {
            			materiaNueva = materia;
            		}
            	}
            	
                Inscripcion nuevaInscripcion = new Inscripcion(alumnoNuevo,
                		materiaNueva,
                		lineaarchivoInscripciones.getFechaDeInscripcion());

                for ( Inscripcion inscripcionGuardada : inscripciones) {
                    if (nuevaInscripcion.equals(inscripcionGuardada)) {
                    	InscripcionYaCargada = true;
                        break;
                    }
                }
                if (!InscripcionYaCargada) {
                	inscripciones.add(nuevaInscripcion);
                }
        }
        return inscripciones;
    }
    
    
}
