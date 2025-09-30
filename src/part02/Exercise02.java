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
	
		/*
		 * Opción A:
			Scanner reader = new Scanner(System.in);
		 * int numEntero;
		 * int valorASumar;
		 * System.out.println("Introduce un número entero para comprobar si es múltiplo de 7");
		 * numEntero = reader.nextInt();
		 * valorASumar = (numEntero % 7)==0 ? 0 : 7-(numEntero % 7);
		 * System.out.println("Tienes que sumarle "+valorASumar);
		 */
		// Opción B
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		// Declaro las variables del número entero, el valor a sumar para que sea múltiplo de 7
		// y el resto (resultado) del módulo de 7, para ver si es múltiplo.
		int numEntero;
		int valorASumar;
		int resto;
		// Solicito al usuario que introduzca nº entero
		System.out.println("Introduce un número entero para comprobar si es múltiplo de 7");
		// Leo el nº introducido por el usuario
		numEntero = reader.nextInt();
		// Le asigno un valor a la variable resto
		resto=numEntero%7;
		// Creo el condicional ternario para darle un valor a la variable valorASumar, y conocer cuanto hay que sumarle
		valorASumar=resto==0 ? 0 : 7-resto;
		// Imprimo mensaje final indicando cuando tiene que sumarle al nº introducido para que sea múltiplo de 7
		System.out.println("Tienes que sumarle "+valorASumar);
		reader.close();
<<<<<<< HEAD
=======

>>>>>>> branch 'master' of https://github.com/jaime98-coder/Unit01.git
	}

}
