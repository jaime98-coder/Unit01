package part02;

import java.util.Scanner;

public class Exercise01B {
	/*
	 * Realizar un programa que pida como entrada un número con decimales y lo
	 * muestre redondeado al entero más próximo. (SIN UTILIZAR Math.round())
	 */
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		// Declaro las variables numero con decimales, parte decimal, entera y el resultado (nº redondeado)
		double numConDecimales;
		double parteDecimal;
		int parteEntera;
		int resultado;
		// Solicito al usuario el número con decimales
		System.out.println("Introduce un número que contenga decimales");
		// Leo de la consola el nº con decimales introducido
		numConDecimales = reader.nextDouble();
		// Aislo dentro de la variable el valor entero del nº con decimales introducido
		parteEntera = (int) numConDecimales;
		// Aislo dentro de la variable el valor decimal del nº con decimales introducido		
		parteDecimal = numConDecimales - parteEntera;
		// Creo un ternario donde si la parte decimal <0.5 será parte entera (redondeo hacia abajo)
		// en el caso de que no sea <0.5, le sumo 1 al redondeo hacia abajo
		resultado = (parteDecimal < 0.5) ? parteEntera : parteEntera + 1;
		// Imprimo el mensaje final
		System.out.println("Tu número redondeado es: " + resultado);
		// Cierro el Scanner
		reader.close();

	}
}
