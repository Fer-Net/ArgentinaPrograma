package compras;

import java.util.ArrayList;

public class mian {
	
	public static void main(String[] args) {
		
		ArrayList<String> palabras = new ArrayList<String>(); //instanciar
		palabras.add("tomas");
		palabras.add("tomas");
		System.out.println(palabras.contains("tomas"));
		
		ArrayList<Perro> perros = new ArrayList<Perro>(); //instanciar
		Perro p = new Perro("pichicho1",8);
		
		//System.out.println(p.toString());
		
		perros.add(new Perro("pichicho2",8));
		perros.add(p); //guardar un valor perros.add(2,p);
		Perro perroObtenido = perros.get(1); //obtener un valor
//		System.out.println(perros.get(0).getNombre()); //obtener un valor
		int longitudDePerros = perros.size();        //cantidad de elementos  
		
		for (int i = 0; i < perros.size(); i++) {
				//System.out.println(perros.get(i));
		}
		
		
//		System.out.println(perros.toString());
		
		int[] numeros = new int[4]; //instanciar
		numeros[0] = 2; //guardar un valor
		numeros[1] = 2; //guardar un valor
		numeros[2] = 2; //guardar un valor
		numeros[3] = 2; //guardar un valor
		int n = numeros[1]; //obtener un valor
		int longitud = numeros.length; //cantidad de elementos
		//las posiciones se cuentan apartir del cero
		
		
		
		
	}

}
