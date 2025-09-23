package unit01;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		// Declaro variable para el nombre del usuario
		String nombre;
		// Declaro variable para la dirección
		String direccion;
		// Declaro variable para el teléfono
		String telefono;
		// Solicito al usuario que introduzca su nombre
		System.out.println("Introduzca su nombre");
		// Leo de la consola el nombre introducido
		nombre = reader.nextLine();
		// Solicito al usuario que introduzca su dirección
		System.out.println("Introduzca su dirección");
		// Leo de la consola la dirección introducida
		direccion = reader.nextLine();
		// Solicito al usuario que introduzca su teléfono
		System.out.println("Introduzca su teléfono");
		// Leo de la consola el teléfono introducido
		telefono = reader.nextLine();
		// Muestro el nombre que el usuario introdujo en consola
		System.out.println("Nombre: "+nombre);
		// Muestro la dirección que el usuario introdujo en consola
		System.out.println("Dirección: "+direccion);
		// Muestro el teléfono que el usuario introdujo en consola
		System.out.println("Teléfono: "+telefono);
		
		reader.close();
	}

}
