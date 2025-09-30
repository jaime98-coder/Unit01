package part02;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que tome como entrada un número entero e indique qué
		 * cantidad hay que sumarle para que sea múltiplo de 7.Por ejemplo, a 2 hay que
		 * sumarle 5 para que sea múltiplo de 7. En el caso de 13 habría que sumarle 1.
		 * Usa el operador módulo (%) para calcularlo.
		 */
		Scanner reader = new Scanner(System.in);
		/*
		 * Opción A:
		 * int numEntero;
		 * int valorASumar;
		 * System.out.println("Introduce un número entero para comprobar si es múltiplo de 7");
		 * numEntero = reader.nextInt();
		 * valorASumar = (numEntero % 7)==0 ? 0 : 7-(numEntero % 7);
		 * System.out.println("Tienes que sumarle "+valorASumar);
		 */
		
		int numEntero;
		int valorASumar;
		int resto;
		System.out.println("Introduce un número entero para comprobar si es múltiplo de 7");
		numEntero = reader.nextInt();
		resto=numEntero%7;
		valorASumar=resto==0 ? 0 : 7-resto;
		System.out.println("Tienes que sumarle "+valorASumar);
		reader.close();
	}

}
