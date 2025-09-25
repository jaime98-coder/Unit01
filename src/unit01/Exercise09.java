package unit01;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
	/*ENUNCIADO:
	 * Realizar una aplicación que solicite al usuario su edad y le indique si es
	 * mayor de edad (mediante un literal booleano: true o false).
	 */
		/*
		// VERSIÓN 1 con IF ELSE (COMENTADA)
		// Creo Scanner
		Scanner reader = new Scanner(System.in);
		// Declaro variable edad
		int edad;
		// Solicito al usuario que introduzca su edad
		System.out.println("Introduce tu edad");
		// Leo la edad introducida en consola
		edad = reader.nextInt();
		// 
		if (edad>=18) {
			System.out.println("Eres mayor de edad");
		}else System.out.println("Eres menor de edad");
		
		reader.close();
		*/
		
		//VERSIÓN 2 (ACTIVA)
		Scanner reader = new Scanner(System.in);
		// Declaro variable edad
		int edad;
		boolean esMayorDeEdad;
		// Solicito al usuario que introduzca su edad
		System.out.println("Introduce tu edad");
		// Leo la edad introducida en consola
		edad = reader.nextInt();
		// Compara si la edad es mayor o igual a 18
		esMayorDeEdad = edad >= 18;
		// Imprimo el mensaje final indicando mediante un literal booleano si es mayor de edad o no
		System.out.println("¿Es mayor de edad? " + esMayorDeEdad);
		// Cierro Scanner
		reader.close();
	}

}
