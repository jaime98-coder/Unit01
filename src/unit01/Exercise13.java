package unit01;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		boolean estaLloviendo;
		boolean tareasTerminadas;
		boolean irBiblioteca;
		boolean salir;

		System.out.println("¿Está lloviendo?");
		estaLloviendo = reader.nextBoolean();
		System.out.println("¿Has terminado las tareas?");
		tareasTerminadas = reader.nextBoolean();
		System.out.println("¿Tienes que ir a la biblioteca?");
		irBiblioteca = reader.nextBoolean();
		/*
		 * si no está lloviendo y hemos finalizado nuestras tareas. indistintamente lo
		 * anterior, podremos salir a la calle: el hecho de tener que ir a la biblioteca
		 */
		salir = (!estaLloviendo && tareasTerminadas) || irBiblioteca;
		System.out.println("¿Puedo salir a la calle? " + salir);

		reader.close();

	}

}
