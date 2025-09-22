package unit01;

import java.util.Scanner;

public class Exercise02 {
	/* Pedir al usuario su edad y mostrar
	 * la edad que tendrá el próximo año.
	 */
	public static void main(String[] args) {
		// Creo el scanner
		Scanner reader = new Scanner(System.in);
		// Declaro variables.
		int age;
		// Pido la edad al usuario
		System.out.println("Introduce tu edad actual:");
		// Leo de la consola
		age = reader.nextInt();
		// Calculo edad que tendrá el próximo año
		age = age+1;
		// Imprimo el mensaje final
		System.out.println("La edad que tendrás el año que viene es: "+age);
		
		// Scanner closed
		reader.close();

	}

}
