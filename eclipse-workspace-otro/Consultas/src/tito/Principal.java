package tito;

import java.util.ArrayList;

public class Principal {

	
	public static void main(String[] args) {
		
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		Jugador j1 = new Jugador("messi",10,"medio campo");
		Jugador j2 = new Jugador("kun",11,"delantero");
		
		jugadores.add(j1);
		jugadores.add(j2);
		jugadores.add(new Jugador("maradona",10, "medio campo"));
		
		Jugador miJugadorFavorito = jugadores.get(0); 
		String nombre = jugadores.get(0).getNombre(); 
		
		System.out.println("los nombres de los jugadores son: ");
		for (int i = 0; i<jugadores.size() ; i++) {
			System.out.println(jugadores.get(i).getNombre());
		}
		
		
		Equipo argentina = new Equipo("Argentina", "A");
		
		argentina.agregarJugador(miJugadorFavorito);
		
		int cantidad = argentina.cantidadDeJugadores();
		
		System.out.println("la cantidad de jugadores es: " + argentina.cantidadDeJugadores());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
