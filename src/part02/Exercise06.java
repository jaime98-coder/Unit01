package part02;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		/*
		 * Solicita al usuario tres distancias: La primera, medida en milímetros. La
		 * segunda, medida en centímetros. La última, medida en metros. Diseña un
		 * programa que muestre la suma de las tres longitudes introducidas (medida en
		 * centímetros).
		 * 
		 * 
		 */
		// Declaro las variables de las diferentes medidas y de la suma de las 3
		// longitudes
		int milimetros;
		int centimetros;
		int metros;
		int sumaDe3Longitudes;
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		// Solicito al usuario que introduzca las diferentes medidas con sus
		// correspondientes unidades y leo de la consola los valores introducidos
		System.out.println("Introduce medida número 1 (en milímetros)");
		milimetros = reader.nextInt();
		// Cálculo de milímetros a centímetros
		milimetros = milimetros / 10;
		System.out.println("Introduce medida número 2 (en centímetros)");
		centimetros = reader.nextInt();
		System.out.println("Introduce medida número 3 (en metros)");
		metros = reader.nextInt();
		// Cálculo de metros a centímetros
		metros = metros * 100;
		// Le doy valor a la variable de la suma de las 3 longitudes (en centímetros)
		sumaDe3Longitudes = milimetros + centimetros + metros;
		// Imprimo el mensaje final de la suma en centímetros
		System.out.println("La suma de las tres longitudes en centímetros es " + sumaDe3Longitudes);
		// Cierro el Scanner
		reader.close();
	}

}
