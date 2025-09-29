package part02;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		/*
		 * La FILA (Federación Internacional de Lanzamiento de Algoritmo) realiza una
		 * competición donde cada participante escribe un algoritmo en un papel y lo
		 * lanza, ganando quien consiga lanzarlo más lejos. La peculiaridad del concurso
		 * es que la longitud del lanzamiento se mide en metros (con tantos decimales
		 * como se desee), pero para el ranking solo se tiene en cuenta la longitud en
		 * centímetros (sin decimales). Por ejemplo, para un lanzamiento de 12,3456 m,
		 * que son 1234,56 cm solo se contabilizan 1234 cm. Realiza un programa que
		 * solicite la longitud (en metros) de un lanzamiento y muestre la parte entera
		 * correspondiente en centímetros. Utiliza la conversión de tipos.
		 * 
		 * 
		 */
		// Declaro las variables de las 2 longitudes, tanto en m como en cm.
		double longitudEnMLanzamiento;
		int longitudEnCmLanzamiento;
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		// Solicito al usuario el lanzamiento en megros
		System.out.println("Introduce en metros el lanzamiento que hiciste");
		// Leo de la consola el valor introducido
		longitudEnMLanzamiento = reader.nextDouble();
		// Realizo la conversión de metros a cm, y convierto la variable de double a
		// int.
		longitudEnCmLanzamiento = (int) longitudEnMLanzamiento * 100;
		// Imprimo el mensaje final indicando el resultado del lanzamiento
		System.out.println("Tu lanzamiento fue de: " + longitudEnCmLanzamiento + " cm.");
		// Cierro el Scanner
		reader.close();

	}

}
