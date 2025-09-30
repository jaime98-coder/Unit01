package part02;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		/*
		 * (Acepta el reto) El cinquecento es un periodo del arte europeo
		 * (principalmente italiano) enclavado en pleno Renacimiento. Aunque su nombre
		 * esconde el número cinco, en realidad ¡pertenece al siglo XVI! Cinquecento es,
		 * abreviadamente, "años [mil] quinientos", en italiano, y es que el siglo XVI
		 * comprendió los años desde el 1501 al 1600, igual que el siglo XXI empezó en
		 * el 2001, con un 20 en sus dos primeros dígitos y no un 21. Dado un año, ¿de
		 * qué siglo es?
		 * 
		 * 
		 */
		// Declaro las variables año y siglo
		int año;
		int siglo;
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		// Solicito el año y leo de la consola el valor introducido
		System.out.println("Introduce el año para calcular el siglo");
		año = reader.nextInt();
		// Calculo a que siglo pertenece asignándole el valor con un ternario, y
		// diferenciando cuando sea 0 el módulo de 100 pertenece a un año, y sino es el
		// siglo siguiente (por eso el +1
		siglo = año % 100 == 0 ? año / 100 : año / 100 + 1;
		// Imprimo el mensaje final indicando a que siglo pertenece
		System.out.println("El año introducido pertenece al siglo " + siglo);
		// Cierro el Scanner
		reader.close();
	}

}
