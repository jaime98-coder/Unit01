package unit01;

import java.util.Scanner;

public class Exercise08 {
	/*ENUNCIADO:
	 * Escribe un programa que pida al usuario su nombre y su edad y muestre por
	 * pantalla un mensaje como el siguiente: “Hola Juanito, tienes 21 años, ¡qué mayor eres!”. 
	 */
	public static void main(String[] args) {
		// Creo el Scanner al cual nombro como reader
		Scanner reader = new Scanner(System.in);
		// Declaro la variable tipo String nombre
		String nombre;
		// Declaro la edad de tipo int edad
		int edad;
		// Solicito al usuario que introduzca su nombre
		System.out.println("Introduce tu nombre");
		// Leo de la consola el nombre que introdujo el usuario
		nombre = reader.nextLine();
		// Solicito al usuario que introduzca su edad
		System.out.println("Introduce tu edad");
		// Leo de la consola la edad que introdujo el usuario
		edad = reader.nextInt();
		// Imprimo el mensaje final utilizando print en lugar de println y concatenando las variables nombre y edad
		System.out.print("Hola " + nombre);
		System.out.print(", tienes "+edad);
		System.out.print(" años, ¡Qué mayor eres!");
		
		reader.close();
		
		
				

	}

}
