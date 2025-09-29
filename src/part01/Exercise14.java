package part01;

import java.util.Scanner;

public class Exercise14 {
	/*
	 * Escribir un programa que solicite las notas del primer, segundo y tercer
	 * trimestre (notas enteras que se solicitarán al usuario). El programa debe
	 * mostrar la nota media del curso como se utiliza en el boletín de
	 * calificaciones (solo la parte entera) y como se usa en el expediente
	 * académico (con decimales).
	 * 
	 */
	public static void main(String[] args) {
		// Creo Scanner
		Scanner reader = new Scanner(System.in);
		// Creo la variable para nota del primer trimestre
		float notaPrimerTrimestre;
		// Creo la variable para nota del segundo trimestre
		float notaSegundoTrimestre;
		// Creo la variable para nota del tercer trimestre
		float notaTercerTrimestre;
		// Creo la variable para nota del expediente
		float notaExpediente;
		// Creo la variable para nota del boletín
		int notaBoletin;
		// Solicito al usuario que introduzca la nota del primer trimestre
		System.out.println("Introduce la nota del primer trimestre");
		// Leo de la consola la nota introducida
		notaPrimerTrimestre = reader.nextFloat();
		// Solicito al usuario que introduzca la nota del segundo trimestre
		System.out.println("Introduce la nota del segundo trimestre");
		// Leo de la consola la nota introducida
		notaSegundoTrimestre = reader.nextFloat();
		// Solicito al usuario que introduzca la nota del tercer trimestre
		System.out.println("Introduce la nota del tercer trimestre");
		// Leo de la consola la nota introducida
		notaTercerTrimestre = reader.nextFloat();
		// Saco la nota media del expediente (con decimales)
		notaExpediente = (notaPrimerTrimestre + notaSegundoTrimestre + notaTercerTrimestre) / 3;
		// Saco la nota media del boletín oficial (sin decimales)
		notaBoletin = (int) notaExpediente;
		// Imprimo mensaje final indicando la nota final del curso del boletín.
		System.out.println("Tu nota final del curso es de: " + notaBoletin);
		// Cierro Scanner
		reader.close();

	}

}
