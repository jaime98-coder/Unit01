package part02;

import java.util.Scanner;

public class Exercise01A {
	/*
	 * Realizar un programa que pida como entrada un número con decimales y lo
	 * muestre redondeado al entero más próximo. (SIN UTILIZAR Math.round())
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double numConDecimales;
		int numRedondeado;
		System.out.println("Introduce un número que contenga decimales");
		numConDecimales = reader.nextDouble();
		numRedondeado = (int) (numConDecimales+0.5);
		System.out.println("Tu número redondeado es: "+numRedondeado);
		reader.close();
		
	}
}
