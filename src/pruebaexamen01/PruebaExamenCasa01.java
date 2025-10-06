package pruebaexamen01;

import java.util.Scanner;

public class PruebaExamenCasa01 {

	public static void main(String[] args) {
		// Declaro la variable del número 1
		int num1;
		// Declaro la variable del número 2
		int num2;
		// Declaro la variable del número 3
		int num3;
		// Declaro la variable de la media entre los 3 números
		double media;
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		// Solicito al usuario mediante un mensaje en pantalla que introduzca el número
		// 1 y leo de la consola el valor introducido.
		System.out.println("Introduce el número 1");
		num1 = reader.nextInt();
		// Solicito al usuario mediante un mensaje en pantalla que introduzca el número
		// 2 y leo de la consola el valor introducido.
		System.out.println("Introduce el número 2");
		num2 = reader.nextInt();
		// Solicito al usuario mediante un mensaje en pantalla que introduzca el número
		// 3 y leo de la consola el valor introducido.
		System.out.println("Introduce el número 3");
		num3 = reader.nextInt();
		// Calculo la media de los 3 números, y ya que el resultado tiene que dar con
		// decimales hago una conversión de int a double, para que salga con decimales
		// la división.
		media = (double) (num1 + num2 + num3) / 3;
		// Imprimo el mensaje final indicando la media de los 3 números (con decimales)
		System.out.println("La media de los 3 números es: " + media);
		// Cierro el Scanner
		reader.close();
	}

}
