package unit01;

import java.util.Scanner;
public class Exercise06 {
	/*ENUNCIADO:
	 * Escribir un programa que le pida dos números al usuario. A continuación,
	 * debe mostrar la suma, la resta, la multiplicación y la división de ambos
	 * números. Debe mostrarse el resultado de cada operación en una línea distinta.
	 */
	public static void main(String[] args) {

		/*ENUNCIADO:
		 * Escribir un programa que le pida dos números al usuario.
		 * A continuación, debe mostrar la suma, la resta, la
		 * multiplicación y la división de ambos números. Debe
		 * mostrarse el resultado de cada operación en una línea distinta.
		 */
		
		// Creo el Scanner el cual le pongo el nombe de reader
		Scanner reader = new Scanner(System.in);
		// Declaro variables
		// Número 1
		double num1;
		// Número 2
		double num2;
		// Variable del cálculo suma
		double suma;
		// Variable del cálculo resta
		double resta;
		// Variable del cálculo multiplicación
		double multiplicacion;
		// Variable del cálculo división
		double division;
		// Solicito al usuario que introduzca el num1
		System.out.println("Introduzca número 1");
		// Leo de la consola el num1 que ha introducido el usuario
		num1 = reader.nextDouble();
		// Solicito al usuario que introduzca el nº 2
		System.out.println("Introduzca número 2");
		// Leo de la consola el num2 que ha introducido el usuario
		num2 = reader.nextDouble();
		// Hago el cálculo suma 
		suma = num1+num2;
		// Hago el cálculo resta
		resta = num1-num2;
		// Hago el cálculo multiplicación
		multiplicacion = num1*num2;
		// Hago el cálculo división
		division = num1/num2; //Duda de si poner Math.round(num1/num2); para que redondee
		// Imprimo el mensaje final del resultado de la suma
		System.out.println("El resultado de la suma es: "+suma);
		// Imprimo el mensaje final del resultado de la resta
		System.out.println("El resultado de la resta es: "+resta);
		// Imprimo el mensaje final del resultado de la multipicación
		System.out.println("El resultado de la multipicación es: "+multiplicacion);
		// Imprimo el mensaje final del resultado de la división
		System.out.println("El resultado de la división es: "+division);
		// Cierro Scanner (el cual tiene el nombre de reader)
		reader.close();
	}
}
