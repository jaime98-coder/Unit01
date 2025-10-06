package repasoexamencasa;

import java.util.Scanner;

public class RepasoTipoExamen03 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que determine si un estudiante puede acceder a una beca.
		 * Para ello, ten en cuenta lo siguiente:
		 * 
		 * Debe preguntar al usuario la nota media del expediente (número con decimales
		 * entre 0 y 10)
		 * 
		 * Debe preguntar los ingresos familiares mensuales (número entero)
		 * 
		 * Debe preguntar si tiene hermanos en el centro (true/false)
		 * 
		 * Los requisitos para obtener la beca son:
		 * 
		 * Tener una nota media mayor o igual a 8.0
		 * 
		 * Y tener ingresos familiares menores de 2000€
		 * 
		 * O tener hermanos en el centro y una nota media mayor o igual a 7.0
		 * 
		 * El programa debe mostrar por pantalla si el estudiante puede acceder a la
		 * beca o no.
		 * 
		 */
		float notaMedia;
		int ingresosFamMensuales;
		boolean hermanosEnCentro;
		boolean recibeBeca;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce la nota media del expediente");
		notaMedia=reader.nextFloat();
		System.out.println("Introduce los ingresos familiares mensuales");
		ingresosFamMensuales=reader.nextInt();
		System.out.println("¿Tienes hermanos en el centro? (true o false)");
		hermanosEnCentro=reader.nextBoolean();
		recibeBeca = (notaMedia>=8.0 && ingresosFamMensuales<2000) || (hermanosEnCentro && notaMedia>=7.0);
		System.out.println("¿Puedes acceder a la beca? "+(recibeBeca ? "SÍ":"NO"));
		reader.close();
		
	}

}
