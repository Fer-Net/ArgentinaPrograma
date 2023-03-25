package ejercicios;

import java.util.Arrays;

public class Punto1a {
	
	//haga un main, donde por parámetro ponga 3 números y una letra que
	//represente ascendente o descendente y los muestre ordenados por tal criterio

	//C:\Users\Fer-Net\eclipse-workspace-otro\Practica4\src\ejercicios
	
	//1 abrir una terminal nueva
	//2 me voy a la ubicacion de la clase
	//3 voy a compilar el archivo java
	//4 voy ajecutar la clase y el metodo main con los argumentos que yo quiera
	
	public static void main(String[] args) {
		//args ["1","3","4","d" ]
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int n3 = Integer.parseInt(args[2]);
		String orden = (args[3]);
		
		System.out.println(Arrays.toString( ordernarNumeros(n1,n2,n3,orden)));

	}
	
	
	public static int[] ordernarNumeros (int n1, int n2, int n3, String orden ) {
		int[] vector = new int[] {n1,n2,n3};
		 for (int i = 0; i < vector.length; i++) {
		        for (int j = i + 1; j < vector.length; j++) {
		        	if(orden.equals("a")) {
			            if (vector[i] > vector[j]) {
			                int temp = vector[i];
			                vector[i] = vector[j];
			                vector[j] = temp;
			            }
		        	}
		        	else if(orden.equals("d")) {
		        		if (vector[i] < vector[j]) {
			                int temp = vector[i];
			                vector[i] = vector[j];
			                vector[j] = temp;
			            }
		        	}

		        }
		    }
		 return vector;
	}
	

}
