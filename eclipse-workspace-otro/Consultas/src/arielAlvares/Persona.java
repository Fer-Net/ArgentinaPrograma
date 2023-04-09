package arielAlvares;

public class Persona {
	String Id;
	String Nombre;
	String Apellido;
	String Telefono;
	String eMail;
	
	public Persona(String id, String nombre, String apellido, String telefono, String eMail) throws PersonaExceptionID {
		Id = id;
		Nombre = nombre;

		Apellido = apellido;

		Telefono = telefono;

		this.eMail = eMail;

		if (id.isEmpty()) {
			throw new PersonaExceptionID();
		}
	}

		public static void main(String[] args) {

		// TODO Auto-generated method stub
			Persona p1 = null;
		try {

		 p1 = new Persona("","Ariel","Alvarez","123456666","");

		System.out.println(p1.Nombre);

		} catch (PersonaExceptionID e) {

		// TODO Auto-generated catch block

		e.ValidaException();
		System.out.println("sss");

		}
		
		System.out.println(p1);
		}

}
