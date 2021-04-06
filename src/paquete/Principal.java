package paquete;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int variable = 1;
		
		int salir = 0;
		
		Scanner miSc = new Scanner(System.in);
		
		System.out.println("Ingrese u numero del 1 al 3");
		
		variable = miSc.nextInt();
		
		while(salir != 1){
		
		switch(variable){
		
		case 1:
			
			System.out.println("Eligio el 1");
			
			break;
		
		case 2:
			
			System.out.println("Es un boludo");
		
			break;
			
		case 3:
			
			System.out.println("Eligió el 3 muy bien");
		
			break;
			
		default:
			System.out.println("No eligió un valor correcto");
		
			}
		
		System.out.println("Ingrese 1 para salir o 2 para continuar");
		
		miSc.nextLine();
		
		salir= miSc.nextInt();
		
		}
		System.out.println("Fin del programa");
		
	}

}
