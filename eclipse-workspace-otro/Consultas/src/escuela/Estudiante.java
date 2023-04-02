package escuela;

public class Estudiante {

		private String nombre;
		private Estado estado;
		
		public Estudiante(String nombre, Estado estado) {
			super();
			this.nombre = nombre;
			this.estado = estado;
		}
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public Estado getEstado() {
			return estado;
		}
		public void setEstado(Estado estado) {
			this.estado = estado;
		}
		
		
		
}
