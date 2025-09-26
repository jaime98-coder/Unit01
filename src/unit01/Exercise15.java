package unit01;

import java.util.Scanner;

public class Exercise15 {
	/*
	 * Escribe un programa en el que declares una constante IVA de valor igual a 21.
	 * A continuación, pídele un precio al usuario (recuerda que los precios
	 * contienen decimales) y calcula cuál será el precio final con el IVA aplicado.
	 */
	public static void main(String[] args) {
		// Pedir precio al usuario (con decimales)
		// Mostrar el precio con IVA
		//
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		// Declaramos la constante IVA
		final int IVA = 21;
		// Declaramos la variable precio
		double precio;
		// Declaramos la variable precioConIVA
		double precioConIVA;
		// Pedimos al usuario 
		System.out.println("Introduzca el precio: ");
		precio = reader.nextDouble();

		precioConIVA = precio + (precio * IVA / 100);

		System.out.println("El precio con IVA es " + precioConIVA);
		reader.close();

	}

}
