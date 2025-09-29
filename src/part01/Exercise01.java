package part01;

import java.util.Scanner;

public class Exercise01 {
/* Diseña un programa que pida un número al usuario
 * y a continuación lo muestre.
 */
	public static void main(String[] args) {
		// Creo el scanner
		Scanner reader = new Scanner(System.in);
		// Declaro variables
		int numero;
		// Pido un número al usuario
		System.out.println("Introduzca un número entero");
		// Leo de la consola
		numero = reader.nextInt();
		// Imprimo el mensaje final
		System.out.println("El número introducido es: "+numero);
		
		// Cierro scanner
		reader.close();
	}

}
