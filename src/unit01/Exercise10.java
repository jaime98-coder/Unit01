package unit01;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
	/*ENUNCIADO:
	 * Escribir un programa que pida un número al usuario e indique mediante un
	 * literal booleano (true o false) si el número es par.
	 */
	/*
		 * Pasos que hará mi programa:
		 * 1. Pedir un número al usuario (imprimir mensaje y esperar el dato)
		 * 2. Compruebo si es par
		 * 3. Imprimo mensaje
	 */
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		// Declaro variable número
		int numero;
		// Declaro variable booleana esPar
		boolean esPar;
		// Solicito al usuario que introduzca un número para comprobar si es par
		System.out.println("Introduce un número para comprobar si es par");
		//Leo de la consola el número que introdujo el usuario
		numero = reader.nextInt();
		// Compruebo si el número es par con el operador módulo (%), si da 0, es par
		esPar = (numero % 2 == 0);
		// Imprimo el mensaje final indicando mediante un literal booleano si es par o no.
		System.out.println("¿El número es par? " + esPar);
		// Cierro Scanner
		reader.close();
	}

}
