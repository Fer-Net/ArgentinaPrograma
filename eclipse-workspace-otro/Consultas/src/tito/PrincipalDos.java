package tito;

import java.util.ArrayList;

public class PrincipalDos {
	
	
	public static void main(String[] args) {
		
		int[] numeros;
		numeros.length;
		
		ArrayList<Integer> numeros;
		numeros.size();
		
		
		
		
		ArrayList<String> palabras = new ArrayList<String>(); //declaro el arraylist y lo instancio
		
		palabras.add("Flavia"); //agregar
		palabras.add("Fernando");
		palabras.add("Pablo");
		
		palabras.get(2); //obtener
		
		int longitudDeLaLista = palabras.size(); //longitud de la lista (en un entero)
		
		for(int i= 0; i< palabras.size(); i++ ) { //recorro una lista
			System.out.println(palabras.get(i));
		}
			
		for(int i= 0; i <= 2 ; i++ ) { //recorro una lista
			System.out.println(palabras.get(i));
		}
		
		
	}

}
