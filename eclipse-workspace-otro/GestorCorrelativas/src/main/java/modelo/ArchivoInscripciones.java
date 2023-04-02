package modelo;

import java.time.LocalDate;
import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;

public class ArchivoInscripciones {
	
    @CsvBindByPosition(position = 0)
    private String nombreAlumno;
    @CsvBindByPosition(position = 1)
    private String materia;
    @CsvBindByPosition(position = 2)
    @CsvDate(value = "yyyy-MM-dd")
    private LocalDate fechaDeInscripcion;
    
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public LocalDate getFechaDeInscripcion() {
		return fechaDeInscripcion;
	}
	public void setFechaDeInscripcion(LocalDate fechaDeInscripcion) {
		this.fechaDeInscripcion = fechaDeInscripcion;
	}
    

}
