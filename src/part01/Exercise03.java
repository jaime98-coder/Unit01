package part01;

import java.util.Scanner;

public class Exercise03 {
/* Escribir una aplicación que pida el año actual
 * y el año de nacimiento del usuario. Debe calcular su edad.
 */
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		// Declaro variables
		int añoActual,añoNacimiento,edadCalculada;
		// Pido al usuario que introduzca año actual
		System.out.println("Introduce el año actual");
		// Leo de la consola el valor introducido del año actual
		añoActual = reader.nextInt();
		// Pido al usuario que introduzca su año de nacimiento
		System.out.println("Introduce tu año de nacimiento");
		// Leo de la consola el valor introducido del año de nacimiento
		añoNacimiento = reader.nextInt();
		// Calculo la edad a partir de la variable edadCalculada
		edadCalculada=añoActual-añoNacimiento;
		// Imprimo el mensaje final
		System.out.println("Tu edad actual es: "+edadCalculada);
		// Cierro Scanner
		reader.close();
		
	}

}
