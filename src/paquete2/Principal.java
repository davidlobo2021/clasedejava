package paquete2;

import java.util.LinkedList;

public class Principal {

	public static void main(String[] args) {
	
		Persona ricardo = new Persona("Ricardo", "Darín", 12333455);
		Persona juan = new Persona("Juan", "Lobo", 65333777);
		Persona juan2 = new Persona("Juan", "Lobo", 65333777);
		
		System.out.println("Nombre de ricardo "+ricardo.getNombre());
		
		System.out.println(ricardo.toString());

		boolean respuesta = juan.equals(juan2);
		
		System.out.println("Son el mismo? "+ respuesta);
		
		int[] miArray = {1,12,-25};
		
		LinkedList<Integer> misEnteros = new LinkedList<>();
		
		misEnteros.add(15);
		misEnteros.add(25);
		misEnteros.add(155);
		misEnteros.add(250);
		
		for(Integer i: misEnteros){
			
			System.out.println("El valor actual es: " + i);
			
		}
		

		
	}

}
