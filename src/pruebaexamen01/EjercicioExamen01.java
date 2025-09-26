package pruebaexamen01;

import java.util.Scanner;

public class EjercicioExamen01 {

	public static void main(String[] args) {
		// Creo Scanner
		Scanner reader = new Scanner(System.in);
		// Creo variable num1
		int num1;
		// Creo variable num2
		int num2;
		// Creo variable num3
		int num3;
		// Creo variable promedio
		double promedio;
		// Solicito al usuario que introduzca num1
		System.out.println("Introduce número 1");
		// Leo de la consola el num1 introducido por el usuario
		num1 = reader.nextInt();
		// Solicito al usuario que introduzca num2
		System.out.println("Introduce número 2");
		// Leo de la consola el num2 introducido por el usuario
		num2 = reader.nextInt();
		// Solicito al usuario que introduzca num3
		System.out.println("Introduce número 3");
		// Leo de la consola el num3 introducido por el usuario
		num3 = reader.nextInt();
		// Realizo la media de las 3 notas introducidas
		promedio = (num1 + num2 + num3) / 3;
		// Imprimo mensaje final indicando la media de las 3 notas con decimales
		System.out.println("La media de tus notas es: " + promedio);
		// Cierro Scanner
		reader.close();
	}

}
