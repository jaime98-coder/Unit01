package repasoexamencasa;

import java.util.Scanner;

public class RepasoTipoExamen05 {

	public static void main(String[] args) {
		/*
		 * 
		 * INCOMPLETOOOOOOOOOOOOOO
		 * OOOOOOOOO
		 * OOOOOOOOOOOOOOOOOOOOOOOO
		 * OOOOOOOOOOOOOOOOO
		 * OOOOOOOOOOOOOOOOOOOOOOO
		 * Realiza un programa que verifique si una palabra cumple con las reglas de
		 * formato de un código de producto. Para ello, ten en cuenta lo siguiente:
		 * 
		 * Debe preguntar al usuario una categoría (un solo carácter: A, B o C)
		 * 
		 * Debe preguntar un código de producto (cadena de texto de 4 caracteres)
		 * 
		 * Las reglas de validación son:
		 * 
		 * La categoría debe ser 'A', 'B' o 'C' (en mayúsculas)
		 * 
		 * El código debe tener exactamente 4 caracteres
		 * 
		 * El primer carácter del código debe coincidir con la categoría
		 * 
		 * El código debe contener al menos un dígito numérico (0-9)
		 * 
		 * El programa debe mostrar por pantalla si el código es válido o no según estas
		 * reglas.
		 * 
		 */
		char categoria;
		String codigoProducto;
		boolean longitudCorrecta;
		boolean primeraCoincide;
		boolean contieneNumero;
		boolean esValido;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce categoría (A, B o C)");
		// .charAt(0) lo que hace es leer solo el valor 0, que es el primero.
		categoria = reader.nextLine().charAt(0);
		System.out.println("Introduce un código de producto (4 caracteres)");
		codigoProducto = reader.nextLine();
		esValido = categoria.equals('A') || categoria.equals('B') || categoria.equals('C');
		int globo;
		System.out.println(globo);
		reader.close();
	}

}
