package tito;

import java.util.ArrayList;

public class Equipo {
	
	private String nombre;
	private String categoria;
	private ArrayList<Jugador> jugadores;
	
	public Equipo(String nombre, String categoria) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.jugadores = new ArrayList<Jugador>();
	}
	
	
	public int cantidadDeJugadores() {
		return this.jugadores.size();
	}
	
	public void agregarJugador(Jugador j1) {
		this.jugadores.add(j1);
	}
	
	public Jugador dameJugadorPorNumero(int nroCamiseta) {
		for (int i = 0; i<jugadores.size() ; i++) {
			if(jugadores.get(i).getNroCamiseta()==nroCamiseta) {
				return jugadores.get(i);
			}
		}
		return null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}





	
	
	
}
