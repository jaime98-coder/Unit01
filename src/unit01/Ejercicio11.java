package unit01;

import java.util.Scanner;
/*
 * Realiza un conversor de pesetas a euros. Para ello, pídele al usuario
 * que te introduzca el valor en pesetas y, a posteriori, debes mostrarle
 * el resultado de la conversión.(1€ = 166 ptas).
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		// Declaro la variable euros de tipo float
		float euros;
		// Declaro la variable pesetas de tipo int (ya que no puede tener decimales)
		int pesetas;
		// Solicito al usuario que introduzca el valor en pesetas 
		System.out.println("Introduce el valor en pesetas");
		// Leo de la consola el valor introducido
		pesetas = reader.nextInt();
		// Hago la conversión de pesetas a euros
		euros=(float)pesetas/166;
		// Imprimo el mensaje final con el resultado de la conversión concatenando las 2 variables con el texto
		System.out.println(pesetas +" equivale a " +euros);
		// Cierro Scanner
		reader.close();
	}

}
