package unit01;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		/*ENUNCIADO:
		 * Escribir un programa que le pida dos números al usuario.
		 * A continuación, debe mostrar la suma, la resta, la
		 * multiplicación y la división de ambos números. Debe
		 * mostrarse el resultado de cada operación en una línea distinta.
		 */
		
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		double num1;
		double num2;
		double suma;
		double resta;
		double multiplicacion;
		double division;
		
		System.out.println("Introduzca número 1");
		num1 = reader.nextDouble();
		System.out.println("Introduzca número 2");
		num2 = reader.nextDouble();
		suma = num1+num2;
		resta = num1-num2;
		multiplicacion = num1*num2;
		division = num1/num2;
		System.out.println("Suma: "+suma);
		System.out.println("Resta: "+resta);
		System.out.println("Multiplicación: "+multiplicacion);
		System.out.println("División: "+division);
		
		reader.close();
		

	}

}
