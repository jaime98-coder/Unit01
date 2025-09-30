package part02;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que tome como entrada dos números enteros e indique qué
		 * cantidad hay que sumarle para que num1 sea múltiplo de num2.
		 * 
		 */
		// Declaro las variables del número entero, el valor a sumar para que num1 sea
		// múltiplo de num2 y el resto (resultado) del módulo de num2, para ver si es múltiplo.
		int num1;
		int num2;
		int valorASumar;
		int resto;
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		// Indico al usuario que introduzca el número 1
		System.out.println("Introduce número 1");
		// Leo de la consola el valor del num1 introducido
		num1 = reader.nextInt();
		// Indico al usuario que introduzca el número 1
		System.out.println("Introduce número 2");
		// Leo de la consola el valor del num1 introducido
		num2 = reader.nextInt();
		// Asigno a resto el valor del calculo del módulo
		resto = num1 % num2;
		// Creo el condicional ternario para darle un valor a la variable valorASumar, y conocer cuanto hay que sumarle
		valorASumar = resto == 0 ? 0 : num2 - resto;
		// Imprimo el mensaje final indicando cuanto es el valor a sumar al num1 para que sea múltiplo del num2
		System.out.println("El valor a sumar al num1 para que sea múltiplo del num2 es: " + valorASumar);
		// Cierro el Scanner
		reader.close();
	}

}
