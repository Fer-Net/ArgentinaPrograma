package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class colecciones {
	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add("h");
		lista.add("a");
		lista.add("h");
		
		Iterator items = lista.iterator();


		String h = (String) items.next();
		String a = (String) items.next();
		System.out.println(a);
		
		Map<Integer,String> diccionario = new HashMap<>();
		diccionario.put(1, "hola");
		diccionario.put(2, "hola");
		
		System.out.println(diccionario.get(1));
		
		System.out.println(diccionario.containsKey(1));
		
		System.out.println(diccionario.containsKey(4));

		System.out.println(diccionario.containsValue("hola"));
		
		System.out.println(diccionario.values());
		System.out.println(diccionario.keySet());

		
	}

}
