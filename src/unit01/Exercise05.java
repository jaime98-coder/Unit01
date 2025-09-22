package unit01;

import java.util.Scanner;

public class Exercise05 {
/*
 * Diseñar una aplicación que calcule la longitud y el área de
 * una circunferencia. Para ello, el usuario debe introducir
 * el radio, que puede contener decimales. Usa Math.PI para
 * tomar el valor de PI. (longitud = 2πr, área=πr2)
 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double longitudCircunferencia, areaCircunferencia, radio;
		System.out.println("Introduce el radio");
		radio=reader.nextDouble();
		longitudCircunferencia = 2 * Math.PI * radio;
		longitudCircunferencia=reader.nextDouble();
		areaCircunferencia = Math.PI * radio * 2;
		areaCircunferencia=reader.nextDouble();
		System.out.println("La longitud de la circunferencia es: "+longitudCircunferencia);
		System.out.println("La longitud de la circunferencia es: "+areaCircunferencia);
		
		
		reader.close();

	}

}
