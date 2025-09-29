package part02;

import java.util.Scanner;

public class Exercise01B {
	/*
	 * Realizar un programa que pida como entrada un número con decimales y lo
	 * muestre redondeado al entero más próximo. (SIN UTILIZAR Math.round())
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double numConDecimales;
		double parteDecimal;
		int parteEntera;
		int resultado;
		System.out.println("Introduce un número que contenga decimales");
		numConDecimales = reader.nextDouble();
		parteEntera = (int) numConDecimales;
		parteDecimal = numConDecimales-parteEntera;
		resultado=(parteDecimal<0.5) ? parteEntera : parteEntera+1;
		System.out.println("Tu número redondeado es: "+resultado);
		reader.close();
		
	}
}
