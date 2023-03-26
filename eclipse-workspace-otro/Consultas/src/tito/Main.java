package tito;

public class Main {
	
	public static void main(String[] args) {
		
		Persona p = new Persona("Fer","Torres", 31);
		
		p.crearPassword("1998");
		
		System.out.println(p.getNombre("1998"));
		
		
	}
}
