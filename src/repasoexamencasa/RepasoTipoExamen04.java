package repasoexamencasa;

import java.util.Scanner;

public class RepasoTipoExamen04 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que determine si un año es bisiesto o no. Para ello, ten
		 * en cuenta lo siguiente:
		 * 
		 * Debe preguntar al usuario un año (número entero positivo)
		 * 
		 * Las reglas para determinar si un año es bisiesto son:
		 * 
		 * Debe ser divisible entre 4
		 * 
		 * Pero si es divisible entre 100, entonces también debe ser divisible entre 400
		 * 
		 * Ejemplos:
		 * 
		 * 2000 es bisiesto (divisible entre 4, 100 y 400)
		 * 
		 * 1900 no es bisiesto (divisible entre 4 y 100, pero no entre 400)
		 * 
		 * 2024 es bisiesto (divisible entre 4, pero no entre 100)
		 * 
		 * 2023 no es bisiesto (no divisible entre 4)
		 * 
		 * El programa debe mostrar por pantalla si el año es bisiesto o no.
		 * 
		 */
		int año;
		boolean esBisiesto;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce un año para saber si es bisiesto");
		año=reader.nextInt();
		esBisiesto=año%4==0 && (año%100!=0 || año%400==0);
		System.out.println(esBisiesto ? "Es bisiesto" : "No es bisiesto");
		reader.close();
		
	}

}
