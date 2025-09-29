package part02;

import java.util.Scanner;

public class Exercise01A {
	/*
	 * Realizar un programa que pida como entrada un número con decimales y lo
	 * muestre redondeado al entero más próximo. (SIN UTILIZAR Math.round())
	 */
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		//Declaro las variables numero con decimales y el resultado (nº redondeado)
		double numConDecimales;
		int resultado;
		// Solicito al usuario el número con decimales
		System.out.println("Introduce un número que contenga decimales");
		// Leo de la consola el valor introducido
		numConDecimales = reader.nextDouble();
		// Le doy valor a la variable resultado, convirtiendo en entero el nº introducido y le sumo
		// 0.5, para así si fuese por ejemplo 3.5 o más el nº introducido, se redondearía para arriba,
		// sino si fuese 3.4 o menos sería hacia abajo.
		resultado = (int) (numConDecimales+0.5);
		// Imprimo el mensaje final con el resultado (nº redondeado)
		System.out.println("Tu número redondeado es: "+resultado);
		//Cierro el Scanner
		reader.close();
		
	}
}
