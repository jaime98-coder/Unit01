package part02;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		/*
		 * (Acepta el reto) En muchos jueces on-line (¡Acepta el reto! entre ellos) cada
		 * problema tiene un identificador único para poderlo referenciar de manera
		 * unívoca dentro del sistema. Los identificadores son números naturales
		 * correlativos, y el primer problema recibe el número 100. Empezar en 100, en
		 * lugar de en 1 (o en 0), no es un capricho. Los problemas se "archivan" en
		 * volúmenes, cada uno compuesto por 100 problemas. Al asignar el número 100 al
		 * primer problema, es fácil saber en qué volumen está cualquier problema a
		 * partir de su identificador. En concreto, el primer volumen de problemas
		 * contiene a aquellos que tienen como identificador los números entre 100 y
		 * 199, el volumen 2 contiene los problemas con identificadores 200-299,
		 * etcétera. Dado un problema, ¿en qué volumen está?
		 * 
		 * 
		 */
		// Declaro las variables para el número del problema y el volumen
		int numeroProblema;
		int volumen;
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		// Solicito al usuario que número del problema va a hacer y leo de la consola
		System.out.println("Introduce el número del problema que vas a realizar");
		numeroProblema = reader.nextInt();
		// Le doy valor al volumen, diviendo el numero introducido por el usuario /100
		// que es el patrón que se repite
		volumen = numeroProblema / 100;
		// Imprimo el mensaje final indicando a que volumen corresponde el problema
		System.out.println("El problema corresponde al volumen " + volumen);
		// Cierro el Scanner
		reader.close();

	}

}
