package unit01;

import java.util.Scanner;

public class Exercise12 {
	/*
	 * Un frutero necesita calcular los beneficios anuales que obtiene de la venta
	 * de manzanas y peras. Por este motivo, es necesario diseñar una aplicación que
	 * solicite las ventas (en kilos, tanto de las peras como de las manzanas). La
	 * aplicación mostrará el importe total sabiendo que el precio del kilo de
	 * manzanas está fijado en 2,35€ y el kilo de peras en 1,95€.
	 * 
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		final double PRECIOKGMANZANAS = 2.35;
		final double PRECIOKGPERAS = 1.95;
		double kgManzanas;
		double kgPeras;
		double beneficiosAnuales;
		System.out.println("Introduzca peso (en kilos) de las manzanas");
		kgManzanas = reader.nextDouble();
		System.out.println("Introduzca peso (en kilos) de las peras");
		kgPeras = reader.nextDouble();
		beneficiosAnuales = (kgManzanas*PRECIOKGMANZANAS)+(kgPeras*PRECIOKGPERAS);
		System.out.println("Los beneficios anuales de la venta de manzanas y peras son: "+beneficiosAnuales+"€");
		
		
		reader.close();
	}

}
