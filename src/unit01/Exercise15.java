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
		// Solicito al usuario que introduzca el precio
		System.out.println("Introduzca el precio: ");
		// Leo de la consola el precio introducido por el usuario
		precio = reader.nextDouble();
		// Calculo el precio del producto con el IVA incluido, sumando precio + el IVA
		precioConIVA = precio + (precio * IVA / 100);
		// Imprimo en pantalla el mensaje final indiciando el precio con IVA ya incluido
		System.out.println("El precio con IVA es " + precioConIVA);
		reader.close();

	}

}
