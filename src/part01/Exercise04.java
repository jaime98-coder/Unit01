package part01;

import java.util.Scanner;

public class Exercise04 {
	/* Crear una aplicación que calcule la media aritmética
	 * de dos notas enteras. Hay que tener en cuenta que la
	 * nota media puede tener decimales.
	 */
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		// Declaro variables
		float nota1, nota2, mediaAritmetica;
		// Pido al usuario que introduzca nota 1
		System.out.println("Introduce nota 1");
		// Leo de la consola la nota 1 introducida
		nota1=reader.nextFloat();
		// Pido al usuario que introduzca nota 2
		System.out.println("Introduce nota 2");
		// Leo de la consola la nota 2 introducida
		nota2=reader.nextFloat();
		// Calculo  la media a partir de nota1 y nota2
		mediaAritmetica=(nota1+nota2)/2;
		// Imprimo mensaje final
		System.out.println("Tu media es de: "+mediaAritmetica);
		// Cierro scanner
		reader.close();

	}

}
