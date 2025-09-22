package unit01;

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
		// Pido al usuario que 
		System.out.println("Introduce nota 1");
		nota1=reader.nextFloat();
		System.out.println("Introduce nota 2");
		nota2=reader.nextFloat();
		mediaAritmetica=(nota1+nota2)/2;
		System.out.println("Tu media es de: "+mediaAritmetica);
				
		reader.close();

	}

}
