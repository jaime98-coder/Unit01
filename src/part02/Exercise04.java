package part02;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		/*
		 * Dado el siguiente polinomio de segundo grado: y=ax2+bx+c Crea un programa que
		 * pida los coeficientes a, b y c, así como el valor de x, y calcula el valor
		 * correspondiente de y.
		 * 
		 */
		// Declaro las variables de los valores a,b,c,x,y
		double a;
		double b;
		double c;
		double x;
		double y;
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		//Solicito introduzca valores de las incógnitas y leo dela consola lo que introdujo con el scanner
		System.out.println("Introduce el valor de a");
		a = reader.nextDouble();
		System.out.println("Introduce el valor de b");
		b = reader.nextDouble();
		System.out.println("Introduce el valor de c");
		c = reader.nextDouble();
		System.out.println("Introduce el valor de x");
		x = reader.nextDouble();
		// Le asigno a y los valores introducidos, y utilizo el Math.pow para elevar el número a 2.
		y = a * Math.pow(x, 2) + b * x + c;
		// Imprimo el mensaje final sustituyendo valores en el polinomio
		System.out.println("Sustituyendo valores en el polinomio");
		System.out.println("y = " + a + " * " + x + "^2 + " + b + " * " + x + " + " + c);
		// Cierro Scanner
		reader.close();
	}
}
