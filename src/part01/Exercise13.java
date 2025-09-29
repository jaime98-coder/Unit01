package part01;

import java.util.Scanner;

public class Exercise13 {
	/*
	 * Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen
	 * aspectos que influirán en esta decisión: solo podremos salir a la calle si no
	 * está lloviendo y hemos finalizado nuestras tareas. Existe una opción en la
	 * que, indistintamente de lo anterior, podremos salir a la calle: el hecho de
	 * tener que ir a la biblioteca. Solicitar al usuario (mediante un booleano) si
	 * llueve, si ha finalizado las tareas y si necesita ir a la biblioteca. El
	 * algoritmo debe mostrar mediante un booleano (true o false) si es posible que
	 * se le otorgue permiso para salir a la calle.
	 */
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		// Declaro la variable para recoger la situación de si está lloviendo
		boolean estaLloviendo;
		// Declaro la variable para recoger la situación de si tengo las tareas
		// terminadas
		boolean tareasTerminadas;
		// Declaro la variable para recoger la situación de si tengo que ir a la
		// biblioteca
		boolean irBiblioteca;
		// Declaro la variable para recoger la situación de si puedo salir
		boolean salir;
		// Solicito al usuario que me indiqué si llueve
		System.out.println("¿Está lloviendo?");
		// Leo de la consola el valor booleano que introdujo el usuario de si está
		// lloviendo
		estaLloviendo = reader.nextBoolean();
		// Solicito al usuario que me indiqué si llueve
		System.out.println("¿Has terminado las tareas?");
		// Leo de la consola el valor booleano que introdujo el usuario de si ha
		// terminado las tareas
		tareasTerminadas = reader.nextBoolean();
		// Solicito al usuario que me indiqué si tiene que ir a la biblioteca
		System.out.println("¿Tienes que ir a la biblioteca?");
		// Leo de la consola el valor booleano que introdujo el usuario de si tiene que
		// ir a la biblioteca
		irBiblioteca = reader.nextBoolean();
		/*
		 * si no está lloviendo y hemos finalizado nuestras tareas. indistintamente lo
		 * anterior, podremos salir a la calle: el hecho de tener que ir a la biblioteca
		 */
		salir = (!estaLloviendo && tareasTerminadas) || irBiblioteca;
		// Imprimo el mensaje final donde indico si puedo o no salir a la calle
		System.out.println("¿Puedo salir a la calle? " + salir);
		// Cierro Scanner
		reader.close();

	}

}
